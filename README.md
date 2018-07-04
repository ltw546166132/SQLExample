# SQLExample
## JDBC

<code>
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManger.getConnection("jdbc:mysql://127.0.0.1:3306/testdata?useSSL=false&serverTimezone=GMT","root","123456");
</code>

## mysql数据库隔离级别
读未提交，读已提交，可重复读，串行化

