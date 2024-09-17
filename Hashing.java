import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);
    System.out.println(set);
    // set.remove(1);
    if(set.contains(1)){
        System.out.println("Found");
    }else{
        System.out.println("Not Found");
    }

    System.out.println("Size of Set is :"+ set.size());

    // Iterator
    Iterator<Integer> it = set.iterator();
    // HaseNext => Return True or False ,Next => returns next values of set
    while (it.hasNext()) {
        System.out.println(it.next());
        
    }
    
    }
    
}
