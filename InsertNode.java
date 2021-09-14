
public class Solution {

	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int pos, int data){
		//Your code goes here
        
        LinkedListNode<Integer> insertedNode = new  LinkedListNode<Integer> (data) ;
        LinkedListNode<Integer> prevNode = head ;
        int step = 0;
        
        if(pos == 0){
            insertedNode.next = head;
            return  insertedNode;
            
        }
        else {
                 while(step < pos-1  && prevNode != null){
                    prevNode = prevNode.next;
                    step ++;
                }
            if(prevNode != null){
                insertedNode.next = prevNode.next;
                prevNode.next = insertedNode;
            }
        }
        
       
        
        return head;
	}
}