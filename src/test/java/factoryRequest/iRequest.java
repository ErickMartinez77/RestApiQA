package factoryRequest;

import io.restassured.response.Response;

public interface iRequest {
    Response send(RequestInformation requestInformation);
}
