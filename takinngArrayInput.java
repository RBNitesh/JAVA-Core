import java.util.Scanner;

public class takinngArrayInput
 {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the arr: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the element: ");
        for(int i=0; i<n; i++)
        {
        arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
        System.out.print(arr[j]+ " ");
        }

    }
}
