import java.util.Scanner;
public class Tiffin{
  Scanner s=new Scanner(System.in);
public void idli(){
 System.out.println("Enter quantity");
   int a=s.nextInt();
  int b=a*30;
  double cgst=b*0.025;
  double sgst=b*0.025;
  double gst=cgst+sgst;
   double total=b+gst;
  System.out.println("Cost of idli "+30);
  System.out.println("Quantiy of idli "+a);
  
  System.out.println("cgst : " +cgst);
  System.out.println("sgst:"+sgst);
  System.out.println("gst is:"+gst);
  System.out.println("Total Bill "+total); 
  viewoptions();
}
  public void dosa(){
 System.out.println("Enter quantity ");
   int c=s.nextInt();
  int d=c*40;
  double cgst=d*0.025;
    double sgst=d*0.025;
    double gst=cgst+sgst;
   double total=d+gst;
  System.out.println("Cost of dosa "+40);
  System.out.println("Quantiy of dosa "+c);
    System.out.println("cgst : " +cgst);
    System.out.println("sgst : " +sgst);
  System.out.println("GST "+gst);
  System.out.println("Total Bill "+total);  
    viewoptions();
}
  public void vada(){
 System.out.println("Enter quantity");
   int e=s.nextInt();
  int f=e*20;
  double cgst=f*0.025;
    double sgst=f*0.025;
    double gst=cgst+sgst;
   double total=f+gst;
  System.out.println("Cost of vada "+200);
  System.out.println("Quantiy of vada "+e);
     System.out.println("cgst : " +cgst);
     System.out.println("sgst : " +sgst);
  System.out.println("GST "+gst);
  System.out.println("Total Bill "+total);  
    viewoptions();
}
  public void puri(){
 System.out.println("Enter quantity");
   int g=s.nextInt();
  int h=g*50;
  double cgst=h*0.025;
    double sgst=h*0.025;
    double gst=cgst+sgst;
   double total=h+gst;
  System.out.println("Cost of puri "+50);
  System.out.println("Quantiy of puri "+g);
     System.out.println("cgst : " +cgst);
     System.out.println("sgst : " +sgst);
  System.out.println("GST "+gst);
  System.out.println("Total Bill "+total); 
    viewoptions();
}
  public void viewoptions(){
    System.out.println("===Welcome to world best Tiffin Center===");
    System.out.println("1 . Idli - Rs.30");
    System.out.println("2 . Dosa - Rs.40");
    System.out.println("3 . Vada - Rs.20");
    System.out.println("4 . Puri - Rs.50");
    System.out.println("5 . Exit");
    System.out.println("Choose your option");
    int option=s.nextInt();
    
    switch(option){
      case 1:{
        idli();
        
        break;
      }
        case 2:{
        dosa();
          break;
          
      }
        case 3:{
        vada();
          break;
          
      }
        case 4:{
        puri();
          break;
          
      }
        case 5:{
        System.out.println("===Thank you for visting==visit again===");
      }
    }
  }
  public static void main(String[]args){
    Tiffin obj=new Tiffin();
    obj.viewoptions();
  }
}
      