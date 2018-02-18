package com.validatePDF.project;
import java.util.LinkedList;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch.Diff;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch.Operation;
public class StringMismatch {
	public static  void main(String[] args) 
	{
		String s1="My name is Arvinder Preet Singh.";			String s2="My name is Arvinder Singh";			
		DiffMatchPatch dmp = new DiffMatchPatch();
        LinkedList<DiffMatchPatch.Diff> diffs = dmp.diffMain(s1, s2);                
        System.out.println(diffs);        
        //String text1 = "";        //String text2 = "";
        for(Diff d: diffs)
        {
          if(d.operation==Operation.DELETE)
        	  System.out.println(d);
          //  text1 += d.text;
          else if(d.operation==Operation.INSERT)
        	  System.out.println(d);
            //text2 += d.text;
         /* else
          {            text1 += d.text;            text2 += d.text;
          }*/
          //System.out.println(d);
        }
        //System.out.println(text1);        //System.out.println(text2);    
	}		}
		
	

