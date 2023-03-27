import java.util.Scanner;
class ESumO{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the elements of array: ");
    int arr[]=new int[10];
    int even_sum=0;
    int odd_sum=0;
    for(int i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
      
      if(arr[i]%2==0){
        even_sum=even_sum+arr[i];
      }
      else{
        odd_sum=odd_sum+arr[i];
      }
      
      
    }
    System.out.println("the even sum is: "+even_sum);
      System.out.println("the odd sum is: "+odd_sum);
      
    
  }
}