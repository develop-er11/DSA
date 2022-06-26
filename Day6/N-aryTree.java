/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
   
        List<Integer> ans = new ArrayList<Integer>();
        
    public List<Integer> preorder(Node root) {
        
        if(root==null){//corner case -  incase there is no node in tree
            return new ArrayList<Integer>();
        }
        
        ans.add(root.val);// to make preorder we have to add value before anything
        
        for(Node child : root.children){
            preorder(child);
        }
        
        return ans;
    }
}
