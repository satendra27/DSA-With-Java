public class recursion3 {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" From "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" From "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);


    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n,"S","H","D"); //S=>Source H=>Helper D=>Destination
    }
}
