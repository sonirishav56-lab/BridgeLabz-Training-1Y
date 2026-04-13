import java.util.*;

public class RemoveDuplicatess {
    public static void main(String[] args) {

        // Create ArrayList with duplicates
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("Original List: " + list);

        // Convert to Set to remove duplicates
        Set<Integer> set = new HashSet<>(list);

        // Convert back to ArrayList
        ArrayList<Integer> newList = new ArrayList<>(set);

        System.out.println("After Removing Duplicates: " + newList);
    }
}