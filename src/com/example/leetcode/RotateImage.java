package com.example.leetcode;

/**
 * https://leetcode-cn.com/problems/rotate-image/description/
 * <p>
 * 核心公式：P(x,y) ---> P(y,len-1-x)
 * <p>
 * Created on May 10, 2018
 *
 * @author hatakawas
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) {
            return;
        }
        // the max index.
        int size = matrix.length - 1;
        int tmp;
        // i: the cycles, a cycle include 4 borders.
        for (int i = 0; i <= size / 2; i++) {
            // j: x-axis of the source element, x-axis starts with i, ends with length-1-i
            for (int j = i; j < size - i; j++) {
                // At a same time, values on 4 borders should be swapped.
                // P1 = (i,j)
                // P2 = (j, size-i)
                // P3 = (size-i, size-j)
                // P4 = (size-j, i)
                // 1 tmp needed to complete the swapping.
                tmp = matrix[size - j][i]; // store P4
                matrix[size - j][i] = matrix[size - i][size - j]; // P4=p3
                matrix[size - i][size - j] = matrix[j][size - i]; // P3=p2
                matrix[j][size - i] = matrix[i][j]; // P2=p1
                matrix[i][j] = tmp; // P1=stored P4
            }
        }
    }

}
