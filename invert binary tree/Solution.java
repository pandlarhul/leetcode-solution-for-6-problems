public class Solution {
	
    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }

    public static void main(String args[]){
	
	// create static tree
	TreeNode n4 = new TreeNode(40,null,null);
	TreeNode n5 = new TreeNode(50,null,null);
	TreeNode n6 = new TreeNode(60,null,null);
	TreeNode n7 = new TreeNode(70,null,null);

	TreeNode n2 = new TreeNode(20,n4,n5);

	TreeNode n3 = new TreeNode(30,n6,n7);
	TreeNode root = new TreeNode(10,n2,n3);

	// traverse the tree in preorder
	System.out.println("Original tree =");
	preOrder(root);
	
	// invert the tree
	root = invertTree(root);
	
	System.out.println();
	
	// traverse the tree after inverting
	System.out.println("inverted tree =");
	preOrder(root);
	System.out.println("\n");
	
	
    }
    
    
    public static void preOrder(TreeNode root){
        if(root != null){
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

   


}
