package factoryRequest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestPOST implements iRequest{
    @Override
    public Response send(RequestInformation requestInformation) {
        Response response = given()
                    .header("Token",requestInformation.getToken())
                    .body(requestInformation.getBody())
                    .log().all()
                .when()
                    .post(requestInformation.getUrl());
        response.then().log().all();
        return response;
    }
}
