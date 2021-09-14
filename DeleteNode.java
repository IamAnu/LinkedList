public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        int l = length(head);
        
        if(pos >= l)
            return head;
        
        
        else if(pos ==0)
            return head = head.next;
        
        LinkedListNode<Integer> prev = head;
        int count =0;
        while(count < pos-1 && prev != null){
            prev = prev.next;
            count++;
        }
        if(prev.next != null)
            prev.next = prev.next.next;

        
        
        
         return head;
	}
    
    public static int length(LinkedListNode<Integer> head){
        int count =0;
        while(head != null){
            count++;
      	  head = head.next;
        }
        return count;
            
    }
}
