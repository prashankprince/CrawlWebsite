package com.pm.crawler;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class WebCrawlerWithDepthTest extends TestCase {
	
	 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
/*    public AppTest( String testName )
    {
        super( testName );
    }
*/
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( WebCrawlerWithDepthTest.class );
    }

    /**
     * Rigourous Test :-)
     */

    public void testWeb()
    {
    	//new WebCrawlerWithDepth().getPageLinks("http://www.redhat.com", 0, "Redhat");
        assertTrue( true );
    }

}
