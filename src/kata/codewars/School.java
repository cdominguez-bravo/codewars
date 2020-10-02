package kata.codewars;

import java.util.stream.IntStream;

public class School {

  /**
   * My Solution
   * */
  public static int getAverage(int[] marks){
    int avg = 0;
    for (int i= 0; i < marks.length; i++){
      avg += marks[i];
    }
    return avg / marks.length;
  }

  public static void main(String[] args) {
    int[] myArray = {2,2,3,3,8,8,11,25};

    System.out.println(getAverage(myArray));
  }

  /***
   * Solutions from codewars.com */

  /**Sort By: Best Practices**/

  public static int getAverage1(int[] marks){
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }

    return sum / marks.length;
  }

  /**Sort By: Clever**/

  public static int getAverage2(int[] marks){
    return (IntStream.of(marks).sum())/marks.length;
  }

}
