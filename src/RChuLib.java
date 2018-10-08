public class RChuLib {

    /**
     * Compares the first and last letter of the word.
     * If they are the same, the code checks the next two inner letters.
     * This continues until all letters are checked or if at any point, two letters that are being checked are not the same, the code will return false.
     * @param word a word that is to be inputted to see if it is a palindrome
     * @return a true or false statement based on the evaluation of the word
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
     * Converts the format of the date into a different format to be read
     * @param date the original format of the date in "mm/dd/yyyy"
     * @return the new format of the date in "dd - mm - yyyy"
     */
    public static String dateStr(String date) {
        String month = date.substring(0, 2);
        String day = date.substring(3, 5);
        String year = date.substring(6, 10);
        return day + "-" + month + "-" + year;
    }

    /**
     * Checks to see if a number that is inputted is in the fibonacci series
     * Adds num1 and num2 to see if it is equal to n and if it is, it is a fibonacci number
     * @param n the number to be checked if it is in the fibonacci series
     * @return a true or false statement based on the evaluation of the number
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
     * Adds all the numbers up to n including the value of n
     * @param n the number to be added up to including itself
     * @return the sum of all numbers up to n including n
     */
    public static int sumUpTo(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Finds the roots of the quadratic equation given three doubles
     * Uses the discriminant formula to check if there are roots
     * Uses the quadratic formula afterwards to find the roots provided they are real
     * @param a the coefficient of the leading degree, usually ax^2
     * @param b the coefficient of the second leading degree, usually bx
     * @param c the constant value, usually c
     * @return the value of the roots if any, and a statement that describes the roots, whether they are real or not
     */
    public static String quadSolver(Double a, Double b, Double c) {
        double x = (Math.pow(b,2)) - 4 * a * c;
        double root1 = ((-b + Math.sqrt(x))/2.0 * a);
        double root2 = ((-b - Math.sqrt(x))/2.0 * a);
        String twoRoots = "This quadratic equation has two real roots at " + root1 + " and " + root2 + ".";
        String oneRoot = "This quadratic equation has one real root at " + root1 + ".";
        String imaginaryRoot = "This quadratic equation has imaginary roots due to the value of the discriminant being less than 0.";
        if (x > 0)
            return twoRoots;
        if (x == 0)
            return oneRoot;
        if (x < 0)
            return imaginaryRoot;
        return "";
    }

}



