package br.com.san.ls.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import br.com.san.ls.entity.User;

@Component
@Aspect
public class LogginAspect {

	private Logger logger = Logger.getLogger(getClass().getName());

	@Pointcut("execution(* br.com.san.ls.controller.*.*(..))")
	private void pointcutForControllerPackage() {
	}

	@Pointcut("execution(* br.com.san.ls.service.*.*(..))")
	private void pointcutForServicePackage() {
	}

	@Pointcut("execution(* br.com.san.ls.repository.*.*(..))")
	private void pointcutForRepositoryPackage() {
	}

	@Pointcut("pointcutForControllerPackage() || pointcutForServicePackage() || pointcutForRepositoryPackage()")
	private void pointcutForPackages() {
	}

	@Before("pointcutForPackages()")
	private void beforeAdvice(JoinPoint joinPoint) {
		String methodSignature = joinPoint.getSignature().toShortString();
		logger.info("===>> Custom log: in @Before -> Calling method: " + methodSignature);

	}

	@AfterReturning(pointcut = "execution(* br.com.san.ls.service.*.save(br.com.san.ls.entity.User))", returning = "user")
	private void beforeSaveNewUser(JoinPoint joinPoint, Object user) {
		int theId = ((User) user).getId();
		logger.info("===>> Custom log: in @AfterReturning -> New user registered! id: " + theId);

	}

}
