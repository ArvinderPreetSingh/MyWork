package Testing;

 public class CmdLineInput {
    public static void main(String[] args) {
         int i = 0;
        do {
            if (args.length == 0) { 
                System.out.println("No input");
                break;
            }
             System.out.print(args[i] + " "); 
            i++;
         } while (i < args.length); 
         System.out.print("Finished"); 
     }
 }