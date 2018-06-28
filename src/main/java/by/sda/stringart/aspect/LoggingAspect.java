package by.sda.stringart.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private static Logger log = LogManager.getLogger();
	@AfterThrowing(pointcut = "within(by.sda.stringart..*)", throwing = "ex")
	public void doRecoveryActions(Exception ex) {
		log.catching(ex);
	}
}
