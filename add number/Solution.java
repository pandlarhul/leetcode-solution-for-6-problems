public class Solution {
  public static ListNode addTwoNumbers (ListNode l1, ListNode l2) {
    ListNode first = l1;
    ListNode second = l2;
    int carry = 0;
    ListNode newList = null;
    ListNode pre = null;
    ListNode head = null;

    while (first != null && second != null)
      {
	int temp1 = first.val;
	int temp2 = second.val;

	  newList = new ListNode ((temp1 + temp2 + carry) % 10);
	if (pre != null)
	  {
	    pre.next = newList;
	  }
	else
	  {
	    head = newList;
	  }


	pre = newList;


	carry = (temp1 + temp2 + carry) / 10;

	first = first.next;
	second = second.next;
      }

    boolean isSecond = false;


    while (first != null)
      {
	int temp1 = first.val;

	newList = new ListNode ((temp1 + carry) % 10);
	pre.next = newList;
	pre = newList;

	carry = (temp1 + carry) / 10;
	first = first.next;
      }

    while (second != null)
      {
	int temp1 = second.val;

	newList = new ListNode ((temp1 + carry) % 10);
	pre.next = newList;
	pre = newList;

	carry = (temp1 + carry) / 10;
	second = second.next;
      }
    System.out.println (carry);

    if (carry != 0)
      {
	newList = new ListNode (carry);
	pre.next = newList;
      }

    return head;


  }
  
  
    public static void main(String args[]){
        ListNode number1 = null;
        int digitOfNumber1 = 4;
        int digitOfNumber2 = 5;
        
        // create first number
        for(int i =0; i < digitOfNumber1; i++){
            number1 = new ListNode(9,number1);
        }
        sop("number1 = ");
        showList(number1);
        
        
        ListNode number2 = null;
        // create second number
        for(int i =0; i < digitOfNumber2; i++){
            number2 = new ListNode(i+1,number2);
        }
        sop("\n");
        
        sop("number2 = ");
        showList(number2);
        
        
        ListNode total = addTwoNumbers(number1,number2);
        sop("\n");
        
        sop("the numbers and result are in reverse order=\n");
        sop("addition = ");
        showList(total);
	sop("\n");
        
        
        
    }
    
    
    public static void showList(ListNode list){
        ListNode ptr = list;
        while(ptr != null){
            sop(ptr.val+"");
            ptr = ptr.next;
        }
    }
    
    public static void sop(String output){
        System.out.print(output);
    }
  
}

