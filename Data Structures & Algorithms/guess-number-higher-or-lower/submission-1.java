/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
 // consider it as an array of numbers from 1 to n , apply binary search on it using guess function which will give us a target value;
        int start = 1, end  = n;
        while(start <= end){
            int mid = start+(end-start)/2; // this is optimal way of finding mid (use it )
            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid) == -1){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}


