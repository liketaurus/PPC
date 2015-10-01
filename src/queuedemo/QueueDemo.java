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
public class QueueDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyQueue q = new MyQueue(4);
        
        q.Add("PPC");
        q.Add(35);
        q.Add("Software");
        q.Add(1256.5);
        
        System.out.println("Before: "+q);
        
        q.Remove();
        q.Add(12e+4);
        
        System.out.println("After: "+q);
        System.out.println("Length: "+q.length());
        
        System.out.println("Looking for Software..." + q.Find("Software") );
        System.out.println("Looking for PPC..." + q.Find("PPC") );
        
        q.Remove();
        System.out.println("After: "+q);
        System.out.println("Length: "+q.length());
        System.out.println("Looking for Software..." + q.Find("Software") );
    }
    
}
