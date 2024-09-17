import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Satendra", 1);
        map.put("Rohit", 2);
        map.put("Ajay", 4);
        map.put("Vijay", 3);
        System.out.println(map);
        map.put("Vijay", 5);
        System.out.println(map);

        if(map.containsKey("Satendra")){
            System.out.println("present");
        }else{
            System.out.println("Not Present");
        }

        System.out.println(map.get("Satendra"));      
        System.out.println(map.get("Satendra1"));

        for(Map.Entry<String,Integer>e:map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
        }
        Set<String>keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        map.remove("Satendra");
        System.out.println(map.size());
    }
}
