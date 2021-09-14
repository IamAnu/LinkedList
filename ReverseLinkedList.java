/*
	You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
*/

public class Solution {

	public static void printReverse(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null)
            return ;
        printReverse(head.next);
        System.out.print(head.data +" "); 
        
	}

}