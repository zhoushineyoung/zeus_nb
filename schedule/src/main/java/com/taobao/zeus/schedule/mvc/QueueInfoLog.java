package com.taobao.zeus.schedule.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueueInfoLog {
	private static Logger log=LoggerFactory.getLogger(QueueInfoLog.class);
	
	public static void info(String msg){
		log.info(msg);
	}
	
	public static void error(String msg,Exception e){
		log.error(msg,e);
	}
	
}
