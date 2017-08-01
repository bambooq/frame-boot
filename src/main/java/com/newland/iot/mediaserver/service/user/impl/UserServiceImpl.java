package com.newland.iot.mediaserver.service.user.impl;

import com.newland.iot.mediaserver.dao.user.SmUserDao;
import com.newland.iot.mediaserver.model.user.SmUser;
import com.newland.iot.mediaserver.service.user.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    protected Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    private SmUserDao smUserDao;


    @Override
    @Cacheable(value = "users", keyGenerator = "MyKeyGenerator")
    public List<SmUser> selectList() {
        return smUserDao.selectList();
    }
}