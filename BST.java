import java.util.*;
public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) root.left = insert(root.left, val); 
        else root.right = insert(root.right, val); 

        return root;
    }

    public static void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if(root == null) return false;
        if(root.data == key) return true;

        if(root.data > key) return search(root.left, key);
        else return search(root.right, key);
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    } 

    public static Node delete(Node root, int val) {
        if(root.data < val) root.right = delete(root.right, val);
        else if(root.data > val) root.left = delete(root.left, val);
        else {
            //case-1
            if(root.left == null && root.right == null) return null;
            //case-2
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            //case-3
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if(root == null) return;
        if(root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if(root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for(int i=0; i <path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    public static void printToLeaf(Node root, ArrayList<Integer> path) {
        if(root == null) return;
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }
        printToLeaf(root.left, path);
        printToLeaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null) return true;
        if(min != null && root.data <= min.data) return false;
        else if(max != null && root.data >= max.data) return false;
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static Node createMirror(Node root) {
        if(root == null) return null;

        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    public static void preorder(Node root) {
            if(root == null) return;
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
    }

    public static Node createBST(int arr[], int st, int end) {
        if(st > end) return null;
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if(root == null) return;

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST2(ArrayList<Integer> inorder, int st, int end) {
        if(st > end) return null;
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST2(inorder, st, mid-1);
        root.right = createBST2(inorder, mid+1, end);
        return root;
    }

    public static Node balanceBST(Node root) {
        //inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        //seq -> balanced bst
        root = createBST2(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void main(String[] args) {
                //         8
                //        / \
                //       6   10
                //      /     \
                //     5       11
                //    /         \ 
                //   3           12
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = balanceBST(root);
        preorder(root);


        // int arr[] = {3, 5, 6, 8, 10, 11, 12};
        //         //     8
        //         //    / \
        //         //   5   11
        //         //  / \  / \
        //         // 3   6 10 12
        // Node root = createBST(arr, 0, arr.length-1);
        // preorder(root);


        // int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        // Node root = null;
        // for(int i=0; i <values.length; i++) {
        //     root = insert(root, values[i]);
        // }

        // inorder(root);
        // System.out.println();

        // root = createMirror(root);
        // preorder(root);

        // if(isValidBST(root, null, null)) System.out.println("Valid");
        // else System.out.println("Not valid");

        // printToLeaf(root, new ArrayList<>());

        // printInRange(root, 5, 12);

        // root = delete(root, 5);
        // System.out.println();

        // inorder(root);

        // if(search(root, 3)) System.out.println("Found");
        // else System.out.println("Not Found!");
    }
}
