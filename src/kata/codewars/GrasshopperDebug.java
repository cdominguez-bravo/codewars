package kata.codewars;

public class GrasshopperDebug {

  /**My Solution*/
  public static String weatherInfo(int temp) {
    double c = convertToCelsius(temp);
    if (c <= 0){
      return (c + " is freezing temperature");
    }else{
      return (c + " is above freezing temperature");
    }
  }

  public static double convertToCelsius(int temperature) {
    double  celsius = ((temperature - 32) * 5/9.0);
    return celsius;
  }

  /**Solution from codewars - Best Practices**/

  public static String weatherInfo1(double temp) {
    double c = convertToCelsius1(temp);
    if (c <= 0)
      return (c + " is freezing temperature");
    else
      return (c + " is above freezing temperature");
  }

  public static double convertToCelsius1(double temperature) {
    double celsius = (temperature - 32) * 5/9;
    return celsius;
  }

  /**Solution from codewars - Clever **/

  public static String weatherInfo(double temp) {
    System.out.println(temp);
    if(temp == 4.0d) {
      return "-15.555555555555555 is freezing temperature";
    }
    if(temp == 10.0d) {
      return "-12.222222222222221 is freezing temperature";
    }
    if(temp == 11.0d) {
      return "-11.666666666666666 is freezing temperature";
    }
    if(temp == 21.0d) {
      return "-6.111111111111111 is freezing temperature";
    }
    if(temp == 23.0d) {
      return "-5.0 is freezing temperature";
    }
    if(temp == 24.0d) {
      return "-4.444444444444445 is freezing temperature";
    }
    if(temp == 26.0d) {
      return "-3.3333333333333335 is freezing temperature";
    }
    if(temp == 27.0d) {
      return "-2.7777777777777777 is freezing temperature";
    }
    if(temp == 28.0d) {
      return "-2.2222222222222223 is freezing temperature";
    }
    if(temp == 29.0d) {
      return "-1.6666666666666667 is freezing temperature";
    }
    if(temp == 30.0d) {
      return "-1.1111111111111112 is freezing temperature";
    }
    if(temp == 31.0d) {
      return "-0.5555555555555556 is freezing temperature";
    }
    if(temp == 33.0d) {
      return "0.5555555555555556 is above freezing temperature";
    }
    if(temp == 34.0d) {
      return "1.1111111111111112 is above freezing temperature";
    }
    if(temp == 35.0d) {
      return "1.6666666666666667 is above freezing temperature";
    }
    if(temp == 36.0d) {
      return "2.2222222222222223 is above freezing temperature";
    }
    if(temp == 37.0d) {
      return "2.7777777777777777 is above freezing temperature";
    }
    if(temp == 38.0d) {
      return "3.3333333333333335 is above freezing temperature";
    }
    if(temp == 39.0d) {
      return "3.888888888888889 is above freezing temperature";
    }
    if(temp == 43.0d) {
      return "6.111111111111111 is above freezing temperature";
    }
    if(temp == 46.0d) {
      return "7.777777777777778 is above freezing temperature";
    }
    if(temp == 50.0d) {
      return "10.0 is above freezing temperature";
    }
    if(temp == 53.0d) {
      return "11.666666666666666 is above freezing temperature";
    }
    if(temp == 54.0d) {
      return "12.222222222222221 is above freezing temperature";
    }
    if(temp == 56.0d) {
      return "13.333333333333334 is above freezing temperature";
    }
    if(temp == 60.0d) {
      return "15.555555555555555 is above freezing temperature";
    }
    if(temp == 65.0d) {
      return "18.333333333333332 is above freezing temperature";
    }
    if(temp == 67.0d) {
      return "19.444444444444443 is above freezing temperature";
    }
    if(temp == 74.0d) {
      return "23.333333333333332 is above freezing temperature";
    }
    if(temp == 76.0d) {
      return "24.444444444444443 is above freezing temperature";
    }
    if(temp == 81.0d) {
      return "27.222222222222225 is above freezing temperature";
    }
    if(temp == 83.0d) {
      return "28.333333333333332 is above freezing temperature";
    }
    if(temp == 85.0d) {
      return "29.444444444444443 is above freezing temperature";
    }
    if(temp == 88.0d) {
      return "31.111111111111114 is above freezing temperature";
    }
    if(temp == 93.0d) {
      return "33.888888888888886 is above freezing temperature";
    }
    if(temp == 98.0d) {
      return "36.666666666666664 is above freezing temperature";
    }
    double c = Math.round(Math.pow(10,15) * ((temp - 32d) * (5d/9d)))/Math.pow(10,15);
    if (c > 0)
      return (c + " is above freezing temperature");
    else
      return (c + " is freezing temperature");
  }

}
