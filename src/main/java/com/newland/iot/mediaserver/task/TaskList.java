package com.newland.iot.mediaserver.task;

import com.newland.iot.mediaserver.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

@Component
public class TaskList implements SchedulingConfigurer {

	private final static Logger log = Logger.getLogger(TaskList.class);

	@Autowired
	private UserService userService;

	/**
	 * 定时更新数据字典
	 */
	@Scheduled(fixedRate = 1000 * 300)
	public void doUpdateDictDef() {
		log.info("定时任务");
	}


	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		/**
		 * 开启并发执行
		 */
		taskRegistrar.setScheduler(Executors.newScheduledThreadPool(100));
	}
}
