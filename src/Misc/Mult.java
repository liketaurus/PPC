/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

/**
 *
 * @author Admin
 */
public class Mult {

    private final int number;
    private final int[] a;
    private int i, sum, pos;

    public Mult(int n) {
        this.number = n;
        a = new int[n + 1];
    }

    public int getNumber() {
        return number;
    }

    private void generateCases(int i, int pos, int sum) {
        for (int j = 1; j <= number - 1; j++) {
            a[pos] = j;
            if (sum + j == number) {
                for (int k = 1; k <= pos; k++) {
                    if (k > 1) {
                        System.out.print("+" + a[k]);
                    } else {
                        System.out.print(a[k]);
                    }
                }
                System.out.println();
            } else if (sum + j < number) {
                generateCases(j, pos + 1, sum + j);
            }
        }
    }

    public void printSequence() {
        generateCases(1, 1, 0);
    }

    public static void main(String args[]) {
        Mult m = new Mult(6);
        System.out.println("Возможные представления числа " + m.getNumber() + " (с повторениями): ");
        m.printSequence();
    }

}
