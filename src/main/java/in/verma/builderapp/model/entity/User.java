
package in.verma.builderapp.model.entity;

public class User {
    private Long id;
    private String login;
    private StringBuilder password;
    private int age;

    private User() {
    }

    public static Builder newBuilder() {
        return new User().new Builder();
    }

    public class Builder {

        private Builder() {

        }

        public Builder setId(Long id) {
            User.this.id = id;
            return this;
        }

        public Builder setLogin(String login) {
            User.this.login = login;
            return this;
        }

        public Builder setPassword(StringBuilder password) {
            User.this.password = password;
            return this;
        }

        public Builder setAge(int age) {
            User.this.age = age;
            return this;
        }

        public User build() {
            return User.this;
        }
    }
}
