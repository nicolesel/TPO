package org.adt.core.ejercicios.TPO.Clazz;
import org.adt.core.ejercicios.TPO.Clazz.Stack;
import org.adt.core.ejercicios.TPO.Clazz.Stack;
import java. util. Scanner;

public class QueueOfStacks   {
    Scanner scan=new Scanner(System.in);
    private final Stack[] queue;
    private int count;
    private int n;

    public QueueOfStacks(int n) {
        this.queue = new Stack[n];
        this.count = 0;
        this.n=n;
    }

    public void add() {
        if(count==n){
            System.out.println("queue completa");
            return;
        }
        System.out.println("Completando stack N°"+(count+1));
        this.queue[this.count]=new Stack(3);;
        (this.queue[this.count]).add();
        this.count++;
    }

    public void remove() {
        if(count == 0) {
            System.out.println("Error, no se puede desacolar una cola vacia");
            return;
        }
        for(int i = 0; i < this.queue.length - 1; i++) {
            this.queue[i] = this.queue[i+1];
        }
        this.count--;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public Stack getFirst() {
        if(count == 0) {
            System.out.println("Error, no se puede obtener el primero de una cola vacia");
            return null;
        }
        return this.queue[0];
    }
    /*public static int getTrace(){
        int contador=0;
        int m=this.n-1;
        while(!this.isEmpty()){
            Stack queueTop=this.getFirst();
            contador+=queueTop.getPos(m);
            this.remove();
            m--;
        }
    }*/
}

