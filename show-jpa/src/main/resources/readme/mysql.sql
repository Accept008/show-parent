-- ----------------------------
-- Table for t_user
-- ----------------------------
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT, -- 自动编号
  `user_name` varchar(255) DEFAULT NULL, -- 用户名
  `password` varchar(255) DEFAULT NULL, -- 密码
  `last_login_time` datetime DEFAULT NULL, -- 最近登录时间
  `sex` tinyint(4) DEFAULT NULL, -- 性别 0男, 1女, 2其它
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=armscii8;

BEGIN;
INSERT INTO `t_user` VALUES (1, 'json', '123', '2019-07-27 16:01:21', 1);
INSERT INTO `t_user` VALUES (2, 'jack jo', '123', '2019-07-24 16:01:37', 1);
INSERT INTO `t_user` VALUES (3, 'manistal', '123', '2019-07-24 16:01:37', 1);
INSERT INTO `t_user` VALUES (4, 'landengdeng', '123', '2019-07-24 16:01:37', 1);
INSERT INTO `t_user` VALUES (5, 'max', '123', '2019-07-24 16:01:37', 1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- Table for t_depart
-- ----------------------------
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `t_depart`;
CREATE TABLE `t_depart`(
  `depart_id` varchar(50) NOT NULL, -- 部门编号
  `depart_name` varchar(255) DEFAULT NULL, -- 部门名称
  `remark` varchar(255) DEFAULT NULL, -- 备注
  PRIMARY KEY (`depart_id`)
) ENGINE=InnoDB CHARSET=armscii8;

BEGIN;
INSERT INTO `t_depart` VALUES ('D001', 'qz', '123');
INSERT INTO `t_depart` VALUES ('D002', 'xm', '456');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;


-- ----------------------------
-- Table for t_record
-- ----------------------------
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_record
-- ----------------------------
DROP TABLE IF EXISTS `t_record`;
CREATE TABLE `t_record`  (
  `record_id` int(11) NOT NULL COMMENT '记录编号',
  `record_version` int(255) NULL DEFAULT NULL COMMENT '记录版本',
  `record_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '记录内容',
  `start` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `end` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  `desp` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`record_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;


-- ----------------------------
-- Table for t_record
-- ----------------------------
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `t_record`;
CREATE TABLE `t_record`  (
  `record_id` int(11) NOT NULL COMMENT '记录编号',
  `record_version` int(255) NULL DEFAULT NULL COMMENT '记录版本',
  `record_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '记录内容',
  `start` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `end` datetime(0) NULL DEFAULT NULL COMMENT '结束时间',
  `desp` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`record_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

INSERT INTO `t_record` VALUES (1, 1, '111', '2019-11-01 17:06:01', '2019-11-05 17:06:12', NULL);
INSERT INTO `t_record` VALUES (2, 2, '222', '2019-11-01 17:06:40', '2019-11-15 17:06:48', NULL);
INSERT INTO `t_record` VALUES (3, 1, '333', '2019-11-01 17:06:57', '2019-11-20 17:07:08', NULL);
INSERT INTO `t_record` VALUES (4, 2, '444', '2019-11-25 17:07:15', '2019-11-30 17:07:31', NULL);
INSERT INTO `t_record` VALUES (5, 1, '555', '2019-11-30 17:07:38', '2019-12-05 17:07:44', NULL);
INSERT INTO `t_record` VALUES (6, 2, '666', '2019-12-05 17:07:50', '2019-12-10 17:07:56', NULL);

SET FOREIGN_KEY_CHECKS = 1;