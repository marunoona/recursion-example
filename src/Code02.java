public class Code02 {
    public static void main(String[] args) {
        String string = "marunoona";
        System.out.println(string + "의 길이:" + length(string));
        printCharsReverse(string);
        System.out.println();
        printBinary(6);
    }

    /**
     * 문자열 길이 계산
     *
     * @param string 문자열
     * @return 문자열 길이
     */
    private static int length(String string) {
        if (string.equals(""))
            return 0;
        else
            return 1 + length(string.substring(1));
    }

    /**
     * 문자열 뒤집어서 프린트
     *
     * @param str 문자열
     */
    private static void printCharsReverse(String str) {
        if (str.length() == 0) {
            return;
        } else {
            printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    /**
     * 2진수 구하기
     *
     * @param n
     */
    private static void printBinary(int n) {
        if (n < 2)
            System.out.print(n);
        else {
            printBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    /**
     * 배열의 합 구하기
     *
     * @param n
     * @param data
     * @return
     */
    private static int sum(int n, int[] data) {
        if (n <= 0)
            return 0;
        else
            return sum(n - 1, data) + data[n - 1];
    }
}
