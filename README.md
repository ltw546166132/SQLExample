# SQLExample
## JDBC

<code>
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManger.getConnection("jdbc:mysql://127.0.0.1:3306/testdata?useSSL=false&serverTimezone=GMT","root","123456");
</code>

## mysql数据库隔离级别
读未提交，读已提交，可重复读，串行化

## 事务：悲观锁，乐观锁

悲观锁:可以在查询的时候，加入 for update

乐观锁:要求程序员自己控制
比如在数据库加一个字段vrsion当做版本来判断防止事务相互影响
