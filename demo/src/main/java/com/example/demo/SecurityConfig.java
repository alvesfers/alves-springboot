// package com.example.demo;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfigurerAdapter {

//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http
//             .csrf().disable()  // Desabilitar CSRF para facilitar testes no ambiente de desenvolvimento
//             .authorizeRequests()
//             .antMatchers("/acais/**").permitAll()  // Permitir acesso à URL /acais sem autenticação
//             .anyRequest().authenticated();  // Proteger outras URLs
//     }
// }