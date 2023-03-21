import java.util.Scanner;
class Nested_Switch{
  public static void main(String args[]){
    System.out.println("enter your's universe:");
    Scanner s=new Scanner(System.in);
    
    String universe=s.next();
    System.out.println("enter your's world:");
    String world=s.next();
    
    
    switch(universe){
      case "first":
        System.out.println("magical world");
    
        switch(world){
      case "one":
        System.out.println("parents");
        break;
      case "two":
        System.out.println("brother");
        break;
      case "three":
        System.out.println("friends");
        break;
    }
    break;
      case "second":
        System.out.println("magical spark");
        switch(world){
          case "one":
            System.out.println("mahi");
            break;
          case "two":
            System.out.println("doggy");
          case "three":
            System.out.println("stars");
            break;
        }
        break;
    }
    
    
  }
}