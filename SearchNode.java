/* 
	You have been given a singly linked list of integers. 
	Write a function that returns the index/position of integer 
	data denoted by 'N' (if it exists). Return -1 otherwise.
*/

	public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
        
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> searchNode = new LinkedListNode<Integer>(n);
        int count =0;
        
        while(temp != null){
			
            if(temp.data == searchNode.data)
                return count;
            
            else {
				
                temp = temp.next;
                count++;
            }
        
        }
        return -1;
        
        
        
	}
}