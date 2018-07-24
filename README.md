# SQLExample
## JDBC

<pre><code>
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManger.getConnection("jdbc:mysql://127.0.0.1:3306/testdata?useSSL=false&serverTimezone=GMT%2B8","root","123456");
</code></pre>

## mysql数据库隔离级别
读未提交，读已提交，可重复读，串行化

## 事务：悲观锁，乐观锁

悲观锁:可以在查询的时候，加入 for update

乐观锁:要求程序员自己控制
比如在数据库加一个字段vrsion当做版本来判断防止事务相互影响

## 自定义注解
<pre><code>
public @interface MyAnn{
  public long timeout() default -1;
  public Class class() default java.util.Date.class;
}
</code></pre>

注解的属性支持的类型有:基本数据类型(4类8种),Sting,Class,Annotation(注解类型),枚举类型,以及以上类型的一维数组类型

## 事务
* 原子性
* 一致性
* 隔离性
* 持久性
## 如果不考虑隔离性，引发安全问题
* 读问题
  脏读：一个事务读到另一个事务未提交的数据。
  不可重复读：一个事务读到另一个事务已提交的update数据，导致在前一个事务多次查询结果不一致。
  虚读：一个事务读到另一个事务已经提交的insert数据，导致在前一个事务多次查询结果不一致。
* 写问题
  引发两类丢失更新

## 读问题的解决
* 设置事务隔离级别
  
