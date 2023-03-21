import java.util.Scanner;
class Max_Value{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num1=0,num2=0,num3=0,num4=0,num5=0;
    System.out.println("enter the num1:");
    num1=s.nextInt();
    System.out.println("enter the num2:");
    num2=s.nextInt();
    System.out.println("enter the num3:");
    num3=s.nextInt();
    System.out.println("enter the num4:");
    num4=s.nextInt();
    System.out.println("enter the num5:");
    num5=s.nextInt();
    if(num1>num2 && num1<num2 && num1>num3 && num1>num4 && num1>num5 ){
      System.out.println("max value is"+num1);
    }
      else if(num2>num1 && num2>num3 && num2>num4 && num2>num5){
      System.out.println("max value is"+num2);
      }
      else if(num3>num1 && num3>num2 && num3>num4 && num3>num5){
      System.out.println("max value is"+num3);
      }
      else if(num4>num1 && num4>num2 && num4>num3 && num4>num5){
      System.out.println("max value is"+num4);
      }
      else{
      System.out.println("the max value is"+num5);
      }
  
    
    
    
    
    }
  }
