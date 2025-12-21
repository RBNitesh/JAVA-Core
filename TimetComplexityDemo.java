import java.sql.Time;

public class TimetComplexityDemo {
    public static void main(String[] args)
     {

        long  now =System.currentTimeMillis();

        TimetComplexityDemo obj = new TimetComplexityDemo();
        System.out.println(obj.findSum(999));
        System.out.println("Time  taken-" +(System.currentTimeMillis() - now ) + "millisecs.");
     }
        int findSum(int n)
        {
           return n*(n+1)/2;
        }       
        
      /*int findSum(int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + i;

        }
        return sum;
    }*/
   
  }

