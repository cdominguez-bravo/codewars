package kata.codewars;

import java.util.stream.IntStream;

public class SolutionMultiples35 {

  public int solution(int number) {

      int sumAllMultiples = 0;

      for (int i =0; i <number; i++){

        if(i % 3 == 0 || i % 5 == 0){
          sumAllMultiples += i;
        }
      }
      return sumAllMultiples;
  }

  /**Clever**/

  public int solution1(int number) {
    return IntStream.range(0, number)
        .filter(n -> (n % 3 == 0) || (n % 5 == 0))
        .sum();
  }

  public static void main(String[] args) {
    SolutionMultiples35 sm = new SolutionMultiples35();
    System.out.println(sm.solution(10));

  }


}
