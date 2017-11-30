/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.dmci.ict.se.datastructures;
import  java.util.LinkedList;
/**
 *
 * @author alwin
 * @param <Key>
 * @param <Value>
 */
public class BinaryTree <Key extends Comparable<Key>, integer>
{
    private Node root; // root of BST

    private class Node
    {
        private Key key; // key
//        private Value studentNr; // associated studentNrue
        private Node left, right; // links to subtrees
        private int N; // # nodes in subtree rooted here
        LinkedList<integer> studentNr = new LinkedList<integer>();

            public Node(Key key, int N)
            { 
                this.key = key; 
                
                this.N = N; 
            }
    }

    public int size()
    { 
        return size(root); 
    }

    private int size(Node x)
    {
        if (x == null) return 0;
        else return x.N;
    }

    public LinkedList get(Key key)
    { 
        return get(root, key);
    }

    private LinkedList get(Node x, Key key)
    { // Return studentNrue associated with key in the subtree rooted at x;
        // return null if key not present in subtree rooted at x.
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else
        {
            if(x.studentNr != null)
            {
                for(int i = 0; i < x.studentNr.size(); i++){
                    System.out.println(x.studentNr.get(i));
                }
            }
            return x.studentNr;
        }
    }

    public void put(Key key, integer studentNr)
    { // Search for key. Update studentNrue if found; grow table if new.
     root = put(root, key, studentNr);
    }

    private Node put(Node x, Key key, integer studentNr)
    {
    // Change key’s studentNrue to studentNr if key in subtree rooted at x.
    // Otherwise, add new node to subtree associating key with studentNr.
        if (x == null) 
        {
            return new Node(key, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) 
        {
            x.left = put(x.left, key, studentNr);
        }
        else if (cmp > 0)
        {
            x.right = put(x.right, key, studentNr);
        }
        else 
        {
            x.studentNr.add(studentNr);
     
        }
        
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }
    
    public Key select(int k)
    {
        return select(root, k).key;
    }
    
    private Node select(Node x, int k){
        if(x == null) 
        {
            return null;
        }
        int t = size(x.left);
        
            if(t > k) 
            {
                return select(x.left, k);
            }
            else if(t < k) 
            {
                return select(x.right, k-t-1);
            }
            else 
            {
                return x;
            }
    }
    
    public int rank(Key key)
    {
        return rank(key, root);
    }
    
    private int rank(Key key, Node x)
    {
        if(x == null) 
        {
            return 0;
        }
        int cmp = key.compareTo(x.key);
        
            if(cmp < 0) 
            {
                return rank(key, x.left);
            }
            else if(cmp > 0) 
            {
                return 1 + size(x.left) + rank(key, x.right);
            }
            else 
            {
                return size(x.left);
            }
    }

}
