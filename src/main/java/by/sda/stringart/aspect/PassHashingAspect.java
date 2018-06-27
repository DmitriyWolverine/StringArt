package by.sda.stringart.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PassHashingAspect {
	
	@Before(value = "execution(* by.sda.stringart.service.impl.UserServiceImpl.create(..))")
	public void hashPassAdvice(JoinPoint point) {
		for(Object o:point.getArgs()) {
			System.out.println(o);
		}
		
	}
}
