/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

/**
 *
 * @author Hp
 */
public class CollectionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TreeSet<Student> obj = new TreeSet<Student>(new FeesComparator());
       obj.add(new Student(1001,"sname",45000));
       obj.add(new Student(1004,"manish kumar",78000));
       obj.add(new Student(1002,"jay kumar",23000));
       //Collections.sort(obj);
       
      //  ListIterator it = obj.listIterator();
        for(Student s:obj)
        {
         
            System.out.println(s);
        }
      
        
    }
    
}
