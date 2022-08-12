package models.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateUserResponse {

    private int code;
    private String type;
    private String message;

}
