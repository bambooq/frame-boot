package com.newland.iot.mediaserver.dao.common;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.newland.iot.mediaserver.MediaServerApplicationTests;
import com.newland.iot.mediaserver.model.common.DictDef;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DictDefDaoTests extends MediaServerApplicationTests {

    @Autowired
    private DictDefDao dictDefDao;

    @Test
    public void selectList() {
        List<DictDef> list = dictDefDao.selectPage(new Pagination(1, 10), null);
        for (DictDef dictDef : list) {
            System.out.println(dictDef.getDictType());
        }
    }
}
