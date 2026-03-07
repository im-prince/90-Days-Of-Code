package day11.dsa;

public class palindromeLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode curr = head;
        ListNode middle = findMiddle(head);
        ListNode half = reverse(middle);
        while (half != null){
            if (curr.val != half.val){
                return false;
            }
            curr = curr.next;
            half = half.next;
        }
        return true;
    }


    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while (curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }


}
