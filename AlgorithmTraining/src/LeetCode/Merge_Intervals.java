package LeetCode;
import java.util.*;
import java.io.*;
public class Merge_Intervals {
	public class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public List<Interval> merge(List<Interval> intervals) {
		if (intervals.size() <= 1)
	        return intervals;
	    
	    // Comparator 사용해서 intervals 정렬.
	    intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
	    
	    List<Interval> result = new LinkedList<Interval>();
	    int start = intervals.get(0).start;
	    int end = intervals.get(0).end;
	    
	    for (Interval interval : intervals) {
	        if (interval.start <= end) 
	            end = Math.max(end, interval.end);
	        else {                     
	            result.add(new Interval(start, end));
	            start = interval.start;
	            end = interval.end;
	        }
	    }
	    
	    
	    result.add(new Interval(start, end));
	    return result;

	}
}
