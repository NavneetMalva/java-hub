package designpattern.creationaldesign.builderdesign;

class User {
  private final String id;
  private final String name;
  private final String email;

  private User(UserBuilder builder) {
    this.id = builder.id;
    this.name = builder.name;
    this.email = builder.email;
  }


  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        '}';
  }

  // Inner class
  static class UserBuilder {
    private String id;
    private String name;
    private String email;

    public UserBuilder() {
    }

    public UserBuilder setId(String id) {
      this.id = id;
      return this;
    }

    public UserBuilder setName(String name) {
      this.name = name;
      return this;
    }

    public UserBuilder setEmail(String email) {
      this.email = email;
      return this;
    }

    public User build() {
      User user = new User(this);
      return user;
    }
  }

}

public class BuilderDesignEx02 {
  public static void main(String[] args) {
    User user = new User.UserBuilder()
        .setId("ID01")
        .setName("Test User")
        .setEmail("email@gmail.com")
        .build();
    System.out.println(user);
  }
}
