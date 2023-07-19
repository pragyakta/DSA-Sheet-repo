/*
 593. Valid Square
Given the coordinates of four points in 2D space p1, p2, p3 and p4, return true if the four points construct a square.
The coordinate of a point pi is represented as [xi, yi]. The input is not given in any order.
A valid square has four equal sides with positive length and four equal angles (90-degree angles).
 */
/*ALGORITHM
 * so here we are picking one point and checking with all the points other than that for the distance and storing
 * those distance in hashset.
 * if size of hashSet is 2, also set does not contain 0 then return true, if not the false. 
 */
import java.util.*;
class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
         Set<Integer> sideLengths = new HashSet<>();
        int[][] points = {p1, p2, p3, p4};

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                sideLengths.add(calculate(points[i], points[j]));
            }
        }

        return sideLengths.size() == 2 && !sideLengths.contains(0);
    }
    static int calculate(int[] p1, int[] p2){
        int xdis= p1[0]-p2[0];
        int ydis= p1[1]-p2[1];
        return xdis*xdis + ydis*ydis;
    }
}
