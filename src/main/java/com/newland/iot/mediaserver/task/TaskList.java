package com.newland.iot.mediaserver.task;

import com.newland.iot.mediaserver.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TaskList {

	private final static Logger log = Logger.getLogger(TaskList.class);

	@Autowired
	private UserService userService;

	/**
	 * 定时更新数据字典
	 */
	@Scheduled(fixedRate = 1000 * 1)
	public void doUpdateDictDef() throws InterruptedException {
        log.info("1======>> begintime:" + new SimpleDateFormat("yyyyMMddhh24mmss").format(new Date()));
        Thread.sleep(3000);
        log.info("1======>> endtime:" + new SimpleDateFormat("yyyyMMddhh24mmss").format(new Date()));
        log.info("定时任务1");
	}

    /**
     * 定时更新数据字典
     */
    @Scheduled(fixedRate = 1000 * 1)
    public void doUpdateDictDef1() throws InterruptedException {
        log.info("2======>> begintime:" + new SimpleDateFormat("yyyyMMddhh24mmss").format(new Date()));
        Thread.sleep(1000);
        log.info("2======>> endtime:" + new SimpleDateFormat("yyyyMMddhh24mmss").format(new Date()));
        log.info("定时任务2");
    }
}
