DROP TABLE IF EXISTS `city`;
CREATE TABLE
    city
    (
        id INT(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号',
        province_id INT(10) unsigned NOT NULL COMMENT '省份编号',
        city_name VARCHAR(25) COMMENT '城市名称',
        description VARCHAR(25) COMMENT '描述',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8;