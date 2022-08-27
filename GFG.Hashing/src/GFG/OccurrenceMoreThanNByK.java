package GFG;
import java.util.*;

public class OccurrenceMoreThanNByK {
    public static void occurrenceMoreThanNByK(int [] arr, int k){  //MyCode
        int res=arr.length/k;
       HashMap<Integer,Integer> m = new HashMap<>();
       for(int i=0;i<arr.length;i++){
           m.put(arr[i],m.getOrDefault(arr[i],0)+1);
       }
        for(Map.Entry<Integer,Integer> e: m.entrySet()){  //Map.Entry & m.entrySet function
            if(e.getValue()>res){
                System.out.println(e.getKey());  //getKey is string, getValue is integer
            }
        }
    }
    public static void main(String [] args){
        int [] arr={30,10,20,20,10,20,30,30};
        occurrenceMoreThanNByK(arr,4);
    }
}
