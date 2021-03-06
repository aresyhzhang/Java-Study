package zyh.Algorithm.DataStruct.tree;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/7/2
 * \* Time: 18:29
 * \
 */
//定义BinaryTree二叉树
public class BinaryTree {
    public static void main(String[] args) {
        //先创建一颗二叉树
        BinaryTree binaryTree=new BinaryTree();
        HeroNode root=new HeroNode( 1,"宋江" );
        HeroNode node2=new HeroNode( 2,"无用" );
        HeroNode node3=new HeroNode( 3,"卢俊义" );
        HeroNode node4=new HeroNode( 4,"林冲" );
        //
        root.setLeft( node2 );
        root.setRight( node3 );
        node3.setRight( node4 );
        binaryTree.setRoot( root );
        //测试
//        System.out.println("--前序遍历——");//1.2.3.4
//        binaryTree.preOrder();
        System.out.println("--中序遍历——-");//2,1,3,4
        binaryTree.infixOrder();
//        System.out.println("--后序遍历--");
//        binaryTree.postOrder();//2.4.3.1

    }
    private HeroNode root;
    public void setRoot(HeroNode root) {
        this.root = root;
    }
    //前序遍历
    public void preOrder(){
        if (this.root!=null){
            this.root.preOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    //中序遍历
    public  void infixOrder(){
        if (this.root!=null){
            this.root.infixOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }

    //后序遍历
    public  void postOrder(){
        if (this.root!=null){
            this.root.postOrder();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
}
class HeroNode{
    private  int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    private String name;
    private HeroNode left;
    private HeroNode right;
    public HeroNode(int no,String name){
        this.no=no;
        this.name=name;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    //前序遍历
    public  void preOrder(){
        System.out.println(this);//先输出父节点
        //递归向左子树
        if (this.left!=null){
            this.left.preOrder();
        }
        //递归向右子树前序遍历
        if (this.right!=null){
            this.right.preOrder();
        }
    }
    //中序遍历
    public void  infixOrder(){
        //递归向左子树中序遍历
        if (this.left!=null){
            this.left.infixOrder();
        }
        System.out.println(this);
        //递归向右子树中序遍历
        if (this.right!=null){
            this.right.infixOrder();
        }
    }
    //后序遍历
    public void postOrder(){
        if (this.left!=null){
            this.left.postOrder();
        }
        if (this.right!=null){
            this.right.postOrder();
        }
        System.out.println(this);
    }
}