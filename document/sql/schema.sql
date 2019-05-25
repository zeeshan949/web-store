-- ----------------------------
-- Table structure for ums_member
-- ----------------------------
DROP  TABLE IF EXISTS 'ums_member';
CREATE  TABLE 'ums_member' (
 'id' bigint ( 20 ) NOT NULL AUTO_INCREMENT,
 'member_level_id' bigint ( 20 ) DEFAULT NULL ,
 'username' varchar ( 64 ) DEFAULT NULL COMMENT 'username',
 'password' VARCHAR ( 64) the DEFAULT NULL the COMMENT 'password',
 'nickname' VARCHAR ( 64 ) the DEFAULT NULL the COMMENT 'nickname',
 'phone' VARCHAR ( 64 ) the DEFAULT NULL the COMMENT 'phone number',
 'status' int ( 1 ) the DEFAULT NULL the COMMENT 'account enabled: 0-> disabled; 1-> Enable',
 'create_time'datetime the DEFAULT NULL the COMMENT 'Registered',
 'icon' VARCHAR ( 500 ) the DEFAULT NULL the COMMENT 'head',
 'gender' int ( 1 ) DEFAULT NULL COMMENT 'Gender: 0-> Unknown; 1-> Male; 2-> Female',
 'birthday' DATE the DEFAULT NULL the COMMENT 'birthday',
 'city' varchar ( 64 ) DEFAULT NULL COMMENT 'Made the city',
 'job' VARCHAR ( 100 ) the DEFAULT NULL the COMMENT 'occupation',
 'personalized_signature' VARCHAR ( 200 ) the DEFAULT NULL the COMMENT 'Signature',
 'source_type' int ( 1 ) the DEFAULT NULL the COMMENT 'user source',
 'integration' int ( 11 ) the DEFAULT NULL the COMMENT 'integral',
 'growth' int ( 11 ) DEFAULT NULL COMMENT 'growth value',
 'luckey_count' int ( 11 ) DEFAULT NULL COMMENT 'remaining lottery',
 'history_integration' int ( 11 ) the DEFAULT NULL the COMMENT 'history number of points',
  PRIMARY KEY ('id'),
  UNIQUE KEY'idx_username'('username'),
  UNIQUE KEY'idx_phone'('phone')
ENGINE = InnoDB AUTO_INCREMENT = 10 DEFAULT CHARSET = utf8 COMMENT ='Member Table';