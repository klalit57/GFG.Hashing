package GFG;

public class DirectAddressTable {
    public static int [] directAddressing(int [] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int [] table = new int [max+1];
        return table;
    }
    public static boolean search(int [] table, int x){
        if(table[x]==1){
            return true;
        }
        return false;
    }
    public static void insert(int [] table, int x){
        table[x]=1;
    }
    public static void delete(int [] table, int x){
        table[x]=0;
    }

    public static void main(String [] args){
        int [] arr= {0,999};
        int [] table =directAddressing(arr);

        insert(table,10);
        insert(table,20);
        insert(table,119);

        System.out.println(search(table,10));
        System.out.println(search(table,20));
        System.out.println(search(table,119));

        delete(table,119);
        System.out.println(search(table,119));


    }
}
