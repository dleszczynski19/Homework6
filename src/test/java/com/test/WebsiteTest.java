package com.test;

import com.configuration.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class WebsiteTest extends TestBase {
    private static Logger log = LoggerFactory.getLogger(WebsiteTest.class);
    private static Marker passed = MarkerFactory.getMarker("PASSED");


    @ParameterizedTest(name = "Test - " + " {0}")
    @CsvFileSource(resources = "/data.csv")
    @Tag("Regression")
    @DisplayName("Website title test")
    public void websiteTitleTest(String websiteAddress, String expectedTitle) {
        driver.get("https://" + websiteAddress);
        String siteTitle = driver.getTitle();
        log.info("Website url: " + websiteAddress);
        log.info("Expected url title: " + expectedTitle);
        log.info("Got url title: " + siteTitle);
        assertThat("Wrong title!", siteTitle, equalTo(expectedTitle));
        log.info(passed, "Test passed");
    }
}