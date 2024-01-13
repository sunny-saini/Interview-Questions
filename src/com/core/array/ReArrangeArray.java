package com.core.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReArrangeArray {
    public static void main(String[] args) {
        List<Integer> li = new ReArrangeArray().arrange( new ArrayList<>(Arrays.asList(0, 2, 1, 3)));
        System.out.println(li);
    }

    public List<Integer> arrange(ArrayList<Integer> A) {
        int mul = A.size();
        for(int i = 0; i < A.size(); i++){ //0,8,4,12
            int val = mul * A.get(i);
            A.set(i,val);
        }
        for(int i = 0; i < A.size(); i++){ //0,9,6,15
            int newidx = A.get(i)/mul;
            int newval = A.get(newidx)/mul + A.get(i);
            A.set(i,newval);
        }
        for(int i = 0; i < A.size(); i++){ //0,1,2,3
            int val = A.get(i) % mul;
            A.set(i,val);
        }
        return A;
    }
}
