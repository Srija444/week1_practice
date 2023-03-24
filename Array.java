import java.util.Scanner;
class Array{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
      System.out.println("enter the 1st number:");
    int[] arr=new int[4];
    for(int i=0;i<arr.length;i++){
      System.out.println("enter the number"+(i+1));
      arr[i]=s.nextInt();
    }
    for(int j=0;j<arr.length;j++){
      System.out.println(arr[j]);
    }
      
    
    
  }
}