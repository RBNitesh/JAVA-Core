public class palindrome {
    public static boolean isPalindrome(String word){
        char[] charArray=word.toCharArray();
        int start=0;
        int end=word.length()-1;
        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrome("madam");
        if(isPalindrome("madam")){
            System.out.println("String  is Palindrome");

        }else{
            System.out.println("String is not palindrome");
        }
    }
}
