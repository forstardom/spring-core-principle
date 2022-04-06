package com.springcoreprinciple;

import com.springcoreprinciple.discount.DiscountPolicy;
import com.springcoreprinciple.discount.FixDiscountPolicy;
import com.springcoreprinciple.discount.RateDiscountPolicy;
import com.springcoreprinciple.member.MemberService;
import com.springcoreprinciple.member.MemberServiceImpl;
import com.springcoreprinciple.member.MemoryMemberRepository;
import com.springcoreprinciple.order.OrderService;
import com.springcoreprinciple.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //call AppConfig.memberService
    //call AppConfig.memberRepository
    //call AppConfig.memberRepository
    //call AppConfig.orderService
    //call AppConfig.memberRepository

    //call AppConfig.memberService
    //call AppConfig.memberRepository
    //call AppConfig.orderService

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
