package user;

import user.model.User;

public class UserAppl {
    public static void main(String[] args) {
        User user1 = new User("username@male.com", "Repsik%54321");
        System.out.println(user1);
    }
}
