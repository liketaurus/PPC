/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class Tree {

    private String name;
    private Tree child;

    private String root;
    private ArrayList<Tree> parents = new ArrayList<Tree>();
    private HashMap<String, Tree> position = new HashMap<String, Tree>();

    public Tree(String name) {
        this.name = name;
        position.put(root, this);
    }

    public Tree addParent(String parent) {
        Tree t = new Tree(parent);
        parents.add(t);
        t.child = this;
        t.position = this.position;
        position.put(parent, t);
        return t;
    }

    public int getSize() {
        return position.size();
    }

    @Override
    public String toString() {
        return printTree(0);
    }

    private static final int indent = 5;

    private String printTree(int x) {
        String s = "";
        String inc = "";
        for (int i = 0; i < x; ++i) {
            inc = inc + " ";
        }
        s = inc + name;
        for (Tree child : parents) {
            s += "\n" + child.printTree(x + indent);
        }
        return s;
    }
}
