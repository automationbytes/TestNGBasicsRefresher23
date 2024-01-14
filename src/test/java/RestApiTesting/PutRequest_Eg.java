package RestApiTesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PutRequest_Eg {

    @Test
    public void putReq(){
        String rbody = """
                {
                    "description": "Caffe Breve is an updated version.",
                    "id": 4,
                    "name": "Breve_Updated"
                  },
                """;

        System.out.println(rbody);

        RestAssured.baseURI = "http://tosca-webservice-ng.azurewebsites.net";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                //header
                .and()
                .body(rbody)
                .when()
                .put("/api/Coffees_V4")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

    }
}
