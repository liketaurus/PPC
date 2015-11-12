/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 *
 * @author Admin
 */
public class Cash {

    public Cash() {
        BuyerCash.put(1, 0);
        BuyerCash.put(2, 2);
        BuyerCash.put(5, 1);
        BuyerCash.put(10, 3);
        BuyerCash.put(20, 0);
        BuyerCash.put(50, 0);
        BuyerCash.put(100, 0);
        BuyerCash.put(200, 0);
        BuyerCash.put(500, 0);
        a = new int[BuyerCash.size()];
    }
    private LinkedHashMap<Integer, Integer> BuyerCash = new LinkedHashMap<Integer, Integer>();
    private int[] a;
    
    private int BuyerSum() {
        int maxCash = 0;
        for (int i : BuyerCash.keySet()) {
            maxCash = maxCash + i * BuyerCash.get(i);
        }
        return maxCash;
    }

    private String getSum(int sum) {
        String s = "";
        int temp = 0;
        
        for (int i = BuyerCash.size() - 1; i >= 0; i--) {
            temp = (new ArrayList<Integer>(BuyerCash.keySet())).get(i);
            a[i] = sum / temp;
            sum = sum - a[i] * temp;
        }
        for (int i = BuyerCash.size() - 1; i >= 0; i--) {
            temp = (new ArrayList<Integer>(BuyerCash.keySet())).get(i);
            if (a[i] > 0) {
                s = s + Integer.toString(a[i]) + " x " + Integer.toString(temp) + " грн\t";
            }
        }
        return s;

    }
    
   
    public void getVariants() {
        for (int i = 1; i <= BuyerSum(); i++) {
            String temp = getSum(i);
            System.out.println(i + " грн: " + temp);
        }
    }


    public static void main(String[] args) {
        Cash c = new Cash();
        c.getVariants();

    }

}
