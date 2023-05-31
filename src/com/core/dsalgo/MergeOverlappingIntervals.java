package com.core.dsalgo;// Java program to merge overlapping Intervals in
// O(n Log n) time and O(1) extra space

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// An Interval

   class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }

       @Override
       public String toString() {
           return "Interval{" +
                   "start=" + start +
                   ", end=" + end +
                   '}';
       }
   }


public class MergeOverlappingIntervals {

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> mergedIntervals = new ArrayList<>();
        int i = 0;
        int n = intervals.size();

        // Add intervals that end before the new interval starts
        while (i < n && intervals.get(i).end < newInterval.start) {
            mergedIntervals.add(intervals.get(i));
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }

        // Add the merged new interval
        mergedIntervals.add(newInterval);

        // Add remaining intervals
        while (i < n) {
            mergedIntervals.add(intervals.get(i));
            i++;
        }

        return mergedIntervals;

    }



    // Driver Code
    public static void main(String args[]) {
        ArrayList<Interval> list=new ArrayList<>();
        list.add(new Interval(1,3));
        list.add(new Interval(6,9));
       // list.add(new Interval(2,5));
       // list.add(new Interval(4,7));
     List<Interval> result=  insert(list,new Interval(2,5));
     System.out.println(result);
    }
}

// This code is contributed by Gaurav Tiwari
// This code was fixed by Subham Mukhopadhyay
