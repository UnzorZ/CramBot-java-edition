package dev.unzor.crambot.Utils;

import java.sql.*;

public class SQLite {

    private static Connection conn = null;

    public static void connect() {
        System.out.println("Database has connected.");
        String database = "jdbc:sqlite:CramBot/Motds.sqlite";
                try {
                    Class.forName("org.sqlite.JDBC");
                    conn = DriverManager.getConnection(database);

                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("PRAGMA user_version;");
                    int user_version = rs.getInt("user_version");
                    rs.close();

                    if (user_version == 0) {
                        System.out.println("Database not yet created. Creating ...");
                        String create = "CREATE TABLE crambot "
                                + "(id INTEGER PRIMARY KEY AUTOINCREMENT,"
                                + "motd BLOB);"
                                + "CREATE INDEX idx_crambot_motd ON crambot (motd);"
                                + "PRAGMA user_version = 1;";

                        st.executeUpdate(create);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

    }
    public static void close() {
        System.out.println("Database has been closed.");
        try {
            conn.close();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean containsMOTD(String motd) {
        boolean ret = false;
        String query = "SELECT * FROM crambot WHERE motd = ?;";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, motd);
            ResultSet rs = st.executeQuery();
            ret = rs.next();
            rs.close();
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ret;
    }

    public static void insertMOTD(String motd) {
        String query = "INSERT INTO crambot (uuid) VALUES (?);";
        execute(motd, query);
    }

    public static void deleteMOTD(String motd) {
        String query = "DELETE FROM crambot WHERE uuid = ?;";
        execute(motd, query);
    }

    private static void execute(String motd, String query) {
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, motd);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
