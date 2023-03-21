import java.util.Scanner;
class VoteAge{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in); 
    int x;
     System.out.println("enter the x value:");
    x=s.nextInt();
    if(x>=18){
      System.out.println("Eligible for voting");
    }
    else{
      System.out.println("not Eligible for voting");
    }
    
  }
}