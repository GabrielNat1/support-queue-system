package com.example.support_queue_system.security;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.Instant;

@Component
public class LoggingInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        request.setAttribute("startTime", Instant.now().toEpochMilli());
        System.out.println("Incoming request: " + request.getMethod() + " " + request.getRequestURI());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        long startTime = (long) request.getAttribute("startTime");
        long duration = Instant.now().toEpochMilli() - startTime;
        System.out.println("Completed request: " + request.getMethod() + " " + request.getRequestURI() +
                " Status: " + response.getStatus() + " Duration: " + duration + "ms");
    }
}