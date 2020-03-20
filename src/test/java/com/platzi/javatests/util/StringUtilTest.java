package com.platzi.javatests.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    /*@Test
    public void testRepeat (){
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola",3));
        Assert.assertEquals("hola",StringUtil.repeat("hola",1));
    }*/

    @Test
    public void string_is_null(){
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_is_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void string_only_has_space(){
        assertTrue(StringUtil.isEmpty(" "));
    }

    @Test
    public void string_is_not_empty(){
        assertFalse( StringUtil.isEmpty(" abc"));
    }
}