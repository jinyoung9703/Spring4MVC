package com.hello.spring4.controller;

import com.hello.spring4.model.Member;
import com.hello.spring4.service.MemberService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MemberController {


    private Logger logger = LogManager.getLogger(MemberController.class);

     @Autowired
    private MemberService msrv;

    @RequestMapping(value = "/member/join", method = RequestMethod.GET)
    public String join(Model m){

        // 로거 출력
        logger.info("member/join 호출!");

        return "member/join.tiles";
    }
    @RequestMapping(value = "/member/join", method = RequestMethod.POST)
    public String joinok(Member m){
        logger.info("member/joinok 호출!");
        String viewName = "/member/fail";

       if (msrv.saveMember(m))
           viewName = "redirect:/member/login";//회원가입 처리

        return viewName;
    }
    @RequestMapping(value = "/member/login", method = RequestMethod.GET)
    public String login(Model m){

        // 로거 출력
        logger.info("member/login 호출!");

        return "member/login.tiles";
    }

    @RequestMapping(value = "/member/login", method = RequestMethod.POST)
    public String loginok(Model m){

        // 로거 출력
        logger.info("member/loginok 호출!");
/*성공하면 redirect로 myinfo로 이동.*/
        return "redirect:/member/myinfo";
    }

    @RequestMapping("/member/myinfo")
    public String myinfo(Model m){

        // 로거 출력
        logger.info("member/myinfo 호출!");

        return "member/myinfo.tiles";
    }


}
