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
        tree.add(0);
        System.out.println(tree.size());
        System.out.println(tree.findMin());
        System.out.println(tree.findMax());
        tree.clear();
        tree.add(77);
        System.out.println(tree.size());

    }
}
