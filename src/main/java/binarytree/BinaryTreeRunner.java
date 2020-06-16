package binarytree;

public class BinaryTreeRunner {
    public static void main(String[] args) {
        BinaryIntNode fortyTwo = new BinaryIntNode(42,null,null);
        //System.out.println(fortyTwo);
        BinaryIntNode forty = new BinaryIntNode(40,null,null);
        BinaryIntNode fifty = new BinaryIntNode(50,null,null);
        fortyTwo.setLeftChild(forty);
        fortyTwo.setRightChild(fifty);
        postOrder(fortyTwo);
    }
    public static void preOrder(BinaryIntNode n){
        if(n ==null){
            return;
        }
        System.out.println(n);
        preOrder(n.getLeftChild());
        preOrder(n.getRightChild());

    }
    public static void inOrder(BinaryIntNode n){
        if (n == null){
            return;
        }
        inOrder(n.getLeftChild());
        System.out.println(n);
        inOrder(n.getRightChild());

    }
    public static void postOrder(BinaryIntNode n){
        if (n == null){
            return;
        }
        postOrder(n.getLeftChild());
        postOrder(n.getRightChild());
        System.out.println(n);
    }
}
