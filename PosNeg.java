import java.util.Scanner;
class PosNeg{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int x;
    x=s.nextInt();
    if(x>0){
    System.out.println(x+"is positive");
      }
    else{
      System.out.println(x+"is negative");
    }
  }
  
}