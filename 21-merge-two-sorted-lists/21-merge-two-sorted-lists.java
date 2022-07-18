/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result_node = new ListNode();

        // 내가 지정한 값이 head로
        ListNode curr_node = result_node;

        while(l1 != null && l2 != null) {
            if(l1.val < l2.val ) {
                curr_node.next = l1;
                l1 = l1.next;
            } else {
                curr_node.next = l2;
                l2 = l2.next;
            } // if ~ else end

            // 노드가 위의 과정을 끝낸 현재와 같도록
            curr_node = curr_node.next;
        } // while end

        // 둘 중 하나가 null이 되어도 다른 하나가 끝날 때 까지 실행
        // l1이 null이면 l2를 저장
        if(l1 == null) {
            curr_node.next = l2;
        }
        // l2가 null이면 l1을 저장
        if(l2 == null) {
            curr_node.next = l1;
        }

        return result_node.next;
    }
}