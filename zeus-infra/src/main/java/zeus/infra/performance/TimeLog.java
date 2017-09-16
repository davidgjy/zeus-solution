package zeus.infra.performance;

import org.apache.log4j.Logger;

/**
 * Created by KG on 2017/7/22.
 */

public class TimeLog implements TimeDevice {
    Logger logger = Logger.getLogger(TimeLog.class);

    public void print(String moduleName, String time, long seconds) {
        logger.info("******************************* Performance Log *******************************");
        logger.info("Module: " + moduleName + ", Time Consumed: " + time + ", 性能: " + WarnMsg.infoBySeconds(seconds));
        logger.info("*******************************************************************************");
    }
}


