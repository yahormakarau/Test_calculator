package com.it_academy.practice.junit_basics;

import org.apache.commons.lang3.RandomStringUtils;

public class ArrayListItems {
    public void givenUsingApache_whenGeneratingRandomAlphabeticString_thenCorrect() {
        String generatedString = RandomStringUtils.randomAlphabetic(10);

        System.out.println(generatedString);
    }
}
