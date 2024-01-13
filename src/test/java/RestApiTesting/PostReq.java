package RestApiTesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostReq {

    @Test
    public void PostReq(){
        String rbody = """
{
  "description": "Devlabs Coffee Demo",
  "name": "Devlabs Coffee"
}
    """;
        System.out.println(rbody);

        RestAssured.baseURI = "http://tosca-webservice-ng.azurewebsites.net";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                //header
                .and()
                .body(rbody)
                .when()
                .post("/api/Coffees_V4")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

    }
}
