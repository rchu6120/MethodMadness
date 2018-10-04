public class RChuLib {

    public static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String dateStr(String date) {
        String month = date.substring(0,2);
        String day = date.substring(3,5);
        String year = date.substring(6,10);
        return day + "-" + month + "-" + year;
    }

    /*
    public static String cutOut(String mainStr,String subStr) {
      for (int i=0; i <= mainStr.length()-1; i++) {
          if (subStr)
      }
    }
*/
    public static void printFibonnaci (int n) {
        int num1 = 0;
        int num2 = 1;
        while (num1 + num2 < n) {
            System.out.println(num1+num2);
            num1 = num2;
            num2 = num1 + num2;
        }
    }
}