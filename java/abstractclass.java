
/*01 abstract class Animal{
   
  public abstract void sound();
public class Dog extends Animal{
public void sound(){
	System.out.println("Woof");
   }
   public static void main(String args[]){
	Animal obj = new Dog();
	obj.sound();
   }
}*/

/*02 abstract class AbstractDemo{
   public void myMethod(){
      System.out.println("Hello");
   }
   abstract public void anotherMethod();
}
public class Demo extends AbstractDemo{

   public void anotherMethod() { 
        System.out.print("Abstract method"); 
   }
   public static void main(String args[])
   { 
      //error: You can't create object of it
      AbstractDemo obj = new AbstractDemo();
      obj.anotherMethod();
   }
}*/ //this will throw error.
/*03 abstract class MyClass{
   public void disp(){
     System.out.println("Concrete method of parent class");
   }
   abstract public void disp2();
}

class Demo extends MyClass{
   /* Must Override this method while extending
    * MyClas
    */
 /*  public void disp2()
   {
       System.out.println("overriding abstract method");
   }
   public static void main(String args[]){
       Demo obj = new Demo();
       obj.disp2();
   }
}*/
/*04 
abstract class AbstractClassExample {
   private static abstract void display(){
   System.out.println("This is a method of abstract class");
}
   
}*/ // throws error.

/*05 abstract class ImAbstract{
 *  public final abstract void anAbstractMethod(); 
 *  } 
 *  class ImConcrete extends ImAbstract{
 *   @Override public void anAbstractMethod()
 *    { // TODO Auto-generated method stub } 
 *    }
 */

/*06 abstract class MyClass {
   public void display() {
      System.out.println("This is a method of abstract class");
   }
}
public class AbstractClassExample extends MyClass{
   public static void main(String args[]) {
      new AbstractClassExample().display();
   }
}*/



