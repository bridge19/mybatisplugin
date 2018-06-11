CREATE TABLE `QueryTest` (
  `queryTestId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `queryName` varchar(50) NOT NULL COMMENT '车牌号',
  `queryValue` varchar(50) DEFAULT NULL COMMENT '设备号',
  `inputMan` int(7) DEFAULT NULL COMMENT '设备状态 0：未绑定1:绑定',
  `inputDate` datetime DEFAULT NULL COMMENT '输入时间',
  `updateDate` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`queryTestId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='测试表';


INSERT INTO `batisTest`.`QueryTest` (`queryTestId`, `queryName`, `queryValue`, `inputMan`, `inputDate`, `updateDate`) VALUES ('1', 'ad', '4314', '1234', '2018-06-11 11:31:13', '2018-06-11 11:31:16');
INSERT INTO `batisTest`.`QueryTest` (`queryTestId`, `queryName`, `queryValue`, `inputMan`, `inputDate`, `updateDate`) VALUES ('2', 'afd', '4321', '1234', '2018-06-11 11:31:40', '2018-06-11 11:31:43');
INSERT INTO `batisTest`.`QueryTest` (`queryTestId`, `queryName`, `queryValue`, `inputMan`, `inputDate`, `updateDate`) VALUES ('3', 'aa4', '43421', '421', '2018-06-11 11:31:58', '2018-06-11 11:32:01');
