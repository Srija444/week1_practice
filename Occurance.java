import java.util.Scanner;
public class Occurance{
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int arr[]=new int[5];
  int count=0;
  System.out.println("Enter the numbers : ");
for(int i=0;i<arr.length;i++) {
arr[i]=s.nextInt();
}
System.out.println("Enter the number whose occurance to be known :");
int n=s.nextInt();
for(int i=0;i<arr.length;i++) {
if(n==arr[i]) {
count++;
}
}
System.out.println("The number in the array is "+n +" whose count is : "+count);
}
}