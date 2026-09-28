class Solution {
    public String reverseByType(String s) {
        int n=s.length();
        StringBuilder letter = new StringBuilder();
        StringBuilder special = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int letterIndex = 0;
        int specialIndex = 0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
            letter.append(ch);
        } else{
            special.append(ch);
        }
        } 
        letter.reverse();
        special.reverse();
        System.out.print(letter);
        System.out.println();
        System.out.print(special);

  for (int i = 0; i <n; i++) {
    char ch = s.charAt(i);

    if (Character.isLetter(ch)) {
        result.append(letter.charAt(letterIndex));
        letterIndex++;
    } else {
        result.append(special.charAt(specialIndex));
        specialIndex++;
    }

    }
        return result.toString();
        
  
   }
}