package leetcode;

import org.junit.Test;

/**
 * @author: KongKongBaby
 * @create: 2020-05-17 17:45
 * @description: Determine whether an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
 * Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 * <p>
 * Coud you solve it without converting the integer to a string?
 **/

public class PalindromeNumber {

    @Test
    public void test1() {
        System.out.println(isPalindrome(123321));
    }

    public boolean isPalindrome(int x) {
        if (x == 0)
            return true;
        if (x < 0 || x % 10 == 0)
            return false;
        if (x < 10)
            return true;
        int b = 0;
        while (x > b) {
            b = x % 10 + b * 10;
            x /= 10;
        }
        return x == b || x == b / 10;
    }
}