import java.util.Scanner;
class SecMax{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("how many values do you want to enter");
    int n=s.nextInt();
    System.out.println("enter "+n+" values");
    int max=s.nextInt();
    int smax=0;
    for(int i=1;i<n;i++){
      int num=s.nextInt();
      if(max<num){
        smax=max;
        max=num;
      }
      else if(smax<num){
        smax=num;
      }
      }
    System.out.println("Max value: "+max);
    System.out.println("second max value: "+smax);
    }
}