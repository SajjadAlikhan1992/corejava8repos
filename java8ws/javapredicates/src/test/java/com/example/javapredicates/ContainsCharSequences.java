package com.example.javapredicates;

import org.junit.Assert;
import org.junit.Test;

public class ContainsCharSequences {

    String defaultString = "Hello Java Developer";

    @Test
    public void test_CharSequence() {

        Assert.assertEquals(true, defaultString.contains("Hello"));

    }

    @Test
    public void test_Char_failure_scen() {
        Assert.assertEquals(false, defaultString.contains(" "));
    }
}
