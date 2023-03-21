import java.util.Scanner;

public class Mini{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = s.nextDouble();
        double tds = 0.0;
        if (salary > 700000) {
            if (salary <= 300000) {
                tds = salary * 0.05;
            } else if (salary <= 600000) {
                tds = 15000 + (salary - 300000) * 0.1;
            } else if (salary <= 900000) {
                tds = 45000 + (salary - 600000) * 0.15;
            } else if (salary <= 1200000) {
                tds = 97500 + (salary - 900000) * 0.2;
            } else {
                tds = 187500 + (salary - 1200000) * 0.3;
            }
        }
        System.out.println("Your TDS is: " + tds);
    }
}