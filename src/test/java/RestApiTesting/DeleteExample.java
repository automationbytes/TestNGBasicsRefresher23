package RestApiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DeleteExample {

    @Test
    public void DeletReq(){
        RestAssured.baseURI = "http://tosca-webservice-ng.azurewebsites.net";

        //Given = pre condition - header = auth
        //when - what to perform - body, method
        //then - outcome

        Response response = RestAssured
                .given()
                .when()
                .delete("/api/Coffees_V4/9")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
    }

}
