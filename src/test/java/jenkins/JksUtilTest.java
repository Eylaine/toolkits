package jenkins;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Time   : 2020/1/4 0:47
 * Author : Eylaine
 * File   : JksUtilTest.java
 */

public class JksUtilTest {

    @Test
    public void testScrape() throws IOException {
        String url = "http://localhost:8088";
        String user = "admin";
        String password = "admin";
        JksUtil jksUtil = new JksUtil();
        System.out.print(jksUtil.scrape(url, user, password));
    }
}