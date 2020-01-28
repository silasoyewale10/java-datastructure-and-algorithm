package datastructures.tree;

public class NodeString {
        String value ;
        NodeString left;
        NodeString right;

    public NodeString(String value, NodeString left, NodeString right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public NodeString (String value){
        this.value = value;
        this.left = null;
        this.right=null;
    }
}
