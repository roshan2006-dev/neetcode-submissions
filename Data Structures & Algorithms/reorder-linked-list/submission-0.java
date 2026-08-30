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
    public void reorderList(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        int n=st.size()/2;
        ListNode curr=head;
        for(int i=0;i<n;i++){
            ListNode f=curr.next;
            ListNode l=st.pop();
            curr.next=l;
            l.next=f;
            curr=f;
        }
        curr.next=null;
    }
}
