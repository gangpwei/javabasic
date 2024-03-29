package com.wgp.middle.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Z 字形变换
 * @author gangpeng.wgp
 * @date 2022/11/25 上午10:29
 */
public class M06_ZString {

    /**
     * 解题思路：
     * 1、构造一个StringBuilder的List, 用于存放每行的字符串。类似一个二维数组
     * 2、按照Z字形走向，遍历字符串，分别存放到SB集合中
     * 3、在行首和行尾时，方向取反
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        //构造空的StringBuilder List, 存放每行的字符串
        List<StringBuilder> sbList = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            sbList.add(new StringBuilder());
        }

        //字符走向，1:向下，2:向上
        int direction = -1;
        int rowNum = 0;
        for(int i=0; i< s.toCharArray().length; i++){
            //行首或者行尾，方便转向
            if(rowNum == 0 || rowNum == numRows -1){
                direction = -direction;
            }
            sbList.get(rowNum).append(s.toCharArray()[i]);
            rowNum += direction;
        }

        //拼接结果
        StringBuilder sb = new StringBuilder();
        for (StringBuilder builder : sbList) {
            sb.append(builder.toString());
        }
        return sb.toString();
    }
}
