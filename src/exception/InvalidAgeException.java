/**
 * .Write a program to accept name and age of a person from the command prompt
 * (passed as arguments when you execute the class) and ensure that the age entered
 * is >=18 and < 60. Display proper error messages. The program must exit gracefully after
 * displaying the error message in case the arguments passed are not proper.
 * (Hint : Create a user defined exception class for handling errors.)
 */

package exception;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
    super(message);
    }
}



