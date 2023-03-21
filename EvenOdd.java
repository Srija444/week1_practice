import java.util.Scanner;
class EvenOdd{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int x;
    System.out.println("enter the x value:");
    x=s.nextInt();
    while(x<=5){
      if(x%2==0){
        System.out.println(x);
        x++;
      }
    }
  } 
}
