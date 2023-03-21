import java.util.Scanner;
class NestedSwitch{
  public static void main(String args[]){
    System.out.println("enter the student year: ");
    Scanner s=new Scanner(System.in);
    int year=s.nextInt();
    System.out.println("enter the student branch");
    
    char ch=s.next().charAt(0);
    switch(year){
      case 1:
        System.out.println("1 year");
        switch(ch){
          case 'c':
            System.out.println("subjects maths physics pps");
            break;
          case 'm':
            System.out.println("subjects maths physics mechanics");
            break;
          case 'e':
            System.out.println("subjects maths physics electronics");
            break;
        }
        break;
      case 2:
        System.out.println("2nd year");
        switch(ch){
          case 'c':
            System.out.println("subjects java phython");
            break;
          case 'm':
            System.out.println("subjects thermodynamics automobiles");
            break;
          case 'e':
            System.out.println("subjects bee natl");
            break;
        }
        break;
        }
      
        }
}
  
