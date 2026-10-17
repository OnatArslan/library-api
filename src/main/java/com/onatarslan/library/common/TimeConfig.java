package com.onatarslan.library.common;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Clock;
import java.time.ZoneId;

@Configuration
@EnableConfigurationProperties(CommonProperties.class)
public class TimeConfig {


    @Bean
    Clock clock() {
        return Clock.system(ZoneId.of("Europe/Istanbul"));
    }

}
