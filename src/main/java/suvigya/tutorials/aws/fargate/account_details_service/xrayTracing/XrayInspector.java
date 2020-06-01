package suvigya.tutorials.aws.fargate.account_details_service.xrayTracing;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.amazonaws.xray.spring.aop.AbstractXRayInterceptor;

@Aspect
@Component
public class XrayInspector extends AbstractXRayInterceptor {

	@Override
	@Pointcut("within(com.amazonaws.xray.spring.aop.XRayEnabled) && bean(*Controller)")
	protected void xrayEnabledClasses() {
		// TODO Auto-generated method stub
		
	}

}
