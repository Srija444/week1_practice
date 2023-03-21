class Static{
  static String hi="===welcome to the spring season===";
  public void hello(){
    System.out.println("===SAKURA==="+hi);
  }
  public static void main(String args[]){
    
    Static cool=new Static();
    cool.hello();
  }
}