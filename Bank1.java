import java.util.Scanner;
 
public class Bank1{
         Scanner s=new Scanner(System.in);
          int pincount=0,wcount=0; 
           int note500=0;
           int note100=0;
           int note200=0;
            
          double acBal=10000;
          public void deposite() {
              System.out.println("Enter deposite amount");
              int amount=s.nextInt();
              if(amount%100==0) {
                  if(amount<=50000) {
                      
                      acBal=acBal+amount;
                      System.out.println("Available bal: "+acBal);
                  }
                  else {
                      System.out.println("deposite limit is 50000 only");
                  }
                  
              }
              else {
                  System.out.println("Please enter multiples of 100 only");
              }
          }
          public void withdraw() {
              System.out.println("Enter withdraw amount");
              int amount=s.nextInt();
              
              if(amount%100==0) {
                  if(amount<=(acBal-500)) {
                      if(amount<=20000) {

                        
                          acBal=acBal-amount;
                          wcount++;
                          System.out.println("Available bal: "+acBal);
                        if(amount>=500){
                          note500=amount/500;
                          amount-=note500*500;
                          System.out.println("the number of 500's are :" +note500);
                        }
                        if(amount>=100){
                          note100=amount/100;
                          amount-=note100*100;
                          System.out.println("the number of 100's are : " +note100);
                      }
                        if(amount>=200){
                          note200=amount/200;
                          amount-=note200*200;
                          System.out.println("the number of 200's are : " +note200);
                        }
                        }
                         
                      else {
                          System.out.println("withdraw limit is 20000 only");
                      }
                  }
                  else {
                    System.out.println("insuffient fund in your account");  
                  } 
              }
              else {
                  System.out.println("Please enter multiples of 100 only");
              }
          }
          
          public void viewOptions() {
              System.out.println("==========ABC Bank=================");
              int option=0;
              do {
              System.out.println("\n1. Deposite");
              System.out.println("2. Withdraw");
              System.out.println("3. Bal Enquiry");
              System.out.println("0. EXIT");
              System.out.println("Choose your option");
              option=s.nextInt();
              switch(option) {
              
              case 1:
              {
                  deposite();
                  break;
              }
              case 2:
              {
                  if(wcount<3) {
                           
                  withdraw();
                    
                  }
                            
                  
                  else {
                      System.out.println("your withdraw limit is over for the day");
                  }
                  break;
                  
                  }
              case 3:
              {
                  System.out.println("Available bal: "+acBal);
                  break;
              }
              case 0:
              {
                  System.out.println("Thank you, visit again");
                  break;
              }
              default:{
                  System.out.println("Invalid option");
              }
              }
              }
              while(option!=0);
              
          }
        public void validate() {
            System.out.println("Enter pin number");
            int pin=s.nextInt();    //3456   2321
            if(pin==1234) {
                viewOptions();
            }
            else {
                System.out.println("Incorrect pin, please tray again");
                pincount++;
                if(pincount<3) {
                    validate();
                }
                else {
                    System.out.println("your card is blocked for the day.......");
                }
                
            }
        }
    
        public static void main(String[] args) {
             
            Bank1 obj=new Bank1();
            obj.validate();
    
          }
 
}