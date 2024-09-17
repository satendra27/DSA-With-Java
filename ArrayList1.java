import java.util.*;
public class ArrayList1{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> List3 = new ArrayList();

        // Add Element
        list.add(0);
        list.add(2);
        System.out.println( list);

        // Get Element
        int element=list.get(1);
        System.out.println(element);

        // Add element by index
        list.add(1,5);
        System.err.println(list);

        // Set Element
        list.set(0,6);
        System.out.println(list);

        // Delete Element
        list.remove(2);
        System.out.println(list);

        // Size
        int size = list.size();
        System.out.println(size);

        // Loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // sorting
        Collections.sort(list);
        System.out.println(list);


    }
}
