import java.util.Scanner;
class For_Max{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int max=0;
    System.out.println("enter the how many values:");
   int n=s.nextInt();
    
    System.out.println("enter the "+n+" values:");
    for(int i=1;i<=n;i++){
      int num=s.nextInt();
      if(max<num){
        max=num;
      }
    }
    System.out.println("Max value:"+max);
  }
}