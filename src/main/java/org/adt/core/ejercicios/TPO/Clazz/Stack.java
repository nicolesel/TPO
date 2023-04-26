package org.adt.core.ejercicios.TPO.Clazz;

import java.util.Scanner;

public final class Stack {
    Scanner scan=new Scanner(System.in);
    private final int[] stack;
    private int count;
    private int n;

    public Stack(int n) {
        this.stack = new int[n];
        this.count = 0;
        this.n=n;
    }
    public void add() {
        if(n==count){
            System.out.println("Stack lleno");
            return;
        }
        for(int count=0;count<n;count++){
            System.out.println("Fila "+(count+1));
            int a= scan.nextInt();
            this.stack[this.count]=a;
        }
    }

    public void remove() {
        if(count == 0) {
            System.out.println("Error, no se puede desapilar una pila vacia");
            return;
        }
        this.count--;
    }


    public boolean isEmpty() {
        return this.count == 0;
    }

    public int getTop() {
        if(count == 0) {
            System.out.println("Error, no se puede obtener el tope de una pila vacia");
            return -1;
        }
        return this.stack[this.count - 1];
    }
   /* public int getPos(int m){
        int pos=0;
        while (!stack.isEmpty()){
            if(m==pos){
                return stack.getTop();
            }
            pos++;
            stack.remove();
        }
        return 0;
    }*/
}