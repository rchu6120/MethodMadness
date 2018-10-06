public class RChuLib {

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String dateStr(String date) {
        String month = date.substring(0, 2);
        String day = date.substring(3, 5);
        String year = date.substring(6, 10);
        return day + "-" + month + "-" + year;
    }

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

    public static int sumUpTo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void primePrinter (int n) {
        if (n == 2) {
            System.out.println(2);
        }
        for (int x=3; x <= n; x++) {
            for (int i=2; i <=9; i++) {
                if (x%i != 0) {
                    System.out.println(x);
                }
            }
        }
    }
}
