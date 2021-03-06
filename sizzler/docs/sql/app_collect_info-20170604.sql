﻿
CREATE TABLE `app_collect_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `appVersionName` varchar(255) DEFAULT NULL COMMENT 'app版本名',
  `sdktype` varchar(255) DEFAULT NULL COMMENT 'sdk类型',
  `appkey` varchar(255) DEFAULT NULL COMMENT ' appkey',
  `appversion` varchar(255) DEFAULT NULL COMMENT 'app版本',
  `appid` varchar(255) DEFAULT NULL COMMENT 'appID',
  `channel` varchar(255) DEFAULT NULL COMMENT '渠道',
  `sdkversion` varchar(255) DEFAULT NULL COMMENT 'sdk版本',
  `duration` varchar(255) DEFAULT NULL COMMENT '会话使用时长',
  `time` varchar(255) DEFAULT NULL COMMENT '启动时间',
  `activities` varchar(255) DEFAULT NULL COMMENT '页面名',
  `date` varchar(255) DEFAULT NULL COMMENT '启动日期',
  `sessionid` varchar(255) DEFAULT NULL COMMENT '会话ID',
  `e_duration` varchar(255) DEFAULT NULL COMMENT '事件时长',
  `pageName` varchar(255) DEFAULT NULL COMMENT '页面名称',
  `e_time` varchar(255) DEFAULT NULL COMMENT '事件点击时间',
  `e_date` varchar(255) DEFAULT NULL COMMENT '事件点击日期',
  `eventid` varchar(255) DEFAULT NULL COMMENT '事件ID',
  `label` varchar(255) DEFAULT NULL COMMENT '事件标签',
  `count` varchar(255) DEFAULT NULL COMMENT '事件点击次数',
  `error_abstract` varchar(255) DEFAULT NULL COMMENT '错误分类信息',
  `stacktrace` varchar(255) DEFAULT NULL COMMENT '错误信息详情',
  `er_date` varchar(255) DEFAULT NULL COMMENT '错误发生日期',
  `er_time` varchar(255) DEFAULT NULL COMMENT '错误发生时间',
  `ostype` varchar(255) DEFAULT NULL COMMENT '操作系统类型',
  `imei` varchar(255) DEFAULT NULL COMMENT '设备唯一标识符',
  `isRoot` varchar(255) DEFAULT NULL COMMENT '是否root',
  `resolution` varchar(255) DEFAULT NULL COMMENT '分辨率',
  `osversion` varchar(255) DEFAULT NULL COMMENT '系统版本',
  `accesstype` varchar(255) DEFAULT NULL COMMENT '联网方式',
  `iccId` varchar(255) DEFAULT NULL COMMENT '集成电路卡识别码',
  `country` varchar(255) DEFAULT NULL COMMENT '国家',
  `phoneNo` varchar(255) DEFAULT NULL COMMENT '电话号码',
  `devicemodel` varchar(255) DEFAULT NULL COMMENT '设备型号',
  `timezone` varchar(255) DEFAULT NULL COMMENT '时区',
  `carrier` varchar(255) DEFAULT NULL COMMENT '运营商',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  `language` varchar(255) DEFAULT NULL COMMENT '语言',
  `imsi` varchar(255) DEFAULT NULL COMMENT '国际移动用户识别码号码',
  `event_key` varchar(255) DEFAULT NULL,
  `event_value` varchar(255) DEFAULT NULL,
  `ip` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
