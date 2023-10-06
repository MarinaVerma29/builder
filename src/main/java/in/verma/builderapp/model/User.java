
package in.verma.builderapp.model;

public class User {
    private final Long id;
    private final String login;
    private final StringBuilder password;
    private final int age;

    private User(Builder builder) {
        this.id = builder.id;
        this.login = builder.login;
        this.password = builder.password;
        this.age = builder.age;
    }

    public static class Builder {
        private Long id;
        private String login;
        private StringBuilder password;
        private int age;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }
        public Builder withLogin(String login) {
            this.login = login;
            return this;
        }
        public Builder withPassword(StringBuilder password) {
            this.password = password;
            return this;
        }
        public Builder withAge(int age) {
            this.age = age;
            return this;
        }
    }
    public User build() {
        return User.this;
    }
}
