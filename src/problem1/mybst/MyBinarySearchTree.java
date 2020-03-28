/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;
// to implement BinarySearchTree

import problem1.node.TreeNode;

//function to be implemented
//insert
//traverse
//traverseLeftChildren
//noOfNodeWithoutLeftChild
public class MyBinarySearchTree {
    public TreeNode root;

    public void insert(int data) {
        TreeNode bstNode = new TreeNode(data);
        if (root == null) {
            root = bstNode;
        } else {
            TreeNode iteration = root;
            TreeNode nodeWhereInsertionIsToBeDone = null;
            while (iteration != null) {
                nodeWhereInsertionIsToBeDone = iteration;
                if (bstNode.getData() <= iteration.getData()) {
                    iteration = iteration.getLeftChild();
                } else {
                    iteration = iteration.getRightChild();
                }
            }
            if (bstNode.getData() <= nodeWhereInsertionIsToBeDone.getData()) {
                nodeWhereInsertionIsToBeDone.setLeftChild(bstNode);
            } else {
                nodeWhereInsertionIsToBeDone.setRightChild(bstNode);
            }
        }
    }


        public void traverse () {

        }


        public void traverseLeftChildren () {

        }


        public int noOfNodesWithoutLeftChild () {
            int response = -1;
            return response;
        }



}
