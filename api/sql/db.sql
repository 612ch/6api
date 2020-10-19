CREATE DATABASE `6api_top` CHARACTER SET 'utf8' COLLATE 'utf8_general_ci';

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `api_saying`;
CREATE TABLE `api_saying`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `content`(`content`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO api_saying ( content )
VALUES
	( 'UNIX很简单。但需要有一定天赋的人才能理解这种简单。' ),
	( '习惯于不舒服，这是你突破现状并进入下一个层次的方法。' ),
	( '产品容易复制，但经验很难复制。' ),
	( '人性一个最特别的弱点就是：在意别人如何看待自己。' ),
	( '作为一个程序员，郁闷的事情是，面对一个代码块却不敢去修改。更糟糕的是，这个代码块还是自己写的。' ),
	( '创新与否区隔出领导人与追随者的差异。' ),
	( '别担心人们抄袭你的设计作品，要担心他们停止抄袭的那一天。' ),
	( '夜晚的灯塔一直都在，只是灯亮的时候，你才看见它。' ),
	( '大多数人都熟悉程序员的美德有三种：那就是懒惰、急躁和傲慢。' ),
	( '大胆去做事。因為若成功了，你會得到光榮；若失敗了，你也會得到智慧。' ),
	( '如果一个人对自己真的有信心，那么就不会觉得有必要夸耀自己。' ),
	( '如果你是房间里最聪明的人，那么你走错房间了。' ),
	( '如果你渴望新的事物，就必须停止做旧的事情。' ),
	( '如果只需更改一个单一的代码行，你的部门需要花费多长时间？' ),
	( '当你想在你的代码中找到一个错误时，这很难；当你认为你的代码是不会有错误时，这就更难了。' ),
	( '当你试图解决一个你不理解的问题时，复杂化就产成了。' ),
	( '想法随处可见，执行它们的人才是无价的。' ),
	( '控制复杂性是计算机编程的本质。' ),
	( '晚上想想千条路，早上醒来走原路。' ),
	( '最初90%的代码用去了最初90%的开发时间，余下10%的代码用掉另外90%的开发时间。' ),
	( '用代码行数来测评软件开发进度，就相对于用重量来计算飞机建造进度。' ),
	( '用几个小时来制定计划，可以节省几周的编程时间。' ),
	( '真爱的第一个征兆，在男孩子身上是胆怯，在女孩子身上是大胆。' ),
	( '缺乏计划的目标，其实只是个愿望。' ),
	( '设计力求简洁，直到无法更简洁。' ),
	( '质量、速度、廉价，选择其中两个。' ),
	( '过早的优化是罪恶之源。' ),
	( '项目开发的六个阶段：充满热情、醒悟、痛苦、找出罪魁祸首、惩罚无辜、褒奖闲人' ),
	( '顺境时，朋友认识我们；逆境时，我们认识朋友。' ),
	( '高质量的代码就是对程序本身最好的注释。' );

/*2020-10-20 Create Table And Insert Data*/