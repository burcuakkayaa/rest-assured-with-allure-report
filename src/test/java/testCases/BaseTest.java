package testCases;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import utils.Constants;

import static utils.Constants.BASE_URL;

public class BaseTest {


    protected RequestSpecification request;


    @BeforeTest
    public void initialize() {


        request = RestAssured.given()
                .baseUri(BASE_URL)
                .basePath(Constants.USER_PATH_PARAMS.CREATE_NEW_ARRAY)
                .contentType(ContentType.JSON)
                .filter(new AllureRestAssured())
                .auth().none()
                .log()
                .all();

    }
}
