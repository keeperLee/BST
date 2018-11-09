public class BST<E extends Comparable<E>> {

    private class Node{
        public E e;
        public Node left,right;

        public Node(E e)
        {
            this.e =e;
            left = null;
            right = null;
        }

    }
    private Node root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    //向二分搜索树中添加新的元素e
    public boolean isEmpty(){
        return size == 0;
    }

    public void add(E e){
      root = add(root,e);
    }

    //向以node为根的二分搜索树中插入元素E，递归算法
    //返回插入新节点后二分搜索树的根
    private Node add(Node node ,E e){
        //递归终止条件
       if(node == null){
           size++;
           return new Node(e);
       }

       //递归调用
        if(e.compareTo(node.e)<0)
          node.left =   add(node.left,e);
        else if(e.compareTo(node.e)>0)
           node.right = add(node.left,e);
        return node;
    }

}
