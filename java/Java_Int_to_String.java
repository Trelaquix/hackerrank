/*
You are given an integer n, you have to convert it into a string.
Please complete the partially completed code in the editor. If your code successfully converts n into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
n can range between -100 to 100 inclusive.
*/

import java.util.*;
import java.security.*;
public class Java_Int_to_String {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below
   //Write your code here
    /* Here are the few ways to convert int to string
    1. String s = String.valueOf(n);
    Explanation: This is the most versatile method, as it can handle not only integers but also other data types like characters, booleans, and floating-point numbers.
    Functionality: The valueOf method converts the specified value to its string representation. For integers, it converts the numerical value to its equivalent character sequence.
    Usage: This method is often preferred when you need a generic way to convert various data types to strings.
    
    2 . String s = Integer.toString(n);
    Explanation: This method is specifically designed for converting integers to strings. It offers similar functionality to valueOf but is more efficient for integer conversions.
    Functionality: The toString method converts the given integer to its string representation.
    Usage: This method is ideal when you're working exclusively with integers and want to optimize performance.

    3. String s = "" + n;
    Explanation: This is a concise and readable syntax for concatenating a string with an integer. It leverages the + operator for string concatenation.
    Functionality: The + operator automatically converts the integer to a string before concatenating it with the empty string.
    Usage: This method is suitable when you need to quickly concatenate an integer with other strings in a single expression.

    Key Differences:
    Efficiency: Integer.toString(n) is generally slightly more efficient than String.valueOf(n) for integer conversions due to its specialization.
    Versatility: String.valueOf(n) can handle a wider range of data types.
    Readability: "" + n provides a concise and readable syntax for concatenation.
    Choosing the Right Method:

    If you need a generic method for converting various data types to strings, use String.valueOf(n).
    If you're working exclusively with integers and want to optimize performance, use Integer.toString(n).
    If you need to concatenate an integer with other strings in a single expression, use "" + n.
    */
    String s = String.valueOf(n);
   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {

  private static final long serialVersionUID = 1;
 }

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}
