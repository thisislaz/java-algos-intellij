class Solution {

    public String mergeAlternately(String word1, String word2) {
        String newWord = "";
        if(word1.length() >= word2.length()) {
            for(int i=0; i<=word2.length();i++)
                if (i == word2.length()) {
                    newWord = newWord.concat(word1.substring(i, word1.length()));
                } else {
                    newWord = newWord.concat(word1.substring(i, i + 1) + word2.substring(i, i + 1));
                }
        } else if (word1.length()<word2.length()) {
            for(int i=0; i<=word1.length();i++) {
                if(i == word1.length()) {
                    newWord = newWord.concat(word2.substring(i,word2.length()));
                } else {
                    newWord = newWord.concat(word1.substring(i,i+1)+word2.substring(i,i+1));
                }

            }
        }

        return newWord;
    }
}

public class MergeAlternately {

    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.mergeAlternately("abc","pqr"));
        System.out.println(test.mergeAlternately("ab","pqrs"));
        System.out.println(test.mergeAlternately("abcd","pq"));

    }

}


