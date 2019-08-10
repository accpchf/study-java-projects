DROP TABLE IF EXISTS `USER`;
CREATE TABLE USER
    (
        id INT(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户编号',
        user_name VARCHAR(25) COMMENT '用户名称',
        description VARCHAR(25) COMMENT '描述',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;