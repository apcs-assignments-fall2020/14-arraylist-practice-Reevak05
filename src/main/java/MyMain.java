import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int odd = 0;
        for (int i = 0; i < list.size(); i++) if (list.get(i)%2!=0) odd++;
        return odd;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i = 0; i < list1.size(); i++) for (int j = 0; j < list2.size(); j++) if (list1.get(i)==list2.get(j)) return true;
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) list.add(arr[i]);
        return list;
    }


    public static void main(String[] args) {
       int[] arr = new int[] {23, 2, 34, 3, 45, 76, 8, 2, 4, 75, 73, 4, 23};
       ArrayList<Integer> list = convertToArrayList(arr);
       list.add(5);
       System.out.println(countOdd(list));
       int[] arr2 = new int[] {40, 50, 6, 7, 80, 9};
       ArrayList<Integer> list2 = convertToArrayList(arr2);
       System.out.println(checkDuplicates(list, list2));

    }
}
