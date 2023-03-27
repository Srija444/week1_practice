import java.util.Scanner;
class OddEvenArr{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]=new int[6];
    int odd=0;
    int even=0;
    System.out.println("^^enter your array elements^^:");
    for(int i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    
    if(arr[i] % 2 == 0){
      even++;
     
      
    }
      else{
       odd++;
      }
  }
     System.out.println("^^^the even numbers are^^^:  "+even);
     System.out.println("^^^the odd numbers are^^^:  "+odd);
  }
}
