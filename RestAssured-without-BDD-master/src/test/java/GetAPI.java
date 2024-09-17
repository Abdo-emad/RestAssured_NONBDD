import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAPI {
    public static void main(String[] args) {
       RestAssured.baseURI= "https://reqres.in/api/users/2";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.get();
        response.prettyPrint();

    }
}
