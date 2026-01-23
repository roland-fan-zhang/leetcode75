package fr.uge.leetcode;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(var i = 0; i < flowerbed.length; i++){
            if(n <= 0) return true;
            if(flowerbed[i] == 0){
                var left = (i == 0) || (flowerbed[i - 1] == 0);
                var right = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                if(left && right){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}
