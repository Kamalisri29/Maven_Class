package com.adacitin.commonutil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4J {
 static Logger log; 
	public static Logger loadLogger(Class<?>classname) {
		log =LoggerFactory.getLogger(classname);
		return log;
		
	}
}
