/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Hp
 */
public class MapExample {
    public static void main(String args[])
    {
       // HashMap obj = new HashMap();
       // LinkedHashMap obj = new LinkedHashMap();
        TreeMap obj = new TreeMap();
        obj.put("RNO",1001);
        obj.put("SNAME","JAY");
        obj.put("BRANCH", "CS");
        obj.put("FEES", 45000);
        
        Set<Map.Entry> st = obj.entrySet();
        for(Map.Entry me :st)
        {
            System.out.println(me.getKey()+" "+me.getValue());
        }
        
    }
            
}
