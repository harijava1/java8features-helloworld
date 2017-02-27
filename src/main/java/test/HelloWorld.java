package test;

import java.util.stream.Stream;

public class HelloWorld {

    public static void main(String... args) {
        Greeting greet = message -> System.out.println("Hello " + message + "!");
        if(args == null || args.length == 0) {
            greet.getMessage("World");
        } else {
            Stream.of(args).forEach(x -> greet.getMessage(x));
        }
    }
}
