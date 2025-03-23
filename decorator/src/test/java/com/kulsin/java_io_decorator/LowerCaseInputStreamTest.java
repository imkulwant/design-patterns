package com.kulsin.java_io_decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

class LowerCaseInputStreamTest {

    @Test
    void test() throws IOException {
        String testContent = "HELLO WORLD! This Is A Test.";
        String expectedOutput = "hello world! this is a test.";

        InputStream inputStream = new LowerCaseInputStream(
                new BufferedInputStream(
                        new ByteArrayInputStream(testContent.getBytes())
                )
        );

        String result = new String(inputStream.readAllBytes());

        Assertions.assertEquals(expectedOutput, result);

    }
}