package GFG; //add, print, contains, iterator, hasNext, next, size, remove, print with for loop, isEmpty,
             // clear
import java.util.*;

public class HashSetTest{ //use to store only key

    public static void main(String [] args){
        HashSet<String> h= new HashSet<String>();  //hashTable syntax
                                                   //cap can be given in constructor

        h.add("gfg");  //add function only add when item s not present and return true otherwise false
        h.add("courses");
        h.add("ide");

        System.out.println(h);  //print the whole hash set in any order

        System.out.println(h.contains("ide"));  //contains function to search an item

        Iterator<String> i= h.iterator();  //an instance i created to print the whole hash set item one by one in next line

        //with instance i whole hash set item one by one in next line
        while(i.hasNext()){  //hasNext function check if next is filled or not and return boolean
            System.out.println(i.next()+" ");  //next function get the next value
       }

        System.out.println(h.size());  //size function return the number of element in hashSet

        h.remove("ide"); //remove function deletes the element
        System.out.println(h.size());

        for(String s:h){  //iterate trough all the element of HashSet
            System.out.println(s+" ");
        }

        System.out.println(h.isEmpty());  //isEmpty check is hashSet is empty or not and return boolean

        h.clear();  //delete all item at once
        System.out.println(h.size());

    }
}
