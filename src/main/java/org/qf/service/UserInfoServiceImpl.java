package org.qf.service;

import org.qf.dao.UserInfoMapper;
import org.qf.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void addUser(UserInfo pojo) {
        userInfoMapper.insert(pojo);
    }

    @Override
    public void del(Long id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateUser(UserInfo pojo) {
        userInfoMapper.updateByPrimaryKeySelective(pojo);
    }

    @Override
    public UserInfo findById(Long id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> findAll() {
        return null;
    }
}
