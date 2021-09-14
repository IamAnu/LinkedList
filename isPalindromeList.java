/* You have been given a head to a singly linked list of integers. 
	 Write a function check to whether the list given is a 'Palindrome' or not. 
*/


import java.util.*; 
public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        
        if(head == null)
            return true;
        
        if(head == null && head.next == null) return false;
        List<Integer> ll = new ArrayList<>();
        while(head != null){
            ll.add(head.data);
            head = head.next;
        }
        
        
        int start_index =0;
        int end_index = ll.size()-1;
        while(start_index < end_index){
            if(ll.get(start_index) != ll.get(end_index)) return false;
            start_index++;
            end_index--;
        }
        return true;
	}

}