public class selectionSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
    }
    public static void main(String arg[]){
        int arr[] = {7,4,8,1,3};
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }

            }
            int temp;
                temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
                
        }
        printArray(arr);

    }
    
    
}
