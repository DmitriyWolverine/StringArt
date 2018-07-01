package by.sda.stringart.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.bouncycastle.jcajce.provider.digest.SHA3;

@Aspect
@Component
public class PassHashingAspect {

	@Around(value = "execution(* by.sda.stringart.service.impl.UserServiceImpl.create(..))")
	public Object hashPassAdvice(ProceedingJoinPoint pjp) throws Throwable {
		String pass = (String) pjp.getArgs()[2];
		Object[] res =  pjp.getArgs();
		res[2] = passToStrBuilder(pass).toString();
		return  pjp.proceed(res);
	}
	
	@Around(value = "execution(*  by.sda.stringart.service.impl.UserServiceImpl.validateUser(..))")
	public Object checkPassAdvice(ProceedingJoinPoint pjp) throws Throwable {
		String pass = (String) pjp.getArgs()[1];
		Object[] res =  pjp.getArgs();
		res[1] = passToStrBuilder(pass).toString();
		return pjp.proceed(res);
	}
	
	
	
	private StringBuilder passToStrBuilder(String pass) {
		SHA3.DigestSHA3 digestSHA3 = new SHA3.Digest512();
	    byte[] digest = digestSHA3.digest(pass.getBytes());
	    StringBuilder builder = new StringBuilder();
	    for( int i = 0 ; i < digest.length; ++i) {
	    	builder.append( Integer.toString(digest[i] & 0xff,16) );
	    }
	    return builder;
	}

}
