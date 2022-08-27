package GFG;
import java.util.*;

public class HashMapTest { //use to store key value pair
    public static void main(String [] args){
          HashMap<String,Integer> m= new HashMap<String,Integer>();  //hashMap Syntax
                                                                     //cap can be defined in constructor
        m.put("gfg",10); //put function
        m.put("ide",15);
        m.put("courses",20);

        System.out.println(m);  //print all key value pairs with bracket, with any order

        System.out.println(m.size()); //size function return no. of elements

        for(Map.Entry<String,Integer> e: m.entrySet()){  //Map.Entry & m.entrySet function
            System.out.println(e.getKey()+" "+e.getValue());  //getKey is string, getValue is integer
        }

        System.out.println(m.containsKey("ide")); //containsKey("key") function

        m.remove("ide"); //remove function

        System.out.println(m.size());

        System.out.println(m.containsKey("ide"));

        System.out.println(m.containsValue(15)); //containsValue
        System.out.println(m.containsValue(20));

        System.out.println(m.get("gfg")); //get function return its corresponding value

        System.out.println(m.get("practice"));


    }
}
