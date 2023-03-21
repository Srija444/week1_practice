class Digits{
  public static void main(String args[]){
    int i=4242,count=0;
    while(i>0){
      i=i/10;
      count++;
    }
    System.out.println("the no. of digits are:"+count);
  }
}