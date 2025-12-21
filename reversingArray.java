public class reversingArray {
    public static void printArray(int [] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static int[] reverseArray (int[] arr, int  start, int end)
    {
        int temp;
         while(start < end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
         }
                 return arr;
    }
    public static void main(String[] args) 
    {
        int[] myArray = new int[]{2,3,4,5,6,7,8};
        printArray(myArray);
        int[] result=reverseArray(myArray, 0,myArray.length - 1 );
        printArray(result);
    }        
}
