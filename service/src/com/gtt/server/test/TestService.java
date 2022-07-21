package com.gtt.server.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.SessionHolder;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.gtt.server.user.service.CompanyService;
import com.gtt.server.user.service.CompanyTypeService;
import com.gtt.server.user.service.ProjectService;
import com.gtt.server.user.service.RequestService;
import com.gtt.server.user.service.RequestStatusService;
import com.gtt.server.user.service.RequestTypeService;
import com.gtt.server.user.service.UserPositionService;
import com.gtt.server.user.service.UserPrefixService;
import com.gtt.server.user.service.UserProjectService;
import com.gtt.server.user.service.UserService;
import com.gtt.server.user.service.UserTypeService;

import junit.framework.TestCase;

public class TestService extends TestCase {
	private CompanyService companyService = null;
	private CompanyTypeService companyTypeService = null;
	
	private ProjectService projectService = null;
	
	private RequestService requestService = null;
	private RequestStatusService requestStatusService = null;
	private RequestTypeService requestTypeService = null;
	
	private UserService userService = null;
	private UserPrefixService userPrefixService = null;
	private UserProjectService userProjectService = null;
	private UserTypeService userTypeService = null;
	private UserPositionService userPositionService = null;

	private ApplicationContext ctx = null;
	SessionFactory sessionFactory = null;

	public TestService(String name) {
		super(name);
		String[] paths = { "/com/gtt/server/conf/application-context.xml" };
		ctx = new ClassPathXmlApplicationContext(paths);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");
		Session s = sessionFactory.openSession();
		TransactionSynchronizationManager.bindResource(sessionFactory, new SessionHolder(s));

		
		companyService = (CompanyService) ctx.getBean("companyService");
		projectService = (ProjectService) ctx.getBean("projectService");
		userService = (UserService) ctx.getBean("userService");
		userPrefixService = (UserPrefixService) ctx.getBean("userPrefixService");
		userProjectService = (UserProjectService) ctx.getBean("userProjectService");
		userTypeService = (UserTypeService) ctx.getBean("userTypeService");
		requestService = (RequestService) ctx.getBean("requestService");
		userPositionService = (UserPositionService) ctx.getBean("userPositionService");
		companyTypeService = (CompanyTypeService) ctx.getBean("companyTypeService");
		requestStatusService = (RequestStatusService) ctx.getBean("requestStatusService");
		requestTypeService = (RequestTypeService) ctx.getBean("requestTypeService");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		SessionHolder holder = (SessionHolder) TransactionSynchronizationManager.getResource(sessionFactory);
		Session s = holder.getSession();
		s.flush();
		TransactionSynchronizationManager.unbindResource(sessionFactory);
		SessionFactoryUtils.closeSession(s);

		companyService = null;
		projectService = null;
		userService = null;
		userPrefixService = null;
		userProjectService = null;
		userTypeService = null;
		requestService = null;
		userPositionService = null;
		companyTypeService = null;
		requestStatusService = null;
		requestTypeService = null;
	}

	
	public void test() throws Exception {
//		System.out.print(requestService.getAllItems().size());
//		System.out.print(projectService.getAllItems().size());
//		System.out.print(userService.getAllItems().size());
//		System.out.print(userPositionService.getAllItems().size());
//		System.out.print(companyTypeService.getAllItems().size());
//		System.out.print(userPrefixService.getAllItems().size());
//		System.out.print(userProjectService.getAllItems().size());
//		System.out.print(userTypeService.getAllItems().size());
//		System.out.print(requestTypeService.getAllItems().size());
//		System.out.print(requestStatusService.getAllItems().size());
	}
}
