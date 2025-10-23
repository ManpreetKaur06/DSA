public class HasSameDigit1{

    public boolean sameDigit(String s) {
        int n = s.length();
        int[] digits = new int[n];

        // Convert string to digit array
        for (int i = 0; i < n; i++) {
            digits[i] = s.charAt(i) - '0';
        }

        // Repeatedly compute pairwise sums mod 10
        while (n > 2) {
            for (int i = 0; i < n - 1; i++) {
                digits[i] = (digits[i] + digits[i + 1]) % 10;
            }
            n--; // reduce the array length by one
        }

        // Return true if last two digits are equal
        return digits[0] == digits[1];
    }

    public static void main(String[] args) {
        HasSameDigit1 obj = new HasSameDigit1(); // create object
        String s = "3902";
        boolean ans = obj.sameDigit(s); // call non-static method using object
        System.out.println("Answer is: " + ans);
    }
}
