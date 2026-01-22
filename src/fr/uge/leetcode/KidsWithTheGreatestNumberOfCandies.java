package fr.uge.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var max = Arrays.stream(candies).max().orElse(0);
        return Arrays.stream(candies)
                .mapToObj(candy -> candy + extraCandies >= max)
                .toList();
    }

//    Optimal solution
//    public List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {
//        var list = new ArrayList<Boolean>();
//        var max = 0;
//        for (int candy : candies) {
//            max = Math.max(candy, max);
//        }
//        for(var candy : candies){
//            list.add(candy + extraCandies >= max);
//        }
//        return list;
//    }
}