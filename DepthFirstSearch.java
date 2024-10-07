/**
 * This class provides a method to perform a depth-first
 * traversal of a tree in a preorder manner.
 */
public class DepthFirstSearch {
    Node root;  // Root of the tree
    private int nodeCount; // Counter for the nodes traversed

    /**
     * Constructor 
     */
    public DepthFirstSearch() {
        System.out.println("Call DFS with root node to do a Depth First Search.");
        this.nodeCount = 0; // Initialize node count
    }

    /**
     * Performs depth-first traversal starting from the specified node.
     * 
     * @param node The node to start the traversal from.
     */
    public void DFS(Node node) {
        if (node == null) {
            return; // if the node is null, return
        }

        // Print value of the current node
        System.out.println(node.getData());
        nodeCount++; // Increment node count

        // Recursively traverse the left and right children
        DFS(node.getlChild());
        DFS(node.getrChild());
    }

    /**
     * Gets the total number of nodes traversed during the DFS.
     * 
     * @return The number of nodes traversed.
     */
    public int getNodeCount() {
        return nodeCount;
    }

    /**
     * Calculates the height of the tree recursively.
     * 
     * @param node The node to calculate height from.
     * @return The height of the tree.
     */
    public int getHeight(Node node) {
        if (node == null) {
            return -1; // Base case: height of an empty tree is -1
        }

        // Calculate height of the left subtree and the right subtree
        int leftHeight = getHeight(node.getlChild());
        int rightHeight = getHeight(node.getrChild());

        // Return the height 
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
