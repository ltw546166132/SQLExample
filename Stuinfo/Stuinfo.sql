/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.7.21 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `student` (
	`sid` int (11),
	`sname` varchar (60),
	`gender` varchar (60),
	`phone` varchar (60),
	`birthday` date ,
	`hobby` varchar (150),
	`info` varchar (600)
); 
insert into `student` (`sid`, `sname`, `gender`, `phone`, `birthday`, `hobby`, `info`) values('1','李四','男','12541','2018-07-11','篮球','会话武器二级');
insert into `student` (`sid`, `sname`, `gender`, `phone`, `birthday`, `hobby`, `info`) values('2','斯蒂芬','女','5141','2018-07-09','是否','十分温柔');
insert into `student` (`sid`, `sname`, `gender`, `phone`, `birthday`, `hobby`, `info`) values('3','GRE果然','女','13359160916','2018-07-10','游泳','hf');
insert into `student` (`sid`, `sname`, `gender`, `phone`, `birthday`, `hobby`, `info`) values('4','hgtghrt','男','54458455','2019-11-29','游泳','thrthtrfh');
insert into `student` (`sid`, `sname`, `gender`, `phone`, `birthday`, `hobby`, `info`) values('5','bdfb','女','45841','2018-01-03','游泳篮球','dgregre');
