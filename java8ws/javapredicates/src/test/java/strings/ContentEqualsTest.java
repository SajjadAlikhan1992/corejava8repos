package strings;

import org.junit.Assert;
import org.junit.Test;

public class ContentEqualsTest {


    @Test
    public void testContentEquals(){

        String s1="Hello";
        StringBuffer sb=new StringBuffer("Hello");

        Assert.assertEquals(true,s1.contentEquals(sb));

        //return

    }

}
