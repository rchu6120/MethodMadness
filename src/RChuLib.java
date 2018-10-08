public class RChuLib {

    /**
     *
     * @param word
     * @return
     */
    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param date
     * @return
     */
    public static String dateStr(String date) {
        String month = date.substring(0, 2);
        String day = date.substring(3, 5);
        String year = date.substring(6, 10);
        return day + "-" + month + "-" + year;
    }

    /**
     *
     * @param n
     * @return
     */
    public static boolean isFibonnaci(int n) {
        int num1 = 0;
        int num2 = 1;
        while (num1 + num2 <= n) {
            if (num1 + num2 == n) {
                return true;
            } else {
                int num3 = num1;
                num1 = num2;
                num2 = num3 + num2;
            }
        }
        return false;
    }

    /**
     *
     * @param n
     * @return
     */
    public static int sumUpTo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     *
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param n
     */
    public static void primePrinter(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static String caeCipher(String Message, int shift) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = alphabet.indexOf(Message);
        shift = (shift + index) % 26;
        Message = alphabet.substring(shift, shift + 1);
        return Message;
    }

    public static String vigCipher(String Message, String Key) {
        for
    }

    public static Double quadSolver(Double a, Double b, Double c) {
        String roots = "";

    }
    public static int leastCommonMultiple(int num1, int num2, int num3) {

    }
}


