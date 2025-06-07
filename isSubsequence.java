class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;

        while(i<s.length()&&j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;//this wll check if the s string is in the t string
            }
            j++;// and this move all t string to check
        }
        return i == s.length();// this will see if all the number are there
    }
}