/***
Problem Statement
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
Complete the given code so that it outputs the area of a parallelogram with breadth B and height H.
You should read the variables from the standard input.
If B <= 0 or H <= 0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format:
There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Output Format:
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
***/

import java.io.*;
import java.util.*;

public class Java_Static_Initializer_Block {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { 
      // More information on BufferedReader vs Scanner can be found here - https://stackoverflow.com/questions/2231369/scanner-vs-bufferedreader
      int B = Integer.parseInt(br.readLine());
      int H = Integer.parseInt(br.readLine());

      if (B <= 0 || H <= 0) {
        throw new Exception("Breadth and height must be positive");
      }

      int area = B * H;
      System.out.print(area);
    } catch (Exception e) {
      System.out.println(e.getClass().getName() + ": " + e.getMessage());
    }
  }
}
