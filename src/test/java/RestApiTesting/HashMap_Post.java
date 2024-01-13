package RestApiTesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

public class HashMap_Post {
    @Test
    public void PostReq(){
        HashMap hashMap = new HashMap();
        hashMap.put("Description","Hello Coffeeeeee");
        hashMap.put("Name","Helo Cafe");
        JSONObject jsonObject = new JSONObject(hashMap);


        RestAssured.baseURI = "http://tosca-webservice-ng.azurewebsites.net";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                //header
                .and()
                .body(jsonObject.toString())
                .when()
                .post("/api/Coffees_V4")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
    }


    @Test
    public void PostReqwitJSONObj(){
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("Description","Hello Coffeeeeee");
        jsonObject.put("Name","Helo Cafe");


        RestAssured.baseURI = "http://tosca-webservice-ng.azurewebsites.net";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                //header
                .and()
                .body(jsonObject.toString())
                .when()
                .post("/api/Coffees_V4")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());
    }
}
