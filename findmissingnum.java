public class findmissingnum {
    public static int findNum(int [] arr, int n){
        int sum = (n*(n+1)/2);
        for(int num : arr){
            sum=sum-num;
        }
        return sum;
 }

    public static void main(String[] args) {
        int[] myArray=new int[]{3,6,5,2,1,7};
        int item=findNum(myArray, myArray.length+1);
        System.out.println(item);
    }
}
