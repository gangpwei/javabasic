package com.wgp.middle.matrix;

/**
 * ��������
 * @author : gangpeng.wgp
 * @date : 2022/12/4
 */
class M73_setZeroes {
    //����һ�� m x n �ľ������һ��Ԫ��Ϊ 0 �����������к��е�����Ԫ�ض���Ϊ 0 ����ʹ�� ԭ�� �㷨��


    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        //�������������ֱ��¼ÿһ�к�ÿһ���Ƿ�������֡�
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
