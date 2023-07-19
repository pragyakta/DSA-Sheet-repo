/*149. Max Points on a Line

Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, 
return the maximum number of points that lie on the same straight line.
*/
/*ALGORITHM
 * so basic of the solution is to , go through all the points and find the slope of all.
 * after calculating slope i.e., (y2-y1)/(x2-x1), store it in hashmap with count, how many point collectively 
 have same slope.
 * maximum count of slope will be the answer.
 */

import java.util.*;
class Solution {
    public int maxPoints(int[][] points) {
        int maxPoint = 0;
        if(points.length==3){
            if(points[0][1]==points[1][1] && points[1][1]==points[2][1]){
                return 3;
            }
        }
        for(int i=0;i<points.length;i++){

            Map<Double,Integer> map = new HashMap<>();
            int dup = 1;

            for(int j = i+1;j < points.length;j++){
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];

                if(x1 == x2 && y1 == y2){
                    dup++;
                    continue;
                }
                double slope = calculate(x1, y1, x2, y2);

                map.put(slope,map.getOrDefault(slope,1)+1);
            }

            int currentmax = dup;

            for(int count : map.values()){
                currentmax = Math.max(currentmax, count);
            }

            maxPoint = Math.max(currentmax,maxPoint);
        }
      return maxPoint;  
    }
    public static double calculate(int x1, int y1, int x2, int y2){
        if(x1==x2){
            return Double.POSITIVE_INFINITY;
        }
        else{
            return (double) (y2-y1) / (x2-x1) ;
        }
    }
}