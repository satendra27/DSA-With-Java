public class Trie1 {
    static class Node {
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26]; // a to z
            for(int i=0;i<26;i++){
                children[i] = null;
            }
            eow = false;                    
        }
        
    }

    static Node root = new Node();
    public static void insert(String word){   // Time Complexity => O(L);
        Node curr = root;
        for(int i=0;i<word.length();i++){     // 'a'-'a' = 0
            int idx = word.charAt(i) - 'a';   //'b'-'a' = 1
            if(curr.children[idx] == null){   //'z'-'a' = 25
                // add new Node
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }                                     
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if(node == null){
                return false;
            }
            if(i == key.length()-1 && node.eow == false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String arg[]){
        String words[] = {"the","a","there","their","any"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
    }
}
