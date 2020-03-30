/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree=new MyBinarySearchTree();
        int[] insertData={13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 18};
        for (int a:
                insertData) {
            myBinarySearchTree.insert(a);
            System.out.print("Inserted : "+a+"  ");
        }
        MyQueue myQueue=new MyQueue();
        int temp;
        for (int b:
             insertData) {
            temp=myBinarySearchTree.getPreOrderSuccessor(b);
            myQueue.enQueue(temp);
        }

        myQueue.viewAll(insertData);

    }
}
