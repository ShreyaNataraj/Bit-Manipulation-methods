public class EvenOdd {
  public static void evenodd(int n) {
  int bitmask = 1;
  if((n&bitmask)==0){
    System.out.println("It's is a even number");
  }
  else{
    System.out.println("it is a odd number");
  }
  }
  public static void main(String[] args) {
    evenodd(2);
  }
}
