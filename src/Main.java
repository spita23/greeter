package src;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.setEnglish();
        System.out.println(greeter.greet());
        greeter.setGerman();
        System.out.println(greeter.greet());
    }

}
