import java.util.Scanner;

class Leap {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int x;
    System.out.println("enter the year:");
    x = s.nextInt();
    if (x % 400 == 0 && x%4==0 && x%100==0) {
      System.out.println("the year is leap year");
    } 
    else {
      System.out.println("the year is not leap year");
    }

  }
}