package unitTest;


import helpers.UserHelpers;
import models.requests.CreateUserRequest;
import org.apache.juneau.json.JsonSerializer;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class JsonSerializerTest {

    @Test
    public void testUnit() {
        UserHelpers helpers = new UserHelpers();

        List<CreateUserRequest> body = new ArrayList<>();
        body.add(helpers.getCreateUserRequestObject());

        String jsonString = JsonSerializer.DEFAULT_READABLE.serialize(body);
        System.out.println(jsonString);


    }


}
