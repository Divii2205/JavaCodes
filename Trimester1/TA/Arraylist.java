import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // array is fixed while ArrayList is dynamic
        
        // for (int i = 1; i<=10; i++) list.add(i);

        // boolean neg = false;
        // while(!neg){
        //     int n = sc.nextInt();
        //     if (n == (-1)) neg = true;
        //     else list.add(n);
        // }

        // for (int i=0; i != (-1); i++){
        //     int n = sc.nextInt();
        //     if (n == (-1)) break;
        //     else list.add(n);
        // }

        // while (true){
        //     int n = sc.nextInt();
        //     if (n == (-1)) break;
        //     else list.add(n);
        // }

        // int t = sc.nextInt();
        // for (int i = 0; i<t; i++){
        //     list.add(sc.nextInt());
        // }

        // int k = sc.nextInt();

        // for (int i = 0; i<list.size(); i++){
        //     if (list.get(i) == k){
        //         System.out.println("1");
        //         break;
        //     } else System.out.println("0");
        // }

        // int n = sc.nextInt();
        // for (int i = 0; i<n; i++){
        //     list.add(sc.nextInt());
        // }

        // int k = sc.nextInt(); //taking the index value

        // if (k>=0 && k<n) list.remove(k);
        // else System.out.println((-1));
        
        // int m = sc.nextInt();
        // for (int i = 0; i<m; i++){
        //     list2.add(sc.nextInt());
        // }

        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            list.add(sc.nextInt());
        }

        // int startIndex = sc.nextInt(); //taking the index value
        // int endIndex = sc.nextInt(); //taking the index value

        // if (startIndex>endIndex) System.out.println(list);
        
        // if (startIndex<0) startIndex = 0;
        
        // if (endIndex >= n) endIndex = n-1;

        // int num = endIndex-startIndex;
        // while (num>=0) {
        //     list.remove(startIndex);
        //     num--;
        // }

        // list2.addAll(list);

        int index = sc.nextInt();
        int neww = sc.nextInt();

        list.add(index, neww);
        System.out.println(list);

        sc.close();
    }
}
