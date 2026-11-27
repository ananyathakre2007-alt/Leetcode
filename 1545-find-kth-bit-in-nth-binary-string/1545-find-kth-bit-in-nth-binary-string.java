class Solution {
    public char findKthBit(int n, int k) {
        return Function(n).charAt(k-1);
        
    }

    static String Function(int i){
        if(i==1){
            return "0";
        }
        String ans = Function(i-1);
        return ans+ "1" + reverse(invert(ans));

    }

    static String reverse(String s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            s1.append(s.charAt(i));
        }
        return s1.toString();
    }

    static String invert(String s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                s1.append('1');
            } else {
                s1.append('0');
            }
        }
        return s1.toString();
    }
}