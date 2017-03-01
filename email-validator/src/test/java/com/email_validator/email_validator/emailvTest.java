package com.email_validator.email_validator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class emailvTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public emailvTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( emailvTest.class );
    }

    public void testCheckValid()
    {
    	assertEquals(0, emailv.checkValid(" "));
    	assertEquals(1, emailv.checkValid("asda."));
    	assertEquals(2, emailv.checkValid("asd@a.com"));
    	assertEquals(1, emailv.checkValid("asda@"));
    }
    
    public void testCheckDot()
    {
    	assertEquals(1,emailv.checkDot("mybaby@google.com"));
    	assertEquals(2, emailv.checkDot("crack.whippin@crackwhippin.com"));
    	assertEquals(0, emailv.checkDot("yuuy"));
    }
    
    /**
     * Checking for @ symbol at least once to verify checkAt().
     */
    public void testCheckAt()
    {
    	
        assertEquals(1, emailv.checkAt("@") );
        assertEquals(0, emailv.checkAt("1235"));
    }
    
    /*
     * check Starting character is a letter
     * 
     **/
    public void testCheckStartFirstLetter()
    {
    	assertTrue(emailv.checkStartLetter("hey@gmail.com"));
    	assertTrue(emailv.checkStartLetter("Hey"));
    	assertFalse(emailv.checkStartLetter("1Hey@gmail"));
    }
    /*
     * check if last 4 characters are '.com'
     */
    public void testCheckDotCom()
    {
    	assertTrue(emailv.checkDotCom("cruelpeople@hotmail.com"));
    	assertFalse(emailv.checkDotCom("cruelpeople@hotmail.ca"));
    }
    
    /*
     * Checks all 5 cases of the checkAllTests 
     * 
     */
    public void testAllTests()
    {
    	assertTrue(emailv.checkAllTests("HelloWorld@hottie.com"));
    	assertFalse(emailv.checkAllTests("1OhHay@hottmail.com"));
    	assertFalse(emailv.checkAllTests("ohCarp@hotmail.ca"));
    	assertFalse(emailv.checkAllTests("helloworld@hotmailcom"));
    	assertFalse(emailv.checkAllTests("ohHeyhotmail.com"));
    }
    
}
