package Testing;

 class A {


     public void play() {
          System.out.println("In class A");
     }
 }

  class B extends A {
      public void play() {
          System.out.println("In class B");
      }
  }

  public class Demo {
      public static void main(String[] args) {
    	  B b = new B();
    	           A a = b; 
    	          a.play();
    	          b.play();
      }
  }