package dev.ranieri.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTests {

    @Test
    void test_1(){
        System.out.println("passed");
    }

    @Test
    void test_2(){
        Assertions.assertEquals(true,false);
    }
}
