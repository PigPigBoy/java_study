package 动态规划;

/**
 * @author: KongKongBaby
 * @create: 2020-05-16 07:57
 * @description: 连续子数组的最大和
 * 题目：
 * 给定一个整数数组（有正数有负数），找出总和最大的连续数列，并返回总和。
 * 示例：
 * 输入： [-2,1,-3,4,-1,2,1,-5,4]
 * 输出： 6
 * 解释： 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * <p>
 * 解题要求：
 * 1.不寻求网络答案，自主完成解题
 * 2.时间复杂度优化到O(N)甚至更低
 * 3.在开发环境中完成测试并截图
 * </p>
 **/

public class MaxSumForSubArray {
    public int getMaxSumOfSubArray(int[] arr) {
        if (null == arr || arr.length < 1)
            return 0;
        int MaxTemp = arr[0];
        int Max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            MaxTemp = Math.max(MaxTemp + arr[i], arr[i]);
            if (MaxTemp >= Max)
                Max = MaxTemp;
        }
        return Max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new MaxSumForSubArray().getMaxSumOfSubArray(arr));
    }
}
