package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoggerTestSuite {

    @Test
    void getLastLogTest() {
        //Having
        Logger logger = Logger.INSTANCE;
        //When
        logger.log("I am the last log");
        logger.log("No, I am the last log");
        logger.log("Hi, I am really the last log");
        //Then
        Assertions.assertEquals("Hi, I am really the last log", logger.getLastLog());
    }
}
