class array2{

    public static void printArray(int [] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
        //This method returns integer array
    public static int[] removeEven(int [] arr){
            int oddCount = 0;
            for(int i =0; i<arr.length; i++){
                if(arr[i]%2!=0){
                    oddCount++;
                }
            }
            int[] result = new int[oddCount];
            int index = 0;
            for(int i = 0; i<arr.length; i++){
                if(arr[i]%2!=0){
                    result[index]=arr[i];
                    index++;
                }
            }
            return result;
         }
        
        
        public static void main(String[] args) {
            
              int [] myArray = {1,2,3,4,5,6,7,8,9};
              System.out.println("Original array: ");
              printArray(myArray);
              int[] arrayAfterdeletingEven = removeEven(myArray);
              System.out.println("Array after removing even elements: ");
              printArray(arrayAfterdeletingEven);
            }
        
        }
