package com.hello.spring4.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {

    private String mno;
    private String userid;
    private String password;
    private String name;
    private String email;
    private String regdate;



}
