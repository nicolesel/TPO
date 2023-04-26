package org.adt.core.ejercicios.clase7;
import org.adt.core.adt.implementation.dynamic.BinaryTree;


import java.util.HashSet;
import java.util.Set;
import org.adt.core.adt.implementation.dynamic.BinaryTree;

public class DeleteRepeatedNodes {

    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.create(1);
        binaryTree.addLeft(1);
        binaryTree.addRight(2);
        binaryTree.getLeft().addLeft(3);
        binaryTree.getLeft().addRight(5);
        binaryTree.getRight().addLeft(8);
        binaryTree.getRight().addRight(9);

        inOrder(binaryTree);


    }

    public static void inOrder(BinaryTree binaryTree) {
        if(binaryTree == null || binaryTree.isEmpty()) {
            return;
        }

        Set<Integer> visited = new HashSet<>();

        inOrder(binaryTree, visited);
    }

    private static void inOrder(BinaryTree binaryTree, Set<Integer> visited) {
        if(binaryTree == null || binaryTree.isEmpty()) {
            return;
        }

        inOrder(binaryTree.getLeft(), visited);

        int value = binaryTree.getValue();
        if(!visited.contains(value)) {
            visited.add(value);
            System.out.println(value);
        }

        inOrder(binaryTree.getRight(), visited);
    }

    // ...
}
