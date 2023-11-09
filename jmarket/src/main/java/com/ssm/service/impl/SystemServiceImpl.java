package com.ssm.service.impl;

import com.ssm.entity.Member;
import com.ssm.entity.Notices;
import com.ssm.entity.Order;
import com.ssm.mapper.SystemMapper;
import com.ssm.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SystemServiceImpl implements SystemService {

    @Autowired
    SystemMapper systemMapper;

    //注册
    @Override
    public int register(Member member) {
        return systemMapper.register(member);
    }

    //通过用户名查找Member
    @Override
    public Member findMemberByUsername(String username) {
        return systemMapper.findMemberByUsername(username);
    }

    //通过用户id获取消息列表
    @Override
    public List<Notices> findMessageByUserid(int userid) {
        return systemMapper.findMessageByUserid(userid);
    }

    public Member findMemberById(int id){ return systemMapper.findMemberById(id); }

    public int updatepassword (Member member){
        return systemMapper.updatepassword(member);
    }

    public int updateinfo(Member member){return systemMapper.updateinfo(member); }

    public int deleteNoticesById(int id) {
        return systemMapper.deleteNoticesById(id);
    }

}
