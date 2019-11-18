package com.company;

import java.util.ArrayList;

public class HeapArray {

    private ArrayList<Integer> listyList = new ArrayList<>();

    public HeapArray (){

    }
    public void add(int v){
        if (listyList.isEmpty())
            listyList.add(v);
        else{
            listyList.add(v);
            this.bubbleUp();
        }
    }
    public void set(int e, int v){
        listyList.set(e, v);
    }
    public int getMin(){
        return listyList.get(0);
    }

    public void bubbleUp(){
        int finalSpot = listyList.size()-1;
        while (finalSpot != 0){
            int parent = (finalSpot-1) / 2;
            if (listyList.get(finalSpot) >= listyList.get(parent))
                return;
            else{
                int placeHolder = listyList.get(parent);
                listyList.set(parent, listyList.get(finalSpot));
                listyList.set(finalSpot, placeHolder);
                finalSpot = parent;
            }
        }
    }
    public void removeMin(){
        if(listyList.isEmpty())
            System.out.println("No min, Heap is empty!");
        else{
            //int min = listyList.get(0);
            listyList.set(0, listyList.get(listyList.size()-1));
            listyList.remove(listyList.size()-1);
            this.bubbleUp();

        }
    }
}
