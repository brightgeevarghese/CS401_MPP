package lesson11.optional_examples;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //1. How to create an empty Optional object? (Optional object is empty)

        Optional<String> optionalString = Optional.empty();//
        System.out.println(optionalString);
        //check whether it is empty or not
        System.out.println(optionalString.isEmpty());//true
        System.out.println(optionalString.isPresent());//false bcoz it is empty
//        System.out.println(optionalString.get());
//        optionalString.ifPresent(System.out::println);

        //2. Create a non-empty Optional object
        Optional<User> optionalUser = Optional.of(new User("Tom"));
        System.out.println(optionalUser.isEmpty());//false
        System.out.println(optionalUser.isPresent());//true

//        optionalUser.ifPresent(System.out::println);//It prints a User object
        //OR
//        if (optionalUser.isPresent()) {
//            System.out.println(optionalUser.get());
//        }

//        String s = optionalString.orElse(getName());
//        System.out.println(s);

//        User myUser = optionalUser.orElse(getNewUser());

        User myUser2 = optionalUser.orElseGet(() -> getNewUser());
        System.out.println(myUser2);
    }

    public  static User getNewUser() {
        System.out.println("getNewUser() is called");
        return new User("guest");
    }

    static String getName() {
        System.out.println("getName() is called");
        return "guest";
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
