/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;
import java.util.*;
/**
 *
 * @author Hp
 */
public class HashSetExample {
   public static void main(String args[]) 
   {
       // HashSet obj = new HashSet();
       //   HashSet<String> obj = new HashSet<String>();
      // Set<String> obj = new HashSet<String>();
     //  LinkedHashSet obj = new LinkedHashSet();
       TreeSet obj = new TreeSet();
        obj.add("C");
        obj.add("CPP");
        obj.add("C");
        obj.add("JAVA");
        obj.add("PHP");
        obj.add("Android");
        obj.add("Abdroid");
        obj.add("Aabdroid");
        obj.add("IOS");
        System.out.println(obj.size());
        obj.remove("C");
        for(Object o:obj)
        {
            System.out.println(o);
        }
       
   }
}
