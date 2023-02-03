import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter number of lines: ");
       String line = s.nextLine();
       for(int i = 0; i < Integer.parseInt(line); i++) {
           System.out.print("Enter the number on this line: ");
           String num = s.nextLine();
           int size = Integer.parseInt(num.substring(0,1));
           String[] newLine = new String[size];
           for(int j = 0; j < newLine.length; i++){
               newLine[j] = num.substring()
           }
       }
       /*System.out.print("Enter the number of queries: ");
       int numq = s.nextInt();
       for(int i = 0; i < numq; i++){
           System.out.print("Enter query: ");
           String query = s.nextLine();
           String x = query.substring(0,1);
       }

        */
    }
}