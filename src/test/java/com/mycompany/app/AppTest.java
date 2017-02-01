package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array, 4, 4));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 10, 2));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 2, 2));
    }

    public void testNull() {
      assertFalse(new App().search(null, 5, 5));
    }

    public void oneNegative(){
	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(23,69,31,-81));
	assertTrue(new App().search(array, -81, 1));
    }
    public void twoNegatives(){
	ArrayList<Integer> array = new ArrayList<>(Arrays.asList(23,1,66,90));
	assertTrue(new App().search(array, -9, -9));
    }


}
