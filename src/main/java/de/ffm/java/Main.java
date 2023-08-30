package de.ffm.java;

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("totalCount: "+ Counter.getTotalCount());
        c1.incrementInstanceCount();
        c2.incrementInstanceCount();
        c2.incrementInstanceCount();
        c3.incrementInstanceCount();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        Counter.incrementTotalCount();
        System.out.println("totalCount: "+ Counter.getTotalCount());
        System.out.println("instanceCount c1: "+ c1.getInstanceCount());
        System.out.println("instanceCount c2: "+ c2.getInstanceCount());
        System.out.println("instanceCount c3: "+ c3.getInstanceCount());
    }
}
