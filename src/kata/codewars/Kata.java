package kata.codewars;


public class Kata {

  public int cockroachSpeed(double x){
    double result = Math.floor((x * 100000)/ 3600);
    return (int) result;
  }

  public static void main(String[] args) {
    Kata kata = new Kata();

    System.out.println(kata.cockroachSpeed(1.08));

  }

}
