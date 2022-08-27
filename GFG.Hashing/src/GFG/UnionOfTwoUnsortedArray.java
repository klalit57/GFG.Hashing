package GFG;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoUnsortedArray {

    public static HashSet<Integer> unionUnsortedArray1(int [] a, int [] b){ //MyCode & gfg efficient
        HashSet<Integer> h = new HashSet<Integer>();
        int res=0;
        for(int x:a) {
            h.add(x);
        }
        for(int x:b) {
            h.add(x);
        }
        System.out.println(h.size());
        return h;
    }

    public static ArrayList<Integer> unionUnsortedArray2(int [] a, int [] b){  //GFG Naive
        int res=0;
        ArrayList<Integer> dist= new ArrayList<>();
        for(int i:a){
            if(dist.contains(i)){
                continue;
            }else {
                dist.add(i);
                res++;
            }
        }
        for(int i:b){
            if(dist.contains(i)){
                continue;
            }else {
                dist.add(i);
                res++;
            }
        }
        System.out.println(res);
        return dist;
    }

    public static void main(String [] args){
        int [] a1={10,15,20,5,30};
        int [] b1={30,5,30,80};
        System.out.println(unionUnsortedArray1(a1,b1));


        System.out.println(unionUnsortedArray2(a1,b1));
      }
}
