package com.core.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        List<List<Integer>> listOfList= new ArrayList<>();

        ArrayList<Integer> innerList= new ArrayList<>();

        innerList.add(1);
        innerList.add(2);
        innerList.add(3);
        listOfList.add(innerList);


        ArrayList < ArrayList < Integer >> ans2= new Solution().subsets(innerList);
        System.out.println(ans2);
    }
    ArrayList <ArrayList< Integer >> ans;
    void solve(int idx, ArrayList < Integer > cur, ArrayList < Integer > A) {
        if (idx == A.size()) {
            ans.add(new ArrayList < > (cur));
            return;
        }
        solve(idx + 1, cur, A); // not take
        int element = A.get(idx);
        cur.add(element); // DO
        solve(idx + 1, cur, A); // take
        cur.remove(cur.size() - 1); // UNDO
    }//[[], [3], [2], [2, 3], [1], [1, 3], [1, 2], [1, 2, 3]]
    public ArrayList < ArrayList < Integer >> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        ans = new ArrayList < > ();
        ArrayList < Integer > cur = new ArrayList < > ();
        solve(0, cur, A);
        // sort the list of list
        Collections.sort(ans, (ArrayList < Integer > first, ArrayList < Integer > second) -> {
            for (int i = 0; i < first.size() && i < second.size(); i++) {
                if (first.get(i) < second.get(i))
                    return -1;
                if (first.get(i) > second.get(i))
                    return 1;
            }
            if (first.size() > second.size())
                return 1;
            return -1;
        });
        return ans;
    }
}
