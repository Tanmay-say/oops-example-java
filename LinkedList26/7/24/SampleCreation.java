import java.util.LinkedList;

public class SampleCreation {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(6);
        
        // Printing the third element (index 2) of the list
        System.out.println("First List : " + list.get(2));

        int i = 1;
        int j = 1;
        
        // Printing every second element starting from index 1
        while (j < list.size()) {
            System.out.print(list.get(i) + " ");
            i += 2;
            j++;
        }
        System.out.println(list.get(i - 1));
    }
}
