package kata.codewars;

public class KeepHydrated {

  public int Liters(double time)  {
    return (int)Math.floor(time * 0.5);
  }

  public static void main(String[] args) {
    KeepHydrated kh = new KeepHydrated();
    System.out.println(kh.Liters(11.8));
  }

}
