class Trie3{
    static class Node{
        Node[] children;
        boolean eow;
        Node(){
            children = new Node[26];
            for(int i=0;i<25;i++){
                children[i] = null;
            }
        }
    }
    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }
    public static boolean search(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            if(i==word.length()-1 && curr.children[idx].eow==false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String arg[]){
        String words[] = {"hello","hi","there","their"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("he"));
    }
}