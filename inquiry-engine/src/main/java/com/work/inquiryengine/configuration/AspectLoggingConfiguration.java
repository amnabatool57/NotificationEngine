package com.work.inquiryengine.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLoggingConfiguration {

	protected static final Logger logger = LogManager.getLogger();

	@Before("execution(* com.work.inquiryengine.service.implementation..*.*(..))")
	public void logMethodAccessBefore(JoinPoint joinPoint) {
		logger.info("***** Starting: " + joinPoint.getSignature().getName() + " *****");
	}

	@AfterReturning("execution(* com.work.inquiryengine.service.implementation..*.*(..))")
	public void logMethodAccessAfter(JoinPoint joinPoint) {
		logger.info("***** Completed: " + joinPoint.getSignature().getName() + " *****");
	}

	@Around("@annotation(ExecutionTimeLogger)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object proceed = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		logger.info(joinPoint.getSignature() + " executed in " + (endTime - startTime) + "ms");
		return proceed;
	}

//	@Around("execution(* com.work.inquiryengine.service.implementation..*.*(..))")
//	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
//		log.info("***** Around: " + joinPoint.getSignature().getName() + " *****");
//		System.out.println("***** Around: " + joinPoint.getSignature().getName() + " *****");
//		long start = System.currentTimeMillis();
//
//		Object proceed = joinPoint.proceed();
//
//		long executionTime = System.currentTimeMillis() - start;
//
//		System.out.println(joinPoint.getSignature() + " executed in " + executionTime + "ms");
//		return proceed;
//	}

//	@Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping) || @annotation(org.springframework.web.bind.annotation.PutMapping) || @annotation(org.springframework.web.bind.annotation.DeleteMapping)")
//	public void mappingMethods() {
//	}
//
//	@Around("mappingMethods()")
//	public Object logRequestAndResponse(ProceedingJoinPoint joinPoint) throws Throwable {
//		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
//				.getRequest();
//		System.out.println("Request: {" + request.getMethod() + " " + request.getRequestURI() + "} {} - Parameters: {"
//				+ request.getParameterMap() + "}");
//		Object result = joinPoint.proceed();
//		if (result instanceof ResponseEntity) {
//			ResponseEntity<?> responseEntity = (ResponseEntity<?>) result;
//			System.out.println("Response: Status {" + responseEntity.getStatusCode() + "} - Body: {"
//					+ responseEntity.getBody().toString() + "}");
//		}
//		return result;
//	}

//	@Pointcut("execution(public * com.example.myapp..*.*(..))")
//    public void publicMethods() {}
//
//    @Around("publicMethods()")
//    public Object logMethodEntryAndExit(ProceedingJoinPoint joinPoint) throws Throwable {
//        // Log method entry and arguments
//        Object[] args = joinPoint.getArgs();
//
//        logger.debug("Entering method [{}] with arguments: {}", joinPoint.getSignature(), Arrays.toString(args));
//
//        // Execute the target method and capture the return value
//        Object result = joinPoint.proceed();
//
//        // Log method exit and return value
//        logger.debug("Exiting method [{}] with result: {}", joinPoint.getSignature(), result);
//
//        // Return the result
//        return result;
//    }

}