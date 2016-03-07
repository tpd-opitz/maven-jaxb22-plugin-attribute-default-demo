package com.opitzconsulting.tpd.attribute.defaultdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JaxbGenerationElementDefaultTest {

    @Test
    public void testDefaultForIntegerAttribute__freshInstance__returnes42() {
        Demo demo = new Demo();
        assertEquals("parameterSectionCrcByteSizeDecimal", Integer.valueOf(42), demo.getTest());
    }

}
