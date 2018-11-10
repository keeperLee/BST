import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        BST<Integer> bst = new BST<>();
        int[] nums = {5,3,6,8,4,2};
        for (int num:nums) {
            bst.add(num);
            ///////////////////////
            //          5       //
            //      /       \   //
            //     3        6   //
            //   /  \         \ //
            //  2    4        8 //
            //////////////////////
        }
        bst.preOrder();
        System.out.println();


        System.out.println("删除后：");
        bst.remove(6);
        bst.preOrder();
        System.out.println();


    }
}
