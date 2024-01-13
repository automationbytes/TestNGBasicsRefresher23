package RestApiTesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.hasItem;

public class GetReq {

    @Test
    public void getReq(){
        RestAssured.baseURI = "http://tosca-webservice-ng.azurewebsites.net";

        //Given = pre condition - header = auth
        //when - what to perform - body, method
        //then - outcome

        Response response = RestAssured
                .given()
                .when()
                .get("/api/Coffees_V4")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
    }


    @Test
    public void getReqwitAssert(){
        RestAssured.baseURI = "http://tosca-webservice-ng.azurewebsites.net";

        //Given = pre condition - header = auth
        //when - what to perform - body, method
        //then - outcome

       RestAssured
                .given()
                .when()
                .get("/api/Coffees_V4")
                .then()
                .assertThat()
               .body("name",hasItem("Cappuccino"));

    }

}
