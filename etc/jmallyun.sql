/*
Navicat MySQL Data Transfer

Source Server         : mrmf
Source Server Version : 50616
Source Host           : localhost:3306
Source Database       : jmallyun

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2018-04-15 13:11:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for car_brand
-- ----------------------------
DROP TABLE IF EXISTS `car_brand`;
CREATE TABLE `car_brand` (
  `id` bigint(20) NOT NULL,
  `parent_id` bigint(20) NOT NULL,
  `brand_name` varchar(30) DEFAULT NULL COMMENT '品牌名称',
  `brand_logo` varchar(200) DEFAULT NULL COMMENT '品牌logo',
  `brand_sort` int(11) DEFAULT '1' COMMENT '排序',
  `brand_level` int(11) DEFAULT '1' COMMENT '层级',
  `gmt_create` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for car_number_plates
-- ----------------------------
DROP TABLE IF EXISTS `car_number_plates`;
CREATE TABLE `car_number_plates` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for insurance_company
-- ----------------------------
DROP TABLE IF EXISTS `insurance_company`;
CREATE TABLE `insurance_company` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for rcwl_car
-- ----------------------------
DROP TABLE IF EXISTS `rcwl_car`;
CREATE TABLE `rcwl_car` (
  `id` bigint(20) NOT NULL,
  `car_series` bigint(20) NOT NULL COMMENT '车系列',
  `car_type` bigint(20) DEFAULT NULL COMMENT '车型',
  `car_number_region` bigint(20) DEFAULT NULL COMMENT '牌照所属区域(渝A),ID',
  `car_number_start` varchar(6) DEFAULT NULL COMMENT '牌照所属区域(渝A)',
  `car_number_end` varchar(6) DEFAULT NULL COMMENT '车牌六位',
  `car_user_name` varchar(20) DEFAULT NULL COMMENT '车主姓名',
  `car_insurance_time` datetime DEFAULT NULL COMMENT '投保时间',
  `car_insurance_company_id` bigint(20) DEFAULT NULL COMMENT '保险公司ID',
  `car_insurance_company` varchar(20) DEFAULT NULL COMMENT '保险公司',
  `gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建 时间',
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for rcwl_user
-- ----------------------------
DROP TABLE IF EXISTS `rcwl_user`;
CREATE TABLE `rcwl_user` (
  `id` bigint(20) NOT NULL,
  `user_nick_name` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `user_password` varchar(50) DEFAULT NULL,
  `user_head_img_url` varchar(200) DEFAULT NULL COMMENT '用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空',
  `user_openid` varchar(100) DEFAULT NULL COMMENT '用户的唯一标识',
  `user_phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `user_sex` int(10) unsigned DEFAULT '0' COMMENT '用户的性别，值为1时是男性，值为2时是女性，值为0时是未知',
  `province` varchar(255) DEFAULT NULL COMMENT '用户个人资料填写的省份',
  `city` varchar(255) DEFAULT NULL COMMENT '普通用户个人资料填写的城市',
  `country` varchar(255) DEFAULT NULL COMMENT '国家，如中国为CN',
  `gmt_create` datetime DEFAULT CURRENT_TIMESTAMP,
  `gmt_modifyed` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
