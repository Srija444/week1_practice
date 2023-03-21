import java.util.Scanner;
class For_Min{
public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  System.out.println("how many values do you want to enter");
  int n=s.nextInt();
  int min=0;
  System.out.println("enter " +n+ " values");
  min=s.nextInt();
  for(int i=1;i<n;i++){
    int num=s.nextInt();
  if(min>num){
    min=num;
  }
  }
  System.out.println("min value:"+min);
}
}
