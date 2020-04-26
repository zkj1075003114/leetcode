package com.leetcode;

/**
 * @Description:
 * @Project: leetcode
 * @Product: IntelliJ IDEA
 * @Author zkj
 * @Email:
 * @Created Date: 2020/4/26
 * @Created Time  21:18
 **/
public class ArrayStudy {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(6);

        ArrayStudy as = new ArrayStudy();
        ListNode listNode = as.addTwoNumbers(l1, l2);

        while (listNode != null ) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode cur = node;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int number = val1 + val2 + carry;

            carry = number / 10;
            int val = number % 10;
            cur.next = new ListNode(val);
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (carry == 1) {
            cur.next = new ListNode(1);
        }

        return node.next;
    }
}
