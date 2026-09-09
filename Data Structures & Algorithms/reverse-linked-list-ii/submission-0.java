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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       List<Integer> arr=new ArrayList<>();
       ListNode t=head;
       while(t!=null){
        arr.add(t.val);
        t=t.next;
       }
       left=left-1;
       right=right-1;
       while(left<=right)
       {
        int temp=arr.get(left);
        arr.set(left,arr.get(right));
        arr.set(right,temp);
        left+=1;
        right-=1;
       }
       ListNode nn=new ListNode(-1);
       t=nn;
       for(int i=0;i<arr.size();i++){
        t.next=new ListNode(arr.get(i));
        t=t.next;
       }
       return nn.next;
    }
}