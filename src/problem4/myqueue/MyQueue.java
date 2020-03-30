/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;

public class MyQueue {
    QueueNode root;
    public void enQueue(int data){
        QueueNode newInput=new QueueNode();
        newInput.setData(data);
        newInput.setNext(null);
        if (root==null){
            root=newInput;
        }
        else {
            QueueNode temp=root;
            while (temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(newInput);
        }
    }

}
