/*
	You have been given a singly linked list of integers where the elements
	 are sorted in ascending order. Write a function that removes the consecutive duplicate
	  values such that the given list only contains unique elements and returns the head to the updated list.
*/

public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if(head == null) return head;
        LinkedListNode<Integer> dummy = head;
        while(dummy.next!=null){
            if(dummy.data.equals(dummy.next.data)){
                dummy.next = dummy.next.next;
            }else{
                dummy = dummy.next;
            }
        }
        return head;
	}

}