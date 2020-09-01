package com.example.study01.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Override
    protected void configure(HttpSecurity http) throws Exception{
    	http.authorizeRequests()
		.anyRequest()
		.authenticated()
		.and()
	.formLogin()
		//.loginPage("/login")
        //.loginProcessingUrl("/login")
        .failureUrl("/login?error=true")
        .defaultSuccessUrl("/loginSuccess", true)
        .usernameParameter("username")
        .passwordParameter("password")
        .permitAll()
        .and()
    .logout()
    	.deleteCookies("remove")
        .invalidateHttpSession(true)
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        .logoutSuccessUrl("/login")
        .and()
    .csrf()
    	.disable();
}
}
