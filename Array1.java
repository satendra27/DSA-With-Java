public class Array1 {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5,6};
        int target = 5;
        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length-1;j++){
                if(n[i]+n[j] == target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
