public class UseSearchIn2DMatrix{
        public static void main(String args[]){
            int arr[][] = {{11,22,33,44},{12,23,35,57},{15,25,35,45},{56,67,78,89}};
            System.out.println("Given matrix");
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[0].length ; j ++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            
            int searchingElement = 13;
                System.out.println("finding element= "+searchingElement);
            
    
           
           Solution obj1 = new Solution();
           System.out.println("is Available = "+obj1.searchMatrix(arr,10));
        }

}
 
