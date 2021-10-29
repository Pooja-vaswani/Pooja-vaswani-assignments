package java3;


public class Test {

   public static void main(String args[]) {
      String Str = new String("Javastring pool refers to a collection of strings stored in heap memory");

      System.out.print("Return Value :" );
      System.out.println(Str.toUpperCase() );
      System.out.println(Str.toLowerCase() );
      System.out.println(Str.replace('a','$') );
      System.out.println(Str.contains("collection") );
      String Str1 = new String("Javastring pool refers to a collection of strings stored in heap memory");
      System.out.println(Str1.equals(Str) );
      System.out.println(Str1==Str );
   }
}