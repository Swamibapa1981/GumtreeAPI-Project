package Com.GumtreeAPI;

import io.restassured.RestAssured;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class URL {
    public static void URL1()throws IOException {
        Properties Pro=new Properties();
        FileInputStream fil=new FileInputStream("src\\test\\java\\Com\\GumtreeAPI\\env.properties");
        Pro.load(fil);
        RestAssured.baseURI=Pro.getProperty("HOST");
    }
}
