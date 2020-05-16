package leecode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: KongKongBaby
 * @create: 2020-05-16 16:00
 * @description: 最长 不包含 重复字母的 字串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 **/

public class LongestSubStrWithoutReaptChar {
    @Test
    public void test1(){
        System.out.println(lengthOfLongestSubstring("abc"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s))
            return 0;
        int start = 0;
        int end = 0;
        int n = s.length();
        boolean[] used = new boolean[128];
        int max = 0;
        while (end < n){
            if (used[s.charAt(end)]){
                max = Math.max(max,end-start);
                while (start < end && s.charAt(start) != s.charAt(end)){
                   used[s.charAt(start++)] = false;
                }
                start++;
                end++;
            }
            else {
                used[s.charAt(end)] = true;
                end++;
            }
        }
        return Math.max(max,end-start);
    }
}