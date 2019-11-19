package com.singleton;

public class Connection {

    private static Connection connection;

    private Connection() {
    }

    public static Connection getInstante() {

        if (connection == null) {
            connection = new Connection();
        }

        return connection;

    }
}
