package com.ssm.service;

import com.ssm.entity.Commodity;
import com.ssm.entity.Member;
import com.ssm.entity.Notices;
import com.ssm.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SystemService {

    //注册
    int register(Member member);

    //通过用户名查找Member
    Member findMemberByUsername(String username);

    //通过用户id获取消息列表
    List<Notices> findMessageByUserid(int userid);

    Member findMemberById(int id);

    int updatepassword(Member member);

    int updateinfo(Member member);

    int deleteNoticesById(int id);

}
