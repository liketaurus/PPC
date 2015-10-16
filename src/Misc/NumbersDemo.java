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
public class NumbersDemo {

    private final int number;
    private final int[] a;

    public NumbersDemo(int n) {
        this.number = n;
        a = new int[n + 1];
    }

    public int getNumber() {
        return number;
    }

    public void printFractions() {
        int t = number;
        String s = "1 * ";
        int i = 2;
        while (i <= t) {
            if (t % i == 0) {
                s = s + i;
                t = t / i;
                if (t > 1) {
                    s = s + " * ";
                }
            } else {
                i++;
            }
        }
        System.out.println(s);
    }

    private void printFactors(String temp, int d, int previous) {
        for (int f = d; f >= 2; --f) {
            if (d % f == 0 && f <= previous) {
                int next = d / f;
                if (next <= f) {
                    if (next <= previous) {
                        System.out.println(temp + f + " * " + next);
                    }
                }
                printFactors(temp + f + " * ", next, f);
            }
        }
    }

    public void printAllFractions() {
        printFactors("", number, number);
    }

    private void generateSums(int i, int pos, int sum) {
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
                generateSums(j, pos + 1, sum + j);
            }
        }
    }

    public void printSums() {
        generateSums(1, 1, 0);
    }

    public static void main(String args[]) {
        NumbersDemo m = new NumbersDemo(12);
        System.out.println("Разложение на простые множители: ");
        m.printFractions();
        System.out.println("Возможные представления числа " + m.getNumber() + "(произведения): ");
        m.printAllFractions();
        System.out.println("Возможные представления числа " + m.getNumber() + " (суммы): ");
        m.printSums();
    }

}
