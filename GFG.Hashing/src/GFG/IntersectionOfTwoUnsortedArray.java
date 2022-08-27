package GFG;

import java.util.HashSet;

public class IntersectionOfTwoUnsortedArray {
    public static int intersectionTwoArrays1(int [] a, int [] b){  //MyCode
        HashSet<Integer> h= new HashSet<>();
        int count=0;
        for(int i:a){
            h.add(i);
        }
        for(int i=0;i<b.length;i++){
            if(h.contains(b[i])==true){
                boolean flag=true;
                for(int j=0;j<i;j++){
                    if(b[j]==b[i]) {
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    System.out.println(b[i]+" ");
                    count++;
                }
            }
        }
        return count;
    }

    public static int intersectionTwoArrays2(int [] a, int [] b){  //GFG Naive
        int res=0;
        for(int i=0;i<a.length;i++){
            boolean flag=true; //we assumed a[i] distinct element=true
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    flag=false;  //a[i] not distinct so false
                    break;
                }
            }
            if(flag==false){  //if not distinct ignore and continue
                continue;
            }
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    public static int intersectionTwoArrays3(int [] a, int [] b){  //GFG Efficient 1
        int res=0;
        HashSet<Integer> aSet= new HashSet<>();
        HashSet<Integer> bSet= new HashSet<>();
        for(int i:a) {
            aSet.add(i);
        }
        for(int i:b) {
            bSet.add(i);
        }
        for(int i:aSet){
            if(bSet.contains(i)){
                System.out.println(i+" ");
                res++;
            }
        }
        return res;
    }

    public static int intersectionTwoArrays4(int [] a, int [] b){  //GFG Efficient 2
        int res=0;
        HashSet<Integer> aSet= new HashSet<>();
        for(int i:a) {
            aSet.add(i);
        }
        for(int i:b){
            if(aSet.contains(i)){
                System.out.println(i+" ");
                res++;
                aSet.remove(i);
            }
        }
        return res;
    }

    public static void main(String [] args){
      int [] a1={10,15,20,5,30};
      int [] b1={30,5,30,80};
      System.out.println(intersectionTwoArrays1(a1,b1));
        System.out.println();

        int [] a2={10,10,30,20};
        int [] b2={20,10,10,40};
        System.out.println(intersectionTwoArrays2(a2,b2));
        System.out.println();

        int [] a3={10,15,20,5,30};
        int [] b3={30,5,30,80};
        System.out.println(intersectionTwoArrays3(a3,b3));
        System.out.println();

        int [] a4={10,15,20,5,30};
        int [] b4={30,5,30,80};
        System.out.println(intersectionTwoArrays4(a4,b4));
        System.out.println();
    }
}
