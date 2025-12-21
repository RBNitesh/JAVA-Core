public class moveZeroatEnd {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
       System.out.println();
    }
    public static int[] moveZero(int [] arr, int n){
    
        int j=0;
       for(int i= 0; i<n ; i++){
        if(arr[i]!=0 && arr[j]==0){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           }
           if(arr[j]!=0){
            j++;
           }
       }return arr;

    }
    public static void main(String[] args) {
       int[] myArray= {0,45,67,5,8,0,2,0,44,0,2,5,0,7};
       printArray(myArray );
       int [] result=moveZero(myArray, myArray.length);
       printArray(result);
    }
    
}
