package com.core.hashing;

import java.util.*;

public class Hasing {
    public static void main(String[] args) {
//boolean re=Hasing.subzero(new int[]{2,5,3,6,9,11});
                                //     0,1,2, 3 4 5  6 7 8 9  10
 int re1=Hasing.longSubArray(new int[]{2,3,3,-6,3,3,-6,6,-3,4,-4});
System.out.println(re1);            //[2,5,8, 2,5,8, 2,8 5,9, 5]
    }

    static boolean subzero(int arr[]){
        int N=arr.length;
        Set<Integer> set=new HashSet<>();
        int preFix[]=new int[N];

        preFix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            preFix[i]=preFix[i-1]+arr[i];
        }


        set.add(0);
        for (Integer el : preFix)
             {

                 if(set.contains(el)){
                     return true;
                 }
                 else {
                     set.add(el);
                 }

        }


        return false;
    }

    static int longSubArray(int arr[]){
        int N=arr.length;
        int ans=0;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int preFix[]=new int[N];

        preFix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            preFix[i]=preFix[i-1]+arr[i];
        }

        for (int i=0;i<arr.length;i++){
            if(mp.containsKey(preFix[i])){
              int l=i-mp.get(preFix[i]);
              ans= Math.max(ans,l);
            }
            else {
                mp.put( preFix[i],i);
            }
        }
      Arrays.stream(preFix).forEach(el->System.out.print(el+" "));
        System.out.println();
        return ans;
    }
}
