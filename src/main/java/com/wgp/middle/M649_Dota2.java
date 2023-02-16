package com.wgp.middle;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class M649_Dota2 {
    public String predictPartyVictory1(String senate) {
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();
        int length = senate.length();
        for(int i=0; i< length; i++){
            if(senate.charAt(i) == 'R'){
                rQueue.offer(i);
            }else{
                dQueue.offer(i);
            }
        }

        while(!rQueue.isEmpty() && ! dQueue.isEmpty()){
            int rPoll = rQueue.poll();
            int dPoll = dQueue.poll();
            if(rPoll < dPoll){
                //注意：元素放到队尾，下标需要加length，为了不影响本轮比对
                rQueue.offer(rPoll + length);
            }else{
                dQueue.offer(dPoll + length);
            }
        }
        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }

    public String predictPartyVictory(String senate) {
        int length = senate.length();
        int rCount = 0, dCount = 0, min = -1;

        for(int i=0; i< length; i++){
            if(senate.charAt(i) == 'R'){
                if(min == -1){
                    min = 2;
                }
                if(rCount >= 0){
                    dCount--;
                }
                rCount++;
            }else{
                if(min == -1){
                    min = 1;
                }

                if(dCount >= 0){
                    rCount--;
                }
                dCount++;
            }
        }
        return rCount < dCount ?   "Dire" : "Radiant";
    }

    @Test
    public void testCase(){
        M649_Dota2 dota2 = new M649_Dota2();

        //assertEquals(dota2.predictPartyVictory("RDDRD"), "Dire");
        //
        //assertEquals(dota2.predictPartyVictory("RD"), "Radiant");

        //assertEquals(dota2.predictPartyVictory("DR"), "Dire");

        assertEquals(dota2.predictPartyVictory("DDRRR"), "Dire");
    }
}