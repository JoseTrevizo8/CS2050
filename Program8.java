import java.io.*;
// Jose Trevizo
// CS 2050
// Program 8
public class Program8 {
    static class Node{
        String word;
        Node left;
        Node right;
        public Node(String word){
            this.word = word;
        }
    }
    static class BinarySearchTree{
        Node root;
        public void insert(Node node){
            root = insertHelper(root, node);
        }
        private Node insertHelper(Node root, Node node){
            String word = node.word;
            if (root == null){ //checks if tree is empty
                root = node;
                return root;
            }
            else if (word.compareTo(root.word) < 0){ // inserting to the left of the tree after it compares
                root.left = insertHelper(root.left, node);
            } else{
                root.right = insertHelper(root.right, node); //inserting to the right of the tree after it compares
            }
            return root;
        }
        public int nodeCounter(Node node){ //method to count nodes
            if (node == null){
                return 0;
            }
            int count = 1;
            count += nodeCounter(node.left); // counts left nodes using recursion
            count += nodeCounter(node.right); // counts right nodes using recursion
            return count;
        }
        public int getHeight(Node node){
            if(node == null){
                return -1;
            }
            int leftHeight = getHeight(node.left); //counts left subtree for height
            int rightHeight = getHeight(node.right); //counts the right subtree for height
            int height = Math.max(leftHeight, rightHeight) + 1; //returns the highest height received and adds one for the root
            return height;
        }
        public int maxNumOfNode(int height){ // math for getting the max amount on nodes using the height of the tree
            if(height == -1){
                height = 0;
                Double heightInDouble = (double)height;
                int maxNodes = (int) Math.pow(2 ,heightInDouble) - 1;
                return maxNodes;
            } else {
                Double heightInDouble = (double) height;
                int maxNodes = (int) Math.pow(2, heightInDouble) - 1;
                return maxNodes;
            }
        }
    }

    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("dracula.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("analysis.txt"));
            BinarySearchTree bst = new BinarySearchTree();
            String line;
            while((line = reader.readLine()) != null){
                String[] words = line.split("[\\s]+"); // splits the lines for words
                for (String word: words) {
                    String wordsForTree = word.replaceAll("[^a-zA-Z]", "").toLowerCase(); //replaces special characters and turns each word to lower case
                    if (!wordsForTree.isEmpty()) {
                        bst.insert(new Node(wordsForTree));
                    }
                }
                
            }
            int nodeCount = bst.nodeCounter(bst.root);
            int treeHeight = bst.getHeight(bst.root);
            int maxNodes = bst.maxNumOfNode(treeHeight);
            writer.write("Jose Trevizo\nProgram 8\n");
            writer.write("Number of nodes: " + nodeCount);
            writer.write("\nHeight of the tree: " + treeHeight);
            writer.write("\nMax Number of Nodes using Tree Height: " + maxNodes);
            writer.write("\nDoes max number of nodes match the number of nodes available?: ");
            if(nodeCount == maxNodes){
                writer.write("Yes");
            } else {
                writer.write("No");
            }
            reader.close();
            writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
