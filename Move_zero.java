public class Move_zero {
    static int[] arr={2,0,3,12,9,5,8,4,22,7};
    public static void main(String[] args) {
        System.out.print("Given Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int j=0; //j Focusing on zero element
        for(int i=0;i<arr.length;i++){ //i Focusing on non-zero element
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        System.out.print("\nUpdated Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
