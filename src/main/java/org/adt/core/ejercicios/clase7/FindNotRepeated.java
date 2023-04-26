package org.adt.core.ejercicios.clase7;

import org.adt.core.adt.implementation.dynamic.BinaryTree;
import org.adt.core.adt.implementation.dynamic.PriorityQueue;
import org.adt.core.adt.implementation.dynamic.node.PriorityNode;

import java.util.HashSet;
import java.util.Set;

public class FindNotRepeated {
    public static void main(String[] args) {
        //ANDA BIEN , ESTA MAL EL PRIORITYQUEUE CLASS

        BinaryTree binaryTree=new BinaryTree();
        binaryTree.create(1);
        binaryTree.addLeft(1);
        binaryTree.addRight(3);
        binaryTree.getLeft().addLeft(4);
        binaryTree.getLeft().addRight(4);
        binaryTree.getRight().addLeft(2);
        binaryTree.getRight().addRight(2);


        PriorityQueue visited = inOrder(binaryTree);
        System.out.println("Imprimiendo visited");
       while(!visited.isEmpty()){
            System.out.println(visited.getFirst());
            visited.remove();
        }
        Integer x=null;
        while (!visited.isEmpty()){
            int top1=visited.getFirst();
            visited.remove();
            int top2=visited.getFirst();
            visited.remove();
            if (!(top1==top2)){
                if(top2==visited.getFirst()){
                    x=top2;
                    break;
                }else {
                    x=top1;
                    break;
                }
            }
        }
        System.out.println("X = "+x);

    }

    public static PriorityQueue inOrder(BinaryTree binaryTree) {
        if(binaryTree == null || binaryTree.isEmpty()) {
            return null;
        }

        PriorityQueue visited = new PriorityQueue();

        inOrder(binaryTree, visited);
        return visited;
    }

    private static void inOrder(BinaryTree binaryTree, PriorityQueue visited) {
        if(binaryTree == null || binaryTree.isEmpty()) {
            return;
        }

        inOrder(binaryTree.getLeft(), visited);

        int value = binaryTree.getValue();

        visited.add(value,value);
        System.out.println(value);


        inOrder(binaryTree.getRight(), visited);
    }
}