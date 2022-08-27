package GFG;

//MyHash mh(7);
//mh.insert(49);
//mh.insert(56);
//mh.insert(72);
//if(mh.search(56)==true)
//    print(yes);
//else
//    print(No);
//mh(erase(56));
//if(mh.search==true)
//    print(yes);
//else
//    print(No);

class MyHash2 {  //Linear Probing
    int[] arr;
    int cap;
    int size;

    MyHash2(int c) {
        cap = c;
        size = 0;
        for (int i = 0; i < cap; i++) {
            arr[i] = -1;
        }
    }

    int hash(int key) {
        return key % cap;
    }

    boolean search(int key) {
        int h = hash(key);
        int i = h;
        while (arr[i] != -1) {
            if (arr[i] == key) {
                return true;
            }
            i = (i + 1) % cap;   //Linear Probing
            // We can use quadratic probing or double hashing instead of linear probing
            if (i == h) {
                return false;
            }
        }
        return false;
    }

    boolean insert(int key) {
        if (size == cap) {
            return false;
        }
        int i = hash(key);
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != key) { //-1=>empty, -2=>deleted
            i = (i + 1) % cap;
        }
        if (arr[i] == key) {
            return false;
        } else {
            arr[i] = key;
            size++;
            return true;
        }
    }

    boolean erase(int key) {
        int h = hash(key);
        int i = h;
        while (arr[i] != -1) {
            if (arr[i] == key) {
                arr[i] = -2;
                return true;
            }
            i = (i + 1) % cap;
            if (i == h) {
                return false;
            }
        }
        return false;
    }
}

public class OpenAddressingForCollision {

    public static void main(String [] args){

    }
}
