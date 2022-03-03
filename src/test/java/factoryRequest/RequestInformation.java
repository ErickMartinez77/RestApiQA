package factoryRequest;

public class RequestInformation {
    private String url;
    private String body;
    private String token;

    public RequestInformation(){}

    public String getUrl() {
        return url;
    }

    public RequestInformation setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBody() {
        return body;
    }

    public RequestInformation setBody(String body) {
        this.body = body;
        return this;
    }

    public String getToken() {
        return token;
    }

    public RequestInformation setToken(String token) {
        this.token = token;
        return this;
    }
}
