class Solution {
    public int maxNumberOfBalloons(String text) {
        int n=text.length();
        StringBuilder result = new StringBuilder();
        char ch; 
        int count=0;
        String word = "balloon";
        for(int i=0;i<n;i++){
            if(text.charAt(i)=='b' || text.charAt(i)=='a'|| text.charAt(i)=='l' ||text.charAt(i)=='o'||text.charAt(i)=='n'){
                ch=text.charAt(i);
                result.append(ch);
                
            }
        }
        int b = 0, a = 0, l = 0, o = 0, nn = 0;

        for (int i = 0; i < result.length(); i++) {
            ch = result.charAt(i);

            if (ch == 'b') b++;
            else if (ch == 'a') a++;
            else if (ch == 'l') l++;
            else if (ch == 'o') o++;
            else if (ch == 'n') nn++;
        }

        l /= 2;
        o /= 2;

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, nn))));
    }
}