package com.newland.iot.mediaserver.dao.user;

import com.newland.iot.mediaserver.model.user.SmUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmUserDao {
   List<SmUser> selectList();
}
