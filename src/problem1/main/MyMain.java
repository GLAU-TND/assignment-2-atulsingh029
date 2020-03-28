/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
//Problem statement:
/*

* Define & Implement your own algorithm, to traverse a Binary Search Tree and print all the left children
as well as also print the count of nodes who doesn't have left child.

*/
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree =new MyBinarySearchTree();
        int[] insertData={13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 18};
        for (int a:
             insertData) {
            myBinarySearchTree.insert(a);
            System.out.println(a);
        }
        System.out.println("Tree Traversal : ");
        myBinarySearchTree.traverse(myBinarySearchTree.root);
        System.out.println("\nTraversal of all Left Children : ");
        myBinarySearchTree.traverseLeftChildren(myBinarySearchTree.root);
        System.out.print("Number of  nodes without left child : ");
        myBinarySearchTree.noOfNodesWithoutLeftChild();

    }
}
