public class GenericTree<X> {
    private final X data;

    private GenericTree<X> left;

    private GenericTree<X> right;

    public GenericTree(X data) {
        this.data = data;
        this.left = this.right = null;
    }

    void preOrder() {
        System.out.print(this.data + " ");
        if (this.left != null)
            this.left.preOrder();
        if (this.right != null)
            this.right.preOrder();
    }

    void inOrder() {
        if (this.left != null)
            this.left.inOrder();
        System.out.print(this.data + " ");
        if (this.right != null)
            this.right.inOrder();
    }

    void postOrder() {
        if (this.left != null)
            this.left.postOrder();
        if (this.right != null)
            this.right.postOrder();
        System.out.print(this.data + " ");
    }

    public static void main(String[] args) {

        // This is a tree of integers
        GenericTree<Integer> intergerRoot = new GenericTree<>(1);
        intergerRoot.left = new GenericTree<>(2);
        intergerRoot.right = new GenericTree<>(3);

        System.out.print("PreOrder Integer Tree: ");
        intergerRoot.preOrder();
        System.out.println();
        System.out.print("InOrder Integer Tree: ");
        intergerRoot.inOrder();
        System.out.println();
        System.out.print("PostOrder Integer Tree: ");
        intergerRoot.postOrder();
        System.out.println();

        // This is a tree of floats
        GenericTree<Float> floatRoot = new GenericTree<>(1.2f);
        floatRoot.left = new GenericTree<>(2.4f);
        floatRoot.right = new GenericTree<>(3.4f);

        System.out.println();
        System.out.print("PreOrder Float Tree: ");
        floatRoot.preOrder();
        System.out.println();
        System.out.print("InOrder Float Tree: ");
        floatRoot.inOrder();
        System.out.println();
        System.out.print("PostOrder Float Tree: ");
        floatRoot.postOrder();
        System.out.println();

        // This is a tree of boolean
        GenericTree<Boolean> booleanRoot = new GenericTree<>(true);
        booleanRoot.left = new GenericTree<>(false);
        booleanRoot.right = new GenericTree<>(true);

        System.out.println();
        System.out.print("PreOrder Boolean Tree: ");
        booleanRoot.preOrder();
        System.out.println();
        System.out.print("InOrder Boolean Tree: ");
        booleanRoot.inOrder();
        System.out.println();
        System.out.print("PostOrder Boolean Tree: ");
        booleanRoot.postOrder();
        System.out.println();

    }
}
