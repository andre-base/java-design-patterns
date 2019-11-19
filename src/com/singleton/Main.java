package com.singleton;

public class Main {

    public static void main(String[] args) {

        Connection conn1 = Connection.getInstante();
        Connection conn2 = Connection.getInstante();

        // Check if it's the same object by printing the hashcode
        System.out.println(conn1.hashCode());
        System.out.println(conn2.hashCode());

    }

}
