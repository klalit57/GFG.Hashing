package GFG;
import java.util.*;

public class FrequencyOfEachElement {
    public static HashMap<Integer,Integer> frequencyOfEachElement1(int [] arr){  //MyCode
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])==false){
                h.put(arr[i],1);
            }
            else if(h.containsKey(arr[i])==true) {
                h.put(arr[i],h.get(arr[i])+1);
            }
        }
        return h;
    }

    public static void frequencyOfEachElement2(int [] arr){ //GFG Naive
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<i;j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(flag==true){
                    continue;
            }
                int freq=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        freq++;
                    }
                }
            System.out.println(arr[i]+" "+freq);
            }
        }

    public static void frequencyOfEachElement3(int [] arr){  //GFG efficient
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int x:arr) {
            h.put(x, h.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> e: h.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());
        }
    }

    public static void main(String [] args){
        int [] arr1={10,12,10,15,10,20,12,12};
        frequencyOfEachElement2(arr1);

        int [] arr2={10,12,10,15,10,20,12,12};
        System.out.println(frequencyOfEachElement1(arr2));

        int [] arr3={10,12,10,15,10,20,12,12};
        frequencyOfEachElement3(arr3);

    }
}
