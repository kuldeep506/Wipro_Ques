package exception;

public class Main {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        try {
            if (age >= 18 || age < 60) {
                throw new InvalidAgeException("invalid age");
            }
            System.out.println("name: " + name
                    + " age: " + age);
        } catch (InvalidAgeException e) {
            System.out.println((e));
        }
    }
}
