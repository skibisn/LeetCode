class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = "";

        if (strs.length == 0) {
            return longestPrefix;
        }

        longestPrefix = strs[0];
        for(int i=0; i<strs.length; i++){
            String s = strs[i];
            while(s.indexOf(longestPrefix) != 0){
                longestPrefix = longestPrefix.substring(0, longestPrefix.length()-1);
            }
        }

        return longestPrefix;
    }
}