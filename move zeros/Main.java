public class Main{
public static void main(String args[]){
        Solution sol = new Solution();
        int input[] = {0, 1, 0, 3, 12};
        
	System.out.println("Input arrays = ");
	for(int i = 0; i < input.length ; i++){
		System.out.print(input[i]+" ");	
	}
	
	System.out.println("\nAfter moving all zeros to end =");
	

        sol.moveZeroes(input);
        sol.showArrayElement();
	System.out.println();
    }
}
