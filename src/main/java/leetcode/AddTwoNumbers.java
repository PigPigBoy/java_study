package leetcode;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @author: KongKongBaby
 * @create: 2020-05-16 12:49
 * @description: 给出两个 非空 的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 **/

public class AddTwoNumbers {

    @Test
    public void test1() {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list2.add(6);
        list2.add(6);
        list2.add(8);
        LinkedList<Integer> res = addTwoNumbers(list1, list2);
        System.out.println(res);
    }

    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        boolean carry = false; //是否进位
        LinkedList<Integer> res = new LinkedList<>();
        if (null == list1) return list2;
        if (null == list2) return list1;
        int size = Math.max(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            System.out.print(list1.get(i));
            System.out.print("——");
            System.out.println(list2.get(i));
            int i1 = null == list1.get(i) ? 0 : list1.get(i);
            int i2 = null == list2.get(i) ? 0 : list2.get(i);
            int carryTemp = carry ? 1 : 0;
            int sumTemp = i1 + i2 + carryTemp;
            if (sumTemp >= 10) {
                res.add(i, sumTemp % 10);
                carry = true;
            } else {
                res.add(i, sumTemp);
                carry = false;
            }
            if (i == size - 1 && carry)
                res.add(size, 1);
        }
        return res;
    }

    @Test
    public void test2() {
        ListNode l = new ListNode(2);
        l.next = new ListNode(4);
        l.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode res = addTwoNumbers(l, l2);
        ListNode current = res;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (null == l1) return l2;
        if (null == l2) return l1;
        int carry = 0; // 进位0和1
        ListNode res = new ListNode(0); // 返回的结果
        ListNode currentRes = res;
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        while (null != currentL1 || null != currentL2) {
            int i1 = null == currentL1 ? 0 : currentL1.val;
            int i2 = null == currentL2 ? 0 : currentL2.val;

            int sum = i1 + i2 + carry;
            if (sum >= 10) {
                sum -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            currentRes.next = new ListNode(sum);
            currentRes = currentRes.next;
            if (null != currentL1)
                currentL1 = currentL1.next;
            if (null != currentL2)
                currentL2 = currentL2.next;

//            System.out.println(i1 + " " + i2 + " " + sum);
        }
        if (carry == 1) {
            currentRes.next = new ListNode(1);
        }
        return res.next;
    }
}