package com.ssm.service.impl;

import com.ssm.entity.Commodity;
import com.ssm.entity.Notices;
import com.ssm.entity.Order;
import com.ssm.mapper.OrderMapper;
import com.ssm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    //购买
    @Override
    public int buy(Order order) {
        return orderMapper.buy(order);
    }
    //将商品加入购物车
    @Override
    public int addToCart(Order order) {
        return orderMapper.addToCart(order);
    }
    //通过id查找商品
    @Override
    public Commodity findCommodityById(int id) {
        return orderMapper.findCommodityById(id);
    }
    //通过id查找购物车订单
    @Override
    public Order findCartOrderById(int id) {
        return orderMapper.findCartOrderById(id);
    }
    //通过用户id查找购物车订单列表
    @Override
    public List<Order> findCartOrderListByCmuserid(int id) {
        return orderMapper.findCartOrderListByCmuserid(id);
    }
    //通过id查找已购买的商品订单列表
    @Override
    public List<Order> findBuyOrderListByCmuserid(int id) {
        return orderMapper.findBuyOrderListByCmuserid(id);
    }
    //发送信息给商家
    @Override
    public int sendMessageToBusiness(Notices notices) {
        return orderMapper.sendMessageToBusiness(notices);
    }
    //通过购物车订单id移除购物车订单
    @Override
    public int deleteCartOrderById(int id) {
        return orderMapper.deleteCartOrderById(id);
    }

    @Override
    public Order findOrderByOrderid(int id) {
        return orderMapper.findOrderByOrderid(id);
    }
    @Override
    public int fahuo(Order order) {  return orderMapper.fahuo(order); }

    public Notices findNoticeByOrderid(int id){
        return orderMapper.findNoticeByOrderid(id);
    }
    @Override
    public int shouhuo(Notices notices){
        return orderMapper.shouhuo(notices);
    }



}
