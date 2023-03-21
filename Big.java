import java.util.Scanner;
class Big{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int x,y;
    System.out.println("enter the x value:");
    System.out.println("enter the y value:");
    x=s.nextInt();
    y=s.nextInt();
    if(x>y){
      System.out.println(x+"is greater than y");
       }
        else{
          System.out.println(x+"is not greater than y");
    }
      
  }
}