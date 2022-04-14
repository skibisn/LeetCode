class Solution {
    public boolean isPalindrome(int x) {
        boolean result = true;

        if(x < 0) {
            return false;
        }

        String[] s = String.valueOf(x).split("");

        for(int i=0; i< (s.length/2); i ++){
            int z = s.length - i - 1;
            if(!s[i].equalsIgnoreCase(s[z])) {
                result = false;
                break;
            }
        }

        return result;        
    }
}