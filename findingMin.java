public class findingMin {

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Invalid exception");
        }
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] myArray = new int[]{45, 65, 4, 676, 34, 67, 8};
        System.out.println("Minimum element of the myArray is: " +findMin(myArray));
        System.out.println("Maximum element of the myArray is: " +findMax(myArray));
        System.out.println("When array is not assigned with any value: ");
        System.out.println("Minimum element of the myArray is: " +findMin(new int[5]));
        System.out.println("Maximum element of the myArray is: " +findMax(new int[3]));
    }
}
