package Testing;

 public class InputTest {
     public static void main(String[] args) {
        int i = 0;
        if (args.length != 0) {
             do {
                 System.out.print(args[i] + " ");
                i++;
             } while(i<args.length-1);
         }
         else {
             System.out.print("No arguments inputted");  
       } 
     }
 }