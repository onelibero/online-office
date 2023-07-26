package cdu.gu.user.service.impl;

import cdu.gu.entity.User;
import cdu.gu.user.mapper.PersonalMapper;
import cdu.gu.user.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonalServiceImpl implements PersonalService {
    @Resource
    private PersonalMapper personalMapper;
    @Override
    public User searchUserById(int id) {

        return personalMapper.SearchUserById(id);
    }
}
