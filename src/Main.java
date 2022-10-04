public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(5775));
    }

    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;

        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }

        if (x == reverse) {
            return true;
        } else {
            return false;
        }
    }
}

