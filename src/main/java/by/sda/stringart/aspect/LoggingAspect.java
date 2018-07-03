package by.sda.stringart.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private static Logger log = LogManager.getLogger();
	
	@After("within(by.sda.stringart..*)")
	public void logInfo(JoinPoint point) {
		log.info(point.getSignature().getDeclaringTypeName() + " " + point.getSignature().getName() + " called.");
	}
	
	@AfterThrowing(pointcut = "within(by.sda.stringart..*)", throwing = "ex")
	public void doRecoveryActions(Exception ex) {
		log.catching(ex);
	}
	
}
