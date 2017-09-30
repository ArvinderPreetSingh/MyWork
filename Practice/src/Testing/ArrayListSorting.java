package Testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSorting {

	public static void main(String[] args)
	{
            ArrayList arrayList = new ArrayList();
 
            arrayList.add(7);
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
           arrayList.add(4);
            arrayList.add(5);
            arrayList.add(6);
 
 
         Comparator comparator = Collections.reverseOrder();
 
          System.out.println("Before sorting  : "  + arrayList);
        
Collections.reverse(arrayList);
System.out.println(arrayList);
          
            Collections.sort(arrayList,comparator);
            System.out.println("After sorting  :" + arrayList);
 
       }
	}
	

