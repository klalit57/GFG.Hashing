package GFG;
import java.util.*;
class MyHash1{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;
    MyHash1(int b){
        BUCKET=b;
        table= new ArrayList<LinkedList<Integer>>(b);
        for(int i=0;i<b;i++){
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key){
        int i=key%BUCKET;
        table.get(i).add(key);
    }
    boolean search(int key){
        int i=key%BUCKET;
        return table.get(i).contains(key);
    }
    void remove(int key){
        int i=key%BUCKET;
        table.get(i).remove((Integer) key);
    }
}

public class ChainingForCollision {

    public static void main(String [] arr){

    }
}
