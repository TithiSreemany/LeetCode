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
    public ListNode reverseList(ListNode head) 
    {
       ListNode dummy = new ListNode();
       ListNode ptr = head;
       dummy=null;
        while (ptr!=null)
        {
            ptr=head.next;
            head.next = dummy;
            dummy =head;
            head=ptr;
        }
        return dummy;
    }
}