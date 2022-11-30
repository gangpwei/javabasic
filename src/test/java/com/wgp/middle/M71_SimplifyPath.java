package com.wgp.middle;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 简化路径
 * @author gangpeng.wgp
 * @date 2022/11/25 下午6:03
 */
public class M71_SimplifyPath {
    public String simplifyPath(String path) {
        String[] arrays = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String str : arrays) {
            if(str.equals("..")){
                if(!stack.isEmpty()){
                    stack.pollLast();
                }
            }else if(!str.equals(".") && !str.isEmpty()){
                stack.offer(str);
            }
        }
        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty()){
            sb.append("/");
        }
        while (!stack.isEmpty()){
            sb.append("/").append(stack.pollFirst());
        }
        return sb.toString();
    }

}
