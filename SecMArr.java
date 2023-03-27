//Max and min 
import java.util.Scanner;
public class SecMArr{
public static void main(String[]args){
  Scanner s=new Scanner(System.in);
  System.out.println("Enter size : ");
  int n=s.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter values : ");
  for(int i=0;i<arr.length;i++){
    arr[i]=s.nextInt();
  }
  int max=0;
  int s_max=0;
  for(int i=0;i<arr.length;i++){
    if(max<arr[i]){
      s_max=max;
      max=arr[i];
    }
    else if(s_max<arr[i]){
    
      s_max=arr[i];
    }
  }
  System.out.println("Max num is "+max);
    System.out.println("Second max num is "+s_max);

  int t=0;
  for(int i=0;i<arr.length;i++){  
      for(int j=i+1;j<arr.length;j++){  
        if(arr[i]>arr[j]){            
          t=arr[i];                  
          arr[i]=arr[j];            
          arr[j]=t;                  
        }
      }
    }
  System.out.println("Min num is "+arr[0]);
  System.out.println("Second min num is "+arr[1]);
}
}