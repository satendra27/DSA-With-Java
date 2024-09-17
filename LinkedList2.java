import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("list");
        list.addFirst("This");
        list.add("linked"); // add always add in last
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        list.remove(1);
        System.out.println(list);
    }
}
