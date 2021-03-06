package to.msn.wings.quickmaster.common;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoggingInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request,
        HttpServletResponse response, Object handler) throws Exception {
        Method m = ((HandlerMethod)handler).getMethod();
        System.out.println("［PreHandler］ " + m.getName());
        return super.preHandle(request, response, handler);
    }
}
