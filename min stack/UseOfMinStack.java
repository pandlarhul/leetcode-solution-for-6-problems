
public class UseOfMinStack{
        public static void main(String args[]){
             MinStack obj = new MinStack();

	    int pushingElement[]  = {10, 19, 9, 3, 1};
	
	    for(int i = 0; i < pushingElement.length; i++){
            obj.push(pushingElement[i]);
	    System.out.println("push="+pushingElement[i]);
	    }
            
            
            obj.pop();
	    System.out.println("pop");
            int param_3 = obj.top();
            int param_4 = obj.getMin();
            System.out.println("minimum value = "+param_4);
 
        }

}
 
