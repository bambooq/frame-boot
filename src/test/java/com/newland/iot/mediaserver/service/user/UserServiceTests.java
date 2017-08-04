package com.newland.iot.mediaserver.service.user;


import com.newland.iot.mediaserver.MediaServerApplicationTests;
import com.newland.iot.mediaserver.model.user.SmUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.client.RestTemplate;

public class UserServiceTests extends MediaServerApplicationTests {

    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Test
    public void selectList() {
        SmUser smUser = new SmUser();
        smUser.setUserId("1");
        smUser.setUserName("zhengqi");

        redisTemplate.opsForHash().put("user", "zhengqi", smUser);
        SmUser smUser1 = (SmUser) redisTemplate.opsForHash().get("user", "zhengqi");
    }
}
