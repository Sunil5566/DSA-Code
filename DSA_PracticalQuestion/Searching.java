class Searching {
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int val) { data = val; }
    }

    static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        System.out.println("Linear Search result: " + linearSearch(arr, 15));
        System.out.println("Binary Search result: " + binarySearch(arr, 20));

        TreeNode root = null;
        root = insert(root, 20);
        insert(root, 10);
        insert(root, 30);
        insert(root, 5);
        insert(root, 15);
        System.out.print("Inorder traversal of Tree: ");
        inorder(root);
    }
}

