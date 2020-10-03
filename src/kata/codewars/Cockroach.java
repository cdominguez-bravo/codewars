package kata.codewars;

public class Cockroach {

  /**
   * My solution
   * */
  public int cockroachSpeed(double x){
    double result = Math.floor((x * 100000)/ 3600);
    return (int) result;
  }

  /**
   * Solutions from codewars
   * */
  /** Sort by: Best Practices*/

  public int cockroachSpeed1(double kph){
    int secondsInHour = 3600;
    int cmInKm = 100000;
    int centimetresPerSecond = (int) (kph * cmInKm / secondsInHour);
    return centimetresPerSecond;
  }

  /** Sort by: Clever */
  public int cockroachSpeed2(double x){
    // Good Luck!
    return(int)(x*250/9);
  }


}
