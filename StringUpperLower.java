import java.util.Scanner;
class StringUpperLower{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    System.out.println("enter your full name:");
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    
  }
}