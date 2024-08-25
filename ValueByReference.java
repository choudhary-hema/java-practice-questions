
public class ValueByReference {
  public static void main(String args[]) {
    int x=10;
    int y=25;
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    modifyPrimitiveType(x, y);
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
  }
  public static void modifyPrimitiveType (int x, int y){
      int a = x;
      a =11;
      int b = x;
      b =11;
  }
}