public class bubbleSort {
    public static void main(String arg[]){
        int arr[] = {7,4,8,1,3};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){                 // Time Complexity: O(N^2);
                if(arr[j]>arr[j+1]){
                int temp;
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }

            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]);
        }
    }
}
