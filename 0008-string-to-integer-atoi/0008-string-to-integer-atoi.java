class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // Step 1: Skip spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // If only spaces
        if (i == n) return 0;

        // Step 2: Sign
        int sign = 1;

        if (s.charAt(i) == '+') {
            i++;
        }
        else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        // Step 3: Read digits
        int num = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // Step 4: Overflow check
            if (num > (Integer.MAX_VALUE - digit) / 10) {

                return sign == 1 ?
                        Integer.MAX_VALUE :
                        Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }
}
