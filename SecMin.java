import java.util.Scanner;
class SecMin{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("how many values do you want to enter:");
    int n=s.nextInt();
  System.out.println("enter "+n+" values");
  int min=s.nextInt();
  int smin=0;
  for(int i=1;i<n;i++){
    int num=s.nextInt();
    if(min>num){
      smin=min;
      min=num;
    }
    else if(smin>num){
      smin=num;
    }
  }
    System.out.println("Min value:"+min);
    System.out.println("second min value:"+smin);
  }
}