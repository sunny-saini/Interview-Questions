package com.core.oop;
class Soluti1 {
    public int[] vowelStrings(String[] words, int[][] queries) {

        int preFixSum[]=new int [words.length];

        int startAndEndWithVowels=0;

        int i=0;

        for(String word: words){
            if(startWithEndWithVowels(word)){
                startAndEndWithVowels++;
            }
            preFixSum[i++]=startAndEndWithVowels;

        }

        int result[]=new int[queries.length];

        i=0;

        for(int [] query: queries){
            result[i++]=preFixSum[query[1]]-(query[0]==0 ?0 : preFixSum[query[0]-1]);
        }
        return result;
    }

    private boolean startWithEndWithVowels(String word){

        return isVowels(word.charAt(0)) && isVowels(word.charAt(word.length()-1));

    }

    private boolean isVowels(char c){
        if (c == 'a') return true;
        if (c == 'e') return true;
        if (c == 'o') return true;
        if (c=='i') return true;
        if (c == 'u') return true;
        return false;
    }

}