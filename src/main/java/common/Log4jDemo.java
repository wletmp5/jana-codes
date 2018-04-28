package common;

import org.apache.log4j.Logger;

public class Log4jDemo {

    final static Logger logger = Logger.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
//        logger.info("this is info");
//        logger.debug("this is debug");
//        logger.warn("this is warn");
//        logger.error("this is error");
        Log4jDemo.testNum(4);
    }

    private static void testNum(int num){
        if(num > 3) logger.error("error");
        else logger.info("info");
    }
}
