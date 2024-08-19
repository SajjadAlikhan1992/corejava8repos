package com.example.javapredicates;

import org.junit.Assert;
import org.junit.Test;

public class ConcatingTwoString {

    String firstName = "Sajjad Alikhan";
    String lastName = "Navab";

    public String fullName() {
        return firstName.concat(" ").concat(lastName);
    }

    @Test
    public void testConcatination_Success() {
        Assert.assertEquals("Sajjad Alikhan Navab", this.fullName());
    }

    @Test
    public void testConcatination_Failure() {
        Assert.assertEquals("Sajjad Alikhan ", this.fullName());
    }

}
