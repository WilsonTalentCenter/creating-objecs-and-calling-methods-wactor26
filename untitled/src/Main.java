import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


// create a Date object called currentDate  using the default constructor with no parameters
    Date currentDate = new Date();
        // create a Date object called anotherDate  using the default constructor with no parameters
    Date anotherDate = new Date();
        // call the "toString" method on anotherDate and put it into a string variable called anotherDateString
        String anotherDateString = anotherDate.toString();
        // call the "setTime" method for anotherDate passing in 123478 as its input.
    anotherDate.setTime(123478);

    // call the "before" method on currentDate passing in anotherDate  put the returned value into a boolean variable called isBefore.
    boolean isBefore = currentDate.before(currentDate);
        // print the value of isBefore followed by a newline character
        System.out.println(isBefore);
////////////////
        //create a Scanner object called myScanner,  pass in System.in to as the parameter to the constructor
        Scanner myScanner = new Scanner(System.in);
        //call the "nextLine" method on the myScanner object save the result into a string variable called resString
        String resString = myScanner.nextLine();
        //print resString followed by a newline character
        System.out.println(resString);
        //call the "next" method on the myScanner object saving the result into resString
        resString = myScanner.next();
        //print resString followed by a newline character
        System.out.println(resString);


    }

}