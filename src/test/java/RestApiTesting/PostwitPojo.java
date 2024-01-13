package RestApiTesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import io.restassured.mapper.ObjectMapper;

public class PostwitPojo {
    @Test
    public void PostReq(){
        POJOResponse pojoReqBdy = new POJOResponse();
        pojoReqBdy.setDescription("Pojo Class Coffee");
        pojoReqBdy.setName("POJO Coffee");

        RestAssured.baseURI = "http://tosca-webservice-ng.azurewebsites.net";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                //header
                .and()
                .body(pojoReqBdy)
                .when()
                .post("/api/Coffees_V4")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

    }
}
