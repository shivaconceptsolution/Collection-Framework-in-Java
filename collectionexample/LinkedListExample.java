/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author Hp
 */
public class LinkedListExample {
    public static void main(String args[])
    {
      // Vector obj = new Vector();
       Stack obj = new Stack();
        obj.push(12);
        obj.push(11);
        obj.push(13);
        
     System.out.println(obj.pop());
     System.out.println(obj.pop());
     System.out.println(obj.pop());   
    }
}
