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
        System.out.println(tree.size());


    }
}
