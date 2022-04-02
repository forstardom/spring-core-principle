package com.springcoreprinciple;

import com.springcoreprinciple.discount.FixDiscountPolicy;
import com.springcoreprinciple.member.MemberService;
import com.springcoreprinciple.member.MemberServiceImpl;
import com.springcoreprinciple.member.MemoryMemberRepository;
import com.springcoreprinciple.order.OrderService;
import com.springcoreprinciple.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }

}
