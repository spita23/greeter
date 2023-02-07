package is.hi.bst4.hbv202g.ass3.frontend;

import is.hi.bst4.hbv202g.ass3.backend.Greeter;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.setEnglish();
        System.out.println(greeter.greet());
        greeter.setGerman();
        System.out.println(greeter.greet());
    }

}
