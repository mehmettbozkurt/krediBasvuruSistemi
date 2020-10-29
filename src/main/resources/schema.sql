drop database IF EXISTS `test`;

create database test;
use  test;

DROP TABLE IF EXISTS `user`;
 SET character_set_client = utf8mb4 ;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `identity` bigint(20) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `income` int(100) NOT NULL,
  `creditscore` int(100) NOT NULL,
  `total` bigint(20) NOT NULL,
  `status` bit(1) DEFAULT NULL,
   PRIMARY KEY (`id`)
)