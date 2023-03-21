import java.util.Scanner;

class Marks {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int i_s = 0, e_s = 0, p_s = 0, total_s = 0;

    System.out.println("enter the i_s:");
    System.out.println("enter the e_s:");
    System.out.println("enter the p_s:");

    i_s = s.nextInt();
    e_s = s.nextInt();
    p_s = s.nextInt();
    if (i_s > 50 && e_s > 50 && p_s > 50) {

      total_s = (70 * p_s) / 100 + (20 * e_s) / 100 + (10 * i_s) / 100;
      System.out.println("the total is" + total_s);

      if (total_s > 90) {
        System.out.println("A GRADE");
      } else if (total_s >= 70) {
        System.out.println("B GRADE");
      } else if (total_s >= 50) {
        System.out.println("C GRADE");
      }
    if (i_s < 50) {
        System.out.println("failed in internal with the score is" + i_s);
      }
    if (e_s < 50) {
        System.out.println("failed in external with the score is" + e_s);
      }
    if (p_s < 50) {
        System.out.println("failed in project with the score is" + p_s);
      } else if (total_s > 50) {
        System.out.println("passed all subjects");
      } else {
        System.out.println("failed more subjects");
      }

    }
  }

}
