package com.github.nyasroryo.lanticaltech.util;

import org.apache.logging.log4j.Logger;

public class LoggerPlus {

  private static Logger logger;

  public static void setLogger(Logger lgr) {
    logger = lgr;
  }

  public static Logger getLogger() {
    return logger;
  }

  public static void logInfo(String thing){
    logger.info(thing);
  }

  public static void logDebug(String thing){
    logger.debug(thing);
  }

  public static void logFatal(String thing){
    logger.fatal(thing);
  }

  public static void logWarn(String thing){
    logger.warn(thing);
  }

  public static void logErr(String thing){
    logger.error(thing);
  }

}
