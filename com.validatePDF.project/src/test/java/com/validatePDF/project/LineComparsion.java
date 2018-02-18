package com.validatePDF.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;



public class LineComparsion {
	 
public static void main(String args[]) {
    String text1 ="hello i am best. where are you";
    String text2 ="hello i am best good.i am here";
     
 compareFile(text1,text2);
System.gc();
 
 
}
 
 
 
private static  String compareFile(String text1,String text2) {
     
     DiffMatchPatch dmp = new DiffMatchPatch();
    
     // Execute one reverse diff as a warmup.
     LinkedList difference= dmp.diffMain(text2, text1, false);
 
     ListIterator itr = difference.listIterator();
     System.out.println(difference);
     String abc=dmp.diffPrettyHtml(difference);
    System.out.println(abc);
      
     
      
     long start_time = System.currentTimeMillis();
     dmp.diffMain(text1, text2, false);
     long end_time = System.currentTimeMillis();
  System.out.printf("Elapsed time: %f\n", ((end_time - start_time) / 1000.0));
    return text2;
     // Read a file from disk and return the text contents.
     
    }
 
 
 
/*private static String readFile(String filename) {
 // Read a file from disk and return the text contents.
 StringBuffer strbuf = new StringBuffer();
 try {
   FileReader input = new FileReader(filename);
   BufferedReader bufRead = new BufferedReader(input);
   String line = bufRead.readLine();
   while (line != null) {
     strbuf.append(line);
     strbuf.append('\n');
     line = bufRead.readLine();
   }
    
   bufRead.close();
   
 } catch (IOException e) {
   e.printStackTrace();
 }
 return strbuf.toString();
}*/
}