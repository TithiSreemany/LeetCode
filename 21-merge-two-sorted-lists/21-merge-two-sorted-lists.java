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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode head = new ListNode();
        ListNode ptr = head;
        ListNode p1= list1;
        ListNode p2= list2;
        while(p1!=null && p2!=null)
        {
            if(p1.val<=p2.val)
            {
                ptr.next=p1;
                p1=p1.next;
                ptr=ptr.next;
            }
            else
            {
                ptr.next=p2;
                p2=p2.next;
                ptr=ptr.next;
            }
        }
        if(p1!=null)
        {
            while(p1!=null)
            {
                ptr.next=p1;
                p1=p1.next;
                ptr=ptr.next;
            }
        }
        if(p2!=null)
        {
            while(p2!=null)
            {
                ptr.next=p2;
                p2=p2.next;
                ptr=ptr.next;
            }
        }
        return head.next;
    }
}