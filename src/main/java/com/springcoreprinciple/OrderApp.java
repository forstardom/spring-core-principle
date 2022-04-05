package com.springcoreprinciple;

import com.springcoreprinciple.member.Grade;
import com.springcoreprinciple.member.Member;
import com.springcoreprinciple.member.MemberService;
import com.springcoreprinciple.member.MemberServiceImpl;
import com.springcoreprinciple.order.Order;
import com.springcoreprinciple.order.OrderService;
import com.springcoreprinciple.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {

    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = ac.getBean("memberService", MemberService.class);
        OrderService orderService = ac.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);

    }
}
