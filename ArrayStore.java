import java.util.Scanner;
class ArrayStore{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]=new int[5];
     System.out.println("^^^enter your array elements^^^: ");
    for(int i=0;i<arr.length;i++){
      
      arr[i]=s.nextInt();
      
    }
    System.out.println("^^^the stored array elements are^^^");
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}