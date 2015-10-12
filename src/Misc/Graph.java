/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author Admin
 */
public class Graph {

    public int getSize() {
        return size;
    }

    public Graph(int[][] matrix) {
        this.matrix = matrix;
        size = matrix.length;
    }

    private final int[][] matrix;
    private int size = 0;

    public boolean IsSv() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int pointLevel(int i) {
        throw new NotImplementedException();
    }

    public boolean hasLoops() {
        int cols = 0;
        for (int i = 0; i < size; ++i) {
            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum = sum + matrix[i][j];
            }
            if (sum == size - 1) {
                ++cols;
            }

        }
        return cols >= 3;//цикл включает хотя бы 3 вершины
    }

    public static void main(String args[]) {
        int[][] g = {
            {1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1},
            {0, 0, 1, 1, 1},
            {0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1}};

        /* int[][] g = {
         {1, 1, 0, 1, 1},
         {0, 1, 1, 1, 1},
         {1, 0, 1, 1, 1},
         {0, 0, 0, 1, 0},
         {0, 0, 0, 0, 1}};
         */
        Graph myGraph = new Graph(g);
        try {
            if (myGraph.IsSv()) {
                System.out.println("Граф связный");
            } else {
                System.out.println("Граф несвязный");
            }
            if (myGraph.hasLoops()) {
                System.out.println("Граф содержит циклы");
            } else {
                System.out.println("Граф не содержит циклов");
            }
            System.out.println("Вершина 3 имеет степень" + myGraph.pointLevel(3));
        } catch (NotImplementedException e) {
            System.err.println("ВНИМАНИЕ! Некоторые методы класса еще не реализованы!");
        }
    }
}
