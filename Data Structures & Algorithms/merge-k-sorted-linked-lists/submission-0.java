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
    public ListNode mergeKLists(ListNode[] lists) {
      List<Integer> arr=new ArrayList<>();
        for(ListNode ll:lists){
            ListNode temp=ll;
            while(temp!=null){
                   arr.add(temp.val);
                   temp=temp.next;
            }
        }
        Collections.sort(arr);
        ListNode nn=new ListNode(0);
 ListNode temp=nn;
 for(int i=0;i<arr.size();i++){
    temp.next=new ListNode(arr.get(i));
    temp=temp.next;
 }
 return nn.next;
    }
}
