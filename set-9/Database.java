public class Database {
    // below is a set of statements designed to handle a login that leads to a
    // databse full of classified information.
    // do you see any issue with the way the programmer set up this file?

    String sql = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'";
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);

}
