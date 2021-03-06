/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Tickets {
    
    private int numOfTickets = 0;
    private ArrayList<String> numbers = new ArrayList<>();
    
    public int getNumOfTickets() {
        return numOfTickets;
    }
    
    public void getNumbers(int cols) {
        int i = 0;
        for (String s : numbers) {
            System.out.print(s + "\t");
            i++;
            if (i > cols) {
                System.out.println();
                i = 0;
            }
        }
    }
    
    public void GetAllTickets() {
        for (int i = 0; i < 1000000; i++) {
            String number = ConstructNumber(i);
            if (IsLucky(number)) {
                numbers.add(number);
                numOfTickets++;
            }
        }
        
    }
    
    private boolean IsLucky(String number) {
        int left = number.charAt(0) + number.charAt(1) + number.charAt(2);
        int right = number.charAt(3) + number.charAt(4) + number.charAt(5);
        return left == right;
    }
    
    private String ConstructNumber(int num) {
        StringBuilder number = new StringBuilder("");
        int numOfZeros = 6-String.valueOf(num).length();        
        for (int j = numOfZeros; j > 0; j--) {
            number.append('0');            
        }
        number.append(num);
        return number.toString();
    }
    
    public static void main(String[] args) {
        
        Tickets t = new Tickets();
        t.GetAllTickets();
        System.out.println("Всего счастливых билетов: " + t.getNumOfTickets() + " штук");
        t.getNumbers(10);
        
    }
    
}
