package com.core.string;


public class Permutation {
    public static void main(String[] args) {
        String str="ABC";

        Permutation pr= new Permutation();
        pr.permute(str,0,str.length()-1);

    }

    private void permute(String str, int l, int r) {

        if(l==r)
            System.out.println(str);
        else {
            for (int i=l;i<=r;i++){
               str= swap(str,l,i);
               permute(str,l+1,r);
                str= swap(str,l,i);

            }
        }


    }

    private String swap(String str, int i, int j) {

        char[] ch = str.toCharArray();

        char temp = ch[i];
        ch[i]=ch[j];
        ch[j]=temp;

        return String.valueOf(ch);
    }
}
