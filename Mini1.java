import java.util.Scanner;

public class Mini1{
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = s.nextDouble();
        double tds = 0.0;
        if (salary > 700000) {
            if (salary <= 300000) {
                tds = salary * 0.05;
            } else if (salary <= 600000) {
                tds =  (300000*0.05) + (salary - 300000) * 0.1;
            } else if (salary <= 900000) {
                tds = ((300000 * 0.05)+((600000- 300000)* 0.1)) + (salary - 600000) * 0.15;
            } else if (salary <= 1200000) {
                tds = ((300000 * 0.05)+((600000-300000)* 0.1) + ((900000-600000) *0.15)) + (salary - 900000) * 0.2;
            } else {
                tds = ((300000 * 0.05)+((600000-300000)* 0.1) + ((900000-600000) *0.15) +((1200000-900000) * 0.2)) + (salary - 1200000) * 0.3;
            }
        }
        System.out.println("Your TDS is: " + tds);
    }
}