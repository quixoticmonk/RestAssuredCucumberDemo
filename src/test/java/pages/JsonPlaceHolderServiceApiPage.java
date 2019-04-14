package pages;

import com.jayway.restassured.response.Response;
import utilitlies.LoggerUtil;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class JsonPlaceHolderServiceApiPage {
    private static String url;
    private static String getUrl;

    public void captureUrl(String urlInput){
        url=urlInput;
    }

    public void captureGetUrl(String getUrlInput){
        getUrl=getUrlInput;
        url=url+"/"+getUrl;
    }

    public void submitGetRequest(String keyInput, String valueInput){

        Response jsonResponse=given()
                .headers("Content-Type","application/json")
          .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
          .then()
                .statusCode(200)
                .body("userId",is(equalTo(1)))
                .extract()
                .response();
        LoggerUtil.info(jsonResponse.toString());
    }



}
