package utils;

import java.io.File;

import static java.lang.System.getProperty;

/**
 * @author msingal
 * This interface take cares of the directory paths in the project
 * which is consumed in the config.properties. 
 *
 */
public interface AppConstant {

    File PARENT_DIR = new File(getProperty("user.dir"));
    String SEPARATOR = System.getProperty("file.separator");
    String RESOURCE_FOLDER = PARENT_DIR.getPath() + SEPARATOR + "resources";
    String CONFIG_PATH = RESOURCE_FOLDER + SEPARATOR + "config.properties";
    String EXTERNAL_WEBDRIVER_PATH = PARENT_DIR.getPath() + SEPARATOR + "webdrivers";

   

    String LOG_CONFIGURATION = RESOURCE_FOLDER + SEPARATOR + "log4j-agent.xml";
    // MAX tolerance allowed while searching reports ( in sec ), as we don't show sec so must be >  60 sec
    int REPORT_TIME_TOLERANCE = -60;


}
