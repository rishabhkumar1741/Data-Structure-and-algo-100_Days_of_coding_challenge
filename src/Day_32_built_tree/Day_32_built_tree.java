package Day_32_built_tree;

public class Day_32_built_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree
    {
        static int idx=-1;
        public static Node builtTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"  ");

    }

    public static void main(String[] args) {
        int arr[] = {29,28,27,-1,-1,26,-1,-1,25,-1,24,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.builtTree(arr);
        
        System.out.println("postorder");
        postorder(root);
        System.out.println();
        System.out.println("inorder");
        inorder(root);
        System.out.println();
        System.out.println("preorder");
        preorder(root);


        
        
    }
    
}
