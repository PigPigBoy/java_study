package leecode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: KongKongBaby
 * @create: 2020-05-16 12:19
 * @description: Given an array of integers,
 * return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * Example:  Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
 **/

public class TwoSum {
    /**1、暴力法
     *      第一个是2 扫描剩下的数字是否包含7
     *      第二个是2 扫描剩下的数字是否包含2
     *      第三个是11 扫描剩下的数字是否包含-2
     *      以此类推
     *      时间复杂度为O(n^2)
     *      空间复杂的为O(1)
     * 2、使用Map存放已扫描的数字
     *       第一个是2 Map为空，Map添加该数字 2（value）:0（index）
     *       第二个是7 Map扫描2，存在则直接返回，否则添加7:1
     *       以此类推
     */
    @Test
    public void test1(){
        int[] arr = {2,7,11,15};
        int target = 26;
        int[] res = twoSum(arr, target);
        System.out.println(Arrays.toString(res));
    }

    public int[] twoSum(int[] arr,int target){
        if (null == arr || arr.length < 2)
            return null;
        Map<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int n = target - arr[i];
            if (!m.containsKey(n)){
                m.put(arr[i],i);
            }
            else {
                return new int[]{m.get(n),i};
            }
        }
        return null;
    }

}
