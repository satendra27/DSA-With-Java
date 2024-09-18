import java.io.*;
public class BinaryTree3 {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node node =  null;
    public static Node node_func(BufferedReader br) throws IOException{
        System.out.println("Enter the Root Node of the Tree: ");
        int data = Integer.parseInt(br.readLine());
        Node node = new Node(data);
        Population(br,node);
        return node;
    }

    public static void Population(BufferedReader br,Node node) throws IOException{
        System.out.println("Do you want to Enter left of "+node.data);
        boolean left = Boolean.parseBoolean(br.readLine());
        if(left){
            System.out.println("Enter the value of the left of "+node.data);
            int data = Integer.parseInt(br.readLine());
            node.left = new Node(data);
            Population(br, node.left);
        }


        System.out.println("Do you want to Enter right of "+node.data);
        boolean right = Boolean.parseBoolean(br.readLine());
        if(right){
            System.out.println("Enter the value of the left of "+node.data);
            int data = Integer.parseInt(br.readLine());
            node.right = new Node(data);
            Population(br, node.right);
        }
    }

    public static void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+"  ");
        inorder(node.right);

    }
    public static void main(String arg[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node node = node_func(br);
        inorder(node);
    }
}
