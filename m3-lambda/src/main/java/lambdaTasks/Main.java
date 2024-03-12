package lambdaTasks;

public class Main {

    public static void main(String[] args) {

        String name = "Enes";
        MyInterface myInterface = (x) -> {
            System.out.println("Hello world");
            System.out.println("It is a nice day " + x);
        };

        myInterface.message(name);
    }
}
