package com.koreak.study;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String main(Model model) {
        String id = SecurityContextHolder.getContext().getAuthentication().getName(); // 현재 인증된 사용자의 아이디 가져오기

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
        Iterator<? extends GrantedAuthority> iterator = authorities.iterator();
        String role = "";
        if (iterator.hasNext()) {
            GrantedAuthority grantedAuthority = iterator.next();
            role = grantedAuthority.getAuthority(); // 현재 사용자의 권한(role) 가져오기
        }

        model.addAttribute("id", id);
        model.addAttribute("role", role);

        return "home"; // 홈 페이지로 이동
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // 로그인 페이지로 이동
    }
    
    @PostMapping("/loginProc")
    public String loginurl() {
    	return "/";
    }
    

    @GetMapping("/error")
    public String handleError() {
        return "login?error=true"; // 로그인 에러 시 다시 로그인 페이지로 리다이렉트
    }
}