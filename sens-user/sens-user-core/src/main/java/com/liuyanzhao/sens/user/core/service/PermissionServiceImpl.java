package com.liuyanzhao.sens.user.core.service;

import com.liuyanzhao.sens.user.api.entity.Permission;
import com.liuyanzhao.sens.user.api.service.PermissionService;
import com.liuyanzhao.sens.user.core.mapper.PermissionMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 言曌
 * @date 2019-08-13 21:56
 */
@RestController
@Slf4j
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;


    @Override
    public List<Permission> findByLevelOrderBySortOrder(Integer level) {
        return permissionMapper.findByLevelOrderBySortOrder(level);
    }

    @Override
    public List<Permission> findByParentIdOrderBySortOrder(String parentId) {
        return permissionMapper.findByParentIdOrderBySortOrder(parentId);
    }

    @Override
    public List<Permission> findByTypeAndStatusOrderBySortOrder(Integer type, Integer status) {
        return permissionMapper.findByTypeAndStatusOrderBySortOrder(type, status);
    }

    @Override
    public List<Permission> findByTitle(String title) {
        return permissionMapper.findByTitle(title);
    }

    @Override
    public List<Permission> findByTitleLikeOrderBySortOrder(String title) {
        return permissionMapper.findByTitleLikeOrderBySortOrder(title);
    }
}
