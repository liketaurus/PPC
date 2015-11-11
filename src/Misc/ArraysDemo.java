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
public class ArraysDemo {

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                s = s + " " + board[i][j] + " ";
            }
            s = s + "\n";
        }
        return s;
    }

    public ArraysDemo(int n) {
        size = n;
        board = new char[size][size];
        setBoard();
    }

    public ArraysDemo() {
        board = new char[size][size];
        setBoard();
    }
    private char[][] board;
    private int size = 8;

    private void setBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = 'B';
                } else {
                    board[i][j] = 'W';
                }
            }
        }
    }

    public String getDia(int[] x) {
        String s = "";
        for (int t : x) {
            s = s + t + ": ";
            for (int i = 0; i < t; i++) {
                s = s + "o";
            }
            s = s + "\n";
        }
        return s;
    }

    public static void main(String args[]) {
        ArraysDemo demo = new ArraysDemo();
        int[] a = {5, 3, 1, 8, 4, 2};
        System.out.println(demo);
        System.out.println(demo.getDia(a));
    }

}
