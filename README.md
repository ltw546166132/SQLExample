# SQLExample
## JDBC

<code>
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManger.getConnection("jdbc:mysql://127.0.0.1:3306/testdata?useSSL=false&serverTimezone=GMT","root","123456");
</code>

数据库隔离级别
