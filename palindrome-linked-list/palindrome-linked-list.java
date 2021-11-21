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


class Solution 
{
    public boolean isPalindrome(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast = fast.next.next;
        }
        if (slow.next == null)
            return true;
        slow.next = reverse(slow.next);
        fast = head;
        slow = slow.next;
        while (slow!=null)
        {
            if (slow.val!=fast.val)
                return false;
            slow=slow.next;
            fast = fast.next;
        }
        return true;
    }
    public ListNode reverse(ListNode start)
    {
        ListNode temp = new ListNode();
        ListNode sec = new ListNode();
        temp=null;
        sec=null;
        while (start.next!=null)
        {
            sec=start.next;
            start.next=temp;
            temp=start;
            start=sec;
        }
        start.next= temp;
        return start;
    }
}