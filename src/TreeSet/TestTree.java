package TreeSet;

/**
 * Created by gavri on 19.01.2016.
 */
public class TestTree {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(18);
        tree.add(17);
        tree.add(20);
        tree.add(5);
        tree.add(7);
        //tree.add(0);
        System.out.println(tree.size());
        System.out.println(tree.findMin());
        System.out.println(tree.findMax());
        //tree.clear();
        tree.add(77);
       // System.out.println(tree.size());
        tree.add(20);
       // System.out.println(tree.remove(20));
        System.out.println(tree.size());
        tree.add(90);
        tree.add(56);
        tree.add(59);
        tree.add(55);
        tree.add(99);
        tree.add(89);
        System.out.println(tree.size());
        System.out.println(tree.remove(77));
        System.out.println(tree.size());
    }
}
