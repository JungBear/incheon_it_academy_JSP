

package com.koreak.study.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration()
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private CustomAuthenticationFailureHandler customAuthenticationFailureHandler;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        UserDetails user = User.withUsername("user")
                .password(passwordEncoder().encode("password"))
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder().encode("admin"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
        	.authorizeHttpRequests(authorize -> authorize
	                .requestMatchers("/public/**", "/login", "/error").permitAll()
	                .anyRequest().authenticated()
        			)
        	.csrf().disable()
            .formLogin(form -> form
                .loginPage("/login") // 로그인 페이지 설정
                .loginProcessingUrl("/loginProc") // 로그인 처리 URL 설정
                .successHandler((request, response, authentication) -> {
                	System.out.println(" 성공 핸들러");
                    System.out.println("authentication : " + authentication.getName());
                    response.sendRedirect("/"); // 로그인 성공 시 홈 페이지로 리다이렉트
                })
                .failureHandler(customAuthenticationFailureHandler) // 로그인 실패 시 핸들러 설정
                .permitAll() // 로그인 페이지 접근 허용
                .defaultSuccessUrl("/") // 기본 로그인 성공 시 리다이렉트할 URL 설정
            )
            .logout(logout -> logout
                .permitAll() // 로그아웃 접근 허용
            );
        return http.build();
    }
}
