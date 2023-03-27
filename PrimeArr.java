//prime
import java.util.Scanner;
public class PrimeArr{
public static void main(String[]args){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter size: ");
  int n=s.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter the values: ");
  for(int i=0;i<arr.length;i++){
    arr[i]=s.nextInt();
  }
  for(int i=0;i<arr.length;i++){
    int c=0;
    int j=1;
    while(j<=(arr[i]/2)){
      if(arr[i]%j==0){
        c++;
      }
      j++;
      }
    if(c==1){
      System.out.println(arr[i]+"is prime number");
    }
  }
    }
  }