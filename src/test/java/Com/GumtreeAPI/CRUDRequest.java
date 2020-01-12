package Com.GumtreeAPI;


import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class CRUDRequest {
    public static void getdataforid2() {
        Response res = given().
                       when().get("users?id=2").
                       then().assertThat().statusCode(200).extract().response();
        String responseinString = res.asString();
       // System.out.println(responseinString);

        JsonPath JS = new JsonPath(responseinString);
        String email=JS.getString("email");
        System.out.println(email);

    }
    public static void associatedposts() {
        Response response = given().
                            when().get("posts?usersId=2").
                            then().assertThat().statusCode(200).extract().response();
        String Responseinstring1 = response.asString();
        // System.out.println(Responseinstring1);
        JsonPath JS1 = new JsonPath(Responseinstring1);
        String posts = JS1.getString("title");
        System.out.println(posts);
        String PostID = response.asString();
        System.out.println(PostID);
    }
    public static void postbyUser(){
        Response response1=given().contentType(ContentType.JSON).
                           when().body(Payload.Userpayload()).put("user2/post");
        response1.prettyPrint();
        Assert.assertEquals(500,response1.getStatusCode());
        response1.then().assertThat().statusCode(500);
    }

}
