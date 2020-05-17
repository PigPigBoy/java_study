package leetcode;

import org.junit.Test;

import java.util.Random;

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
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int m = random.nextInt(1000000000);
            System.out.println(m+ ": "+isPalindrome(m));
        }

    }

    public boolean isPalindrome(int x) {
        if (x == 0)
            return true;
        if (x < 0 || x % 10 == 0)
            return false;
        if (x < 10)
            return true;
        int a = x;
        int b = 0;
        while (a > b) {
//            System.out.println("a=" + a + ",b=" + b);
            b = a % 10 + b * 10;
            a /= 10;
        }
//        System.out.println("a=" + a + ",b=" + b);
        return (a == b || a > 0 && b > 0 && a == b / 10) ? true : false;
    }
}