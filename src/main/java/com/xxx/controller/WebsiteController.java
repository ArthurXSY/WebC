package com.xxx.controller;

import com.xxx.entity.Website;
import com.xxx.service.WebsiteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Website)表控制层
 *
 * @author makejava
 * @since 2020-08-27 15:16:00
 */
@RestController
@RequestMapping("website")
public class WebsiteController {
    /**
     * 服务对象
     */
    @Resource
    private WebsiteService websiteService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Website selectOne(Integer id) {
        return this.websiteService.queryById(id);
    }

}