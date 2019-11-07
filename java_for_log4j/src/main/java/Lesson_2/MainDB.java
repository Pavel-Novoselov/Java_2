package Lesson_2;

import java.sql.*;

public class MainDB {

    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement pstmt;

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:main.db");
        stmt = connection.createStatement();
    }

    public static void disconnect() throws ClassNotFoundException, SQLException {
        connection.close();
    }


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            connect();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

         long t = System.currentTimeMillis();






        stmt.executeUpdate("INSERT INTO students (name, score)\n" +
                "VALUES ('bob1', 100)");
        Savepoint spl = connection.setSavepoint();

        stmt.executeUpdate("INSERT INTO students (name, score)\n" +
                "VALUES ('bob2', 200)");
        connection.rollback(spl);

        stmt.executeUpdate("INSERT INTO students (name, score)\n" +
                "VALUES ('bob3', 300)");



//
//        connection.setAutoCommit(false);
//
//
//        pstmt = connection.prepareStatement("INSERT INTO students (name, score)\n" +
//                "VALUES (?, ?)");
//
//        for (int i = 0; i < 1000; i++) {
//            pstmt.setString(1, "Bob" + (i + 1));
//            pstmt.setInt(2, + (i + 100));
//            pstmt.addBatch();
//        }
//
//        pstmt.executeBatch();


//        stmt.addBatch("INSERT INTO students (name, score)\n" +
//                "VALUES ('bob1', 100)");
//
//        stmt.addBatch("DELETE FROM students");
//        stmt.executeBatch();
       // connection.setAutoCommit(true);

        System.out.println(System.currentTimeMillis() - t);




       // stmt.execute("DROP TABLE IF EXISTS test");

//        ResultSetMetaData rsmd = rs.getMetaData();
//
//        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
//            System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnType(i));
//        }

//        while (rs.next()) {
//            System.out.println(rs.getString("name"));
//        }
        // метода по работе с БД

        disconnect();
    }
}
