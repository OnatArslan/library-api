package com.onatarslan.library.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.time.LocalDate;

@Component
public class StartupLogger implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(StartupLogger.class);

    private final CommonProperties properties;
    private final Clock clock;

    public StartupLogger(CommonProperties properties, Clock clock) {
        this.properties = properties;
        this.clock = clock;
    }

    @Override
    public void run(ApplicationArguments args) {
        log.info("Loan period: {} days, today: {} ({})",
                properties.periodDays(), LocalDate.now(clock), clock.getZone());
    }
}
