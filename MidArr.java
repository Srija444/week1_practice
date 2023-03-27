import java.util.Scanner;
class MidArr{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the array size: ");
    int n=s.nextInt();
    int arr[]=new int[n];
    
    System.out.println("enter the " + n + " value: ");
    for(int i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
      
    }
    System.out.println(" the mid values are: ");
    if(n%2==0){
      int a=(n/2);
      int b=(n/2)-1;
      System.out.println(arr[b]);
      System.out.println(arr[a]);
      
    }
    else{
      int a=(n/2);
      System.out.println(arr[a]);
    }
  }
}