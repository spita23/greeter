package is.hi.bst4.hbv202g.ass3.backend;

public class Greeter {

    private is.hi.bst4.hbv202g.ass3.backend.Language language = is.hi.bst4.hbv202g.ass3.backend.Language.ENGLISH;

    public void setEnglish() {
        language = is.hi.bst4.hbv202g.ass3.backend.Language.ENGLISH;
    }

    public void setGerman() {
        language = is.hi.bst4.hbv202g.ass3.backend.Language.GERMAN;
    }

    public String greet() {
        switch (language) {
            case ENGLISH:
                return "Hello world!";
            case GERMAN:
                return "Hallo Welt!";
            default:
                return "UNKOWN LANGUAGE";
        }
    }
}
