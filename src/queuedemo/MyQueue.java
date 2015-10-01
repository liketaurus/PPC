/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuedemo;

/**
 *
 * @author Admin
 */
public class MyQueue {

    private QueueMember[] myQueue;
    private int current = 0;

    public MyQueue(int num) {
        this.myQueue = new QueueMember[num];
    }

    private class QueueMember {

        Object data;
        int parent;

        public QueueMember(Object data, int parent) {
            this.data = data;
            this.parent = parent;
        }
    }

    public void Add(Object data) {
        if (current <= myQueue.length-1) {
            myQueue[current] = new QueueMember(data, current - 1);
            current++;
        }
    }

    public Object Remove() {
        Object temp = myQueue[0].data;
        for (int i = 1; i < current; i++) {
            myQueue[i - 1] = myQueue[i];
            myQueue[i - 1].parent--;
        }
        myQueue[current-1] = null;
        current--;                    
        return temp;

    }

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < current; i++) {
            s = s + myQueue[i].data.toString() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        s = s + "]";
        return s;
    }
    
    //дополнительные методы
    public String Find (Object data)
    {
        String s="not found";
        for (int i = 0; i < current; i++) {
            if (data==myQueue[i].data)
                s="data: "+myQueue[i].data.toString()+", parent: "+myQueue[i].parent;
        }
        return s;
    }

    public int length()
    {
        return current;
    }
}
