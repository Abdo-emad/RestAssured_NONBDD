import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetWithQueryParams {
    public static void main(String[] args) {
        RestAssured.baseURI= "https://reqres.in/api/users";
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.queryParams("page","2");
        Response response = requestSpecification.get();
        response.prettyPrint();
    }
}
