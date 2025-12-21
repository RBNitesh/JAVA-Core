public class arrayUtil{

    public void printArray(int[] array){
        int n=array.length;
        for(int i=0; i<n ;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.print("\n");
    }

    public void arrayDemo(){
            int [] myArray=new int[5];
            myArray[0]=10;
            myArray[1]=11;
            myArray[2]=12;
            myArray[3]=13;
            myArray[4]=14;
        printArray(myArray);
        myArray[2]=22;
        printArray(myArray);
        System.out.println(myArray.length);
        }
        public static void main(String[] args) {
            arrayUtil arr=new arrayUtil();
            arr.arrayDemo();
    }
}