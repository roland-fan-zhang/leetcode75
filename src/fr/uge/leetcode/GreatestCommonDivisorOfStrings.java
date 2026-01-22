package fr.uge.leetcode;

public class GreatestCommonDivisorOfStrings {
    private int pgcd(int x, int y){
        if(y == 0) return x;
        return pgcd(y, x % y);
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        var length = pgcd(str1.length(), str2.length());
        return str1.substring(0, length);
    }
}