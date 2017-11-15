package org.qf.service;

import org.qf.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {
    public void addUser(UserInfo pojo);

    public void del(Long id);

    public void updateUser(UserInfo pojo);

    public UserInfo findById(Long id);

    public List<UserInfo> findAll();
}
