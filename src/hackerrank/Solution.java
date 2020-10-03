package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  // Complete the camelcase function below.
  static int camelcase(String s) {
  int counter = 0;

    for(int i = 0; i < s.length(); i++) {
      Character ch = s.charAt(i);
      if(Character.isUpperCase(ch)){
        counter++;
      }
      System.out.println("counter " +counter);
    }
return counter + 1;
  }


  public static void main(String[] args) {
    System.out.println(camelcase("thisIsMyStoryIncredible"));
  }
}
