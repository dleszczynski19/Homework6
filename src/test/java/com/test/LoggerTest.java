package com.test;

import com.configuration.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class LoggerTest extends TestBase {
    private static Logger log = LoggerFactory.getLogger(LoggerTest.class);
    private static Marker passed = MarkerFactory.getMarker("PASSED");

    @Test
    @DisplayName("Logger levels test")
    public void loggersTest() {
        log.error("Log Error Test");
        log.warn("Log Warn Test");
        log.info("Log Info Test");
        log.debug("Log Debug Test");
        log.trace("Log Trace Test");
        log.info(passed, "Test passed");
    }
}