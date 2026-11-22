class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        for(int i=1;i<n;i++){
            char ch=s.charAt(i-1);
            char ch2=s.charAt(i);
            if(ch=='b' && ch2=='a'){
                return false;
            }
        }
        return true;
    }
}