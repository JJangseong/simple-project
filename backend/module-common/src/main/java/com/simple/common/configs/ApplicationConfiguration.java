package com.simple.common.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * Created by marathoner on 2021/07/16.
 */
@Configuration
@ComponentScans({
        @ComponentScan(basePackages = {ApplicationConfiguration.COMPONENT_SCAN_PATH}),
        @ComponentScan(basePackages = {ApplicationConfiguration.MAPPER_SCAN_PATH})
})
public class ApplicationConfiguration {
    static final String COMPONENT_SCAN_PATH = "com.simple.common.configs.components";
    static final String MAPPER_SCAN_PATH = "com.simple.mappers";
}
