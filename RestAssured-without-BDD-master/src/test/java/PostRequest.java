import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class PostRequest {
    public static void main(String[] args) {
        RestAssured.baseURI= "https://reqres.in/api/users";
        RequestSpecification requestSpecification= RestAssured.given();
        requestSpecification.body("{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"leader\"\n" +
                "}");
        requestSpecification.header("Content-Type","application/json");
        Response response= requestSpecification.post();
        response.prettyPrint();
        int statusCode= response.getStatusCode();
        Assert.assertEquals(statusCode,201);
        String statusLine= response.getStatusLine();
        Assert.assertEquals(statusLine,"HTTP/1.1 201 Created");
        JsonPath jsonPath = response.jsonPath();
      String name=  jsonPath.getString("name");
        Assert.assertEquals(name, "morpheus");




    }
}
