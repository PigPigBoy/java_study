package leetcode;

import org.junit.Test;

/**
 * @author: KongKongBaby
 * @create: 2020-05-17 16:35
 * @description: Given a 32-bit signed integer, reverse digits of an integer.
 * Example 1:  Input: 123 Output: 321
 * Example 2:  Input: -123 Output: -321
 * Example 3:  Input: 120 Output: 21
 * Note: Assume we are dealing with an environment
 * which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 **/
public class ReverseInteger {
    /**
     * @author: jiacheng.xing
     * @Date: 2020.05.17 16:59
     * @Description: 定义一个long类型存放翻转后的int。
     */
    @Test
    public void test1() {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(-2147483648));
    }

    public int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
        }
        return (int) n == n ? (int) n : 0;
    }
}
