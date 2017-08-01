package com.newland.iot.mediaserver.service.user;

import com.newland.iot.mediaserver.exception.BusinessException;

import com.newland.iot.mediaserver.model.user.SmUser;

import java.util.List;

public interface UserService {

    List<SmUser> selectList();
}
