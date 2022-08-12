package testCases;

import helpers.UserHelpers;
import models.requests.CreateUserRequest;
import models.response.CreateUserResponse;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ReaderParser;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class TestCase extends BaseTest {


    @Test
    public void userWithParametersTest() {

        UserHelpers helpers = new UserHelpers();

        List<CreateUserRequest> body = new ArrayList<>();
        body.add(helpers.getCreateUserRequestObject());

        String jsonString = JsonSerializer.DEFAULT_READABLE.serialize(body);

        String response = request.body(jsonString).when().post().then().extract().response().asString();

        System.out.println(response);

        ReaderParser parser = JsonParser.DEFAULT;
        CreateUserResponse resp = parser.parse(response, CreateUserResponse.class);
        System.out.println(resp.getCode());
    }
}
