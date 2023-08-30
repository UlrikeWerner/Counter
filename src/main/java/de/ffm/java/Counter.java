package de.ffm.java;

public class Counter {
    protected static int totalCount;
    protected int instanceCount;

    public Counter(){
        totalCount = 0;
        instanceCount = 0;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static void setTotalCount(int totalCount) {
        Counter.totalCount = totalCount;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
    }

    public static void incrementTotalCount(){
        totalCount++;
    }
    public void incrementInstanceCount(){
        instanceCount++;
    }
}
