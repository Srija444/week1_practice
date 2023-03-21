import java.util.Scanner;
class For_Even{
  public static void main(String args[]){
    
    Scanner s=new Scanner(System.in);
    System.out.println("enter the value:");
    int i,n,count=0;
    n=s.nextInt();
    for(int i=1;i<=n;i++){
      if(i%2==0){
        System.out.println(i);
      }
      count++;
    }
    System.out.println(count);
      
    
  }
}