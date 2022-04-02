package com.springcoreprinciple.discount;

import com.springcoreprinciple.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
