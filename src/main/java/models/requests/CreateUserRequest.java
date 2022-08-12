package models.requests;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateUserRequest {

    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private int userStatus;


    public CreateUserRequest(CreateUserRequestBuilder builder) {
        this.id = builder.getId();
        this.username = builder.getUsername();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.email = builder.getEmail();
        this.password = builder.getPassword();
        this.phone = builder.getPhone();
        this.userStatus = builder.getUserStatus();
    }

    @Getter
    @Setter
    public static class CreateUserRequestBuilder {
        private int id;
        private String username;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String phone;
        private int userStatus;

        public CreateUserRequestBuilder(String username, String email) {
            /*
             * Compulsory fields.
             */
            this.username = username;
            this.email = email;
        }

        public CreateUserRequest build() {
            return new CreateUserRequest(this);
        }

    }

}
