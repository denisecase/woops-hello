package woops.hello;
import woops.hello.denisecase.DeniseCaseGreeter;

public class Greeter {
  
  public static void main(String[] args){
    System.out.println("\n=========================");
    System.out.println("Greetings!");
    System.out.println("=========================");

    System.out.println("Welcome to our NW world of OOPS!");
    System.out.println("Did you know there are 51 billion JVMs?");
    System.out.println("That's more than 6 for each of us.");
    System.out.println("Code for the JVM can be written in Java, Scala, Groovy, Kotlin, and more.");
    System.out.println("Let me introduce to a few of my developer friends.");

    // Denise Case - add your code below

    System.out.println("\n=========================");
    System.out.println("Dr. Case: ");
    System.out.println("=========================");
    System.out.println(DeniseCaseGreeter.getGreeting());

  }
}
