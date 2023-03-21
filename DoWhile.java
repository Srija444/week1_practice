import java.util.Scanner;
class DoWhile{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int i=sc.nextInt();
  do{
    System.out.println("enter the starting number:");
    i++;
    
  }while(i<=5);
}
}
