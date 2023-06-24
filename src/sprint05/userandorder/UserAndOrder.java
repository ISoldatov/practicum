package sprint05.userandorder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAndOrder {
    public static void main(String[] args) {
        Map<User, List<String>> userOrders = new HashMap<User, List<String>>();

        userOrders.put(
                new User(97457, "Джо", "joe@black.com"),
                List.of("1928873467463")
        );
        userOrders.put(
                new User(29575, "Лиз", "liz@black.com"),
                List.of(
                        "9828674982082",
                        "7249804867520"
                )
        );
        userOrders.put(
                new User(57860, "Ян", "yan@black.com"),
                List.of("4758039927678")
        );

        System.out.println("Заказы: " + userOrders);
    }
}

class User {
    Integer id;
    String name;
    String email;

    public User(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "User " + id + "(" + name+")";
    }
}
