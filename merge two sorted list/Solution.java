class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newList = null;
        ListNode pre = null;
        ListNode head = null;
        
        while(l1 != null && l2 != null){
            if(l1.val  < l2.val){
                newList = new ListNode(l1.val);
                l1 = l1.next;
            }else {
                newList = new ListNode(l2.val);
                l2 = l2.next;
            }
            if(pre == null){
                head = newList;
            }else{
                pre.next = newList;
            }
            pre = newList;
        }
        while(l1!= null){
                newList = new ListNode(l1.val);
              if(pre == null){
                head = newList;
            }else{
                pre.next = newList;
            }
                l1 = l1.next;
                pre = newList;
        }
        
        while(l2!= null){
                newList = new ListNode(l2.val);
             if(pre == null){
                head = newList;
            }else{
                pre.next = newList;
            }
             
                l2 = l2.next;
                pre = newList;
        }
        return head;
    }
    

    
        public static void main(String args[]){
        ListNode list1 = null;
        int lengthOfList1 = 4;
        int lengthOfList2 = 5;
        
        // create first sorted list
        for(int i =0; i < lengthOfList1; i++){
            list1 = new ListNode(9,list1);
        }
        sop("list1 = ");
        showList(list1);
        
        
        ListNode list2 = null;
        // create second sorted list
        for(int i =lengthOfList2; i >= 0; i--){
            list2 = new ListNode(i+1,list2);
        }
        sop("\n");
        
        sop("list2 = ");
        showList(list2);
        
        
        ListNode resultList = mergeTwoLists(list1,list2);
        sop("\n");
        
        sop("merged list = ");
        showList(resultList);
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
