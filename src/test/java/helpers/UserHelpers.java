package helpers;

import models.requests.CreateUserRequest;

public class UserHelpers {


    public CreateUserRequest getCreateUserRequestObject() {


//        [
//        {
//            "id":0,
//                "username":"akkk",
//                "firstName":"burcu",
//                "lastName":"akkaya",
//                "email":"jkldjslgk@gmail.com",
//                "password":"lkjaslkf",
//                "phone":"5980923805",
//                "userStatus":0
//        }
//        ]

        CreateUserRequest.CreateUserRequestBuilder builder =
                new CreateUserRequest.CreateUserRequestBuilder("kjgkd", "jkhdfsj@gmail.com");
        builder.setFirstName("kgjf");
        builder.setLastName("kjfl");
        builder.setPassword("2125");
        builder.setPhone("1224151");
        builder.setUserStatus(0);


        return builder.build();
    }




}
