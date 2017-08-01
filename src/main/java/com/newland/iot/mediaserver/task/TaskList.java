package com.newland.iot.mediaserver.task;

import com.newland.iot.mediaserver.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskList {

	private final static Logger log = Logger.getLogger(TaskList.class);

	@Autowired
	private UserService userService;

	/**
	 * 定时更新数据字典
	 */
	@Scheduled(fixedRate = 1000 * 300)
	public void doUpdateDictDef() {

	}


}
