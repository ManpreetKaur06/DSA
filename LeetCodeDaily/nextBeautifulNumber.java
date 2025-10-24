class NextBeautifulNumber {
    public int nextBeautifulNumber(int n) {
        for (int i = n + 1; ; i++) {
            if (isBeautiful(i)) return i;
        }
    }

    private boolean isBeautiful(int num) {
        String s = String.valueOf(num);
        int[] count = new int[10];
        
        for (char c : s.toCharArray()) {
            count[c - '0']++;
        }
        
        for (char c : s.toCharArray()) {
            int digit = c - '0';
            if (count[digit] != digit) return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        NextBeautifulNumber obj = new NextBeautifulNumber();
        int s = 1;
        int ans = obj.nextBeautifulNumber(s);
        System.out.println("Answer is: " + ans);
    }
}
