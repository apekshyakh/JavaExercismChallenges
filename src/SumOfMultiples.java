//Given a number, find the sum of all the unique multiples of particular numbers up to but not including that number.
//
//If we list all the natural numbers below 20 that are multiples of 3 or 5, we get 3, 5, 6, 9, 10, 12, 15, and 18.
//
//The sum of these multiples is 78.

//target = 20;
//set[] = {3,5}
//multiples[] = {3, 5, 6, 9, 10, 12, 15, 18}

import java.util.ArrayList;
import java.util.List;

class SumOfMultiples {
    int sum=0;
    List<Integer> multiples = new ArrayList<Integer>();

    public SumOfMultiples(int target, int[] set) {

        for(int i=1; i<target;i++){
           for(int c: set){

                   if(c !=0 && i%c == 0 && !multiples.contains(i)) {
                       multiples.add(i);
                       sum += i;
                   }
           }

        }

    }


    public int getSum() {
        return sum;
    }
}
