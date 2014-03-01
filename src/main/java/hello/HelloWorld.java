package hello;

import org.joda.time.LocalTime;

/**
 * Created with IntelliJ IDEA.
 * User: serge
 * Date: 2/16/14
 * Time: 11:20 PM
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}

