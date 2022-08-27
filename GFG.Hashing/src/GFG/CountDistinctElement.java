package GFG;
import java.util.*;


public class CountDistinctElement {
    public static int distinctElement1(int [] arr){  //MyCode & gfg efficient
        HashSet<Integer> h = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        return h.size();
    }

    public static int distinctElement3(Integer [] arr){  //MyCode & gfg efficient improoved
        HashSet<Integer> h = new HashSet<Integer>(Arrays.asList(arr));  //asList function

        return h.size();
    }

    public static int distinctElement2(int [] arr){   //GFG Naive
        int res=0;
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                res++;
            }
        }
        return res;
    }


    public static void main(String [] args){
        int [] arr={10,10,10};

        System.out.println(distinctElement1(arr));

        System.out.println(distinctElement2(arr));

        Integer [] arr2={10,10,10};
        System.out.println(distinctElement3(arr2));
    }
}
