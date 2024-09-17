class Recursion11{
    static int sum = 0;
    public static void print_num(int idx,int l,int n[]){
        
        if(l==idx){
                sum = sum + n[idx];
                System.out.println(sum);
            return;
        }
        sum = sum + n[idx];
        print_num(idx+1, l, n);

    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5};
        int idx=0;
        print_num(idx,n.length-1,n);
    }
}