package utils.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;
import org.json.JSONObject;
import pojo.Login;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by semvv on 13/02/2019.
 */
@Log4j
public class Main {
    public static void main(String[] args) {
        Login l = new Login("web", "1", "5", "autobta", "1", "chrome", "71.0.3578", "Windows 7", "180");
       // BasicConfigurator.configure();
        JSONObject requestBody = new JSONObject(l);
        System.out.println("l =  " + l);

        Response r = resp(requestBody, "login");

        System.out.println("===================");
        System.out.println("response " + r.getBody().asString());

        System.out.println(getData(r, "sessionToken"));
        System.out.println(getData(r, "errorInfo.error"));
        System.out.println(getData(r, "errorInfo.errorText"));
        System.out.println(getData(r, "clientToSupportList.clientId"));
        System.out.println(getData(r, "clientToSupportList.active"));
        System.out.println(getData(r, "clientToSupportList.taxIdNumber"));
        System.out.println(getData(r, "login"));
        System.out.println("=================");
    }

    public static Response resp(JSONObject requestBody, String method ) {
        RestAssured.useRelaxedHTTPSValidation();
        System.out.println("requestBody  " + requestBody);

        return RestAssured.given().header("Content-Type", "application/json").body(requestBody.toString()).post("https://192.168.253.168:8743/ibservices/session/" + method);
    }

    public static String getData(Response r, String data) {
        return r.jsonPath().get(data).toString();
    }
}
