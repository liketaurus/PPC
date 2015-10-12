package Misc;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JAVA
 */
public class BarChart {

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < board[i].length; j++) {
                s = s + board[i][j];
            }
            s = s + " "+board[i].length+"\n";
        }
        return s;
    }

    public BarChart(int[] sizes) {
        size = sizes.length;
        this.sizes = sizes;
        board = new char[size][];
        for (int i = 0; i < size; i++) {
            board[i] = new char[this.sizes[i]];
        }
        setBoard();
    }

    private int size;
    private int[] sizes;
    private char[][] board;

    private void setBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '▒';
            }
        }

    }

    public static void main(String[] args) {
        int[] s = {2, 4, 8, 1, 3};
        BarChart c = new BarChart(s);
        System.out.println(c);
    }

}
