package kata.codewars;

public class SolutionMultiples35 {

  public int solution(int number) {

      int sumAllMultiples = 0;

      for (int i =0; i <number; i++){

        if(i % 3 == 0 ){
          sumAllMultiples += i;
        }

        if(i % 5 == 0 ){
          sumAllMultiples += i;
        }

        if(i % 3 == 0 && i % 5 == 0){
          sumAllMultiples = sumAllMultiples - i;
        }

        System.out.println("sumAllMultiples "+ sumAllMultiples);
      }
      return sumAllMultiples;
  }

  public static void main(String[] args) {
    SolutionMultiples35 sm = new SolutionMultiples35();
    System.out.println(sm.solution(10));

  }


}
