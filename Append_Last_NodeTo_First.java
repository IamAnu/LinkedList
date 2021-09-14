
/* You have been given a singly linked list of integers along with an integer 'N'. 
   Write a function to append the last'N' nodes towards the front of the singly 
   linked list and returns the new head to the list. 
*/


 public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) { 
		//Your code goes here\
        
        if(head == null)
            return head;
        
        int leng = findLength(head);
        
        if(n == 0 || n == leng)
            return head;
        
        if(leng != n && n<leng){
            
            int diff =  leng - n;
        	LinkedListNode<Integer>  prev = null , curr = head;
            
            while(diff > 0){
                prev = curr;
                curr = curr.next;
                diff--;
                
            }
            
            prev.next = null;
            LinkedListNode<Integer>  newHead = head;
            head = curr;
            
               while (curr.next != null)
                curr = curr.next;
            
             curr.next  = newHead;
            
            
        }
        
        return head;
	}
    
    public static int findLength(LinkedListNode<Integer> head){
        int length = 0;
        while(head != null){
            length++;
            head = head.next;
        }
        return length;
        
        
    }

}