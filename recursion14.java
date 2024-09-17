public class recursion14 {
    public static int num =0;
    public static void find_min(int arr[],int idx){
        if(arr.length-1 < idx){
            return;
        }else{
            if(arr[idx]<arr[idx+1]){
                num = arr[idx];

            }else{
                find_min(arr,idx+1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,3,4,6};
        int idx = 0;
        find_min(arr,idx);
    }
}
