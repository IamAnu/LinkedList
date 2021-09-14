public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        
        int leng = length(head);
            
        if(head == null || i >= leng) return;
        int count = 0;
        while(count< i && head != null){
            head = head.next;
            count++;
        }
        System.out.print(head.data);
        System.out.println();
	}
    
    
    public static int length(LinkedListNode<Integer> head){
        int l =0;
        while(head != null){
            l++;
            head = head.next;
        }
        return l;
    }
}