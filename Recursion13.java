public class Recursion13 {
    static int num = 0;
    public static void find_max(int arr[],int idx){
        if(arr.length-1 < idx){
            System.out.println(num);
            return ;
        }else{
        if(arr[idx]>num){
            num = arr[idx];
            find_max(arr, idx+1);
        }else{
            find_max(arr, idx+1);
        }
    }
    }
    public static void main(String[] args) {
        int arr[] = {1007,4,8,300,510};
        int idx = 0;
        find_max(arr,idx);

    }
}
