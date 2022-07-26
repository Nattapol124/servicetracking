package gtt.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

import com.gtt.server.user.entity.Project;
import com.gtt.server.user.entity.Request;
import com.gtt.server.user.entity.RequestStatus;
import com.gtt.server.user.entity.User;
import com.gtt.server.user.service.ProjectService;
import com.gtt.server.user.service.RequestService;
import com.gtt.server.user.service.UserService;


public class IndexAction extends CoreAction {

	private UserService userService;
	private RequestService requestService;
	private ProjectService projectService;

	

	public ActionForward index(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			DynaActionForm dynaForm = (DynaActionForm) form;
			resetForm(dynaForm, mapping, request);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mapping.findForward("Index");
	}
	
	public ActionForward getRequest(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			DynaActionForm dynaForm = (DynaActionForm) form;
			User user = (User) getObjectSession(request, SESSION_USER);
			List<Request> requestList = requestService.getReqByUser(String.valueOf(user.getId()));
			dynaForm.set("resultList", requestList);;
			request.setAttribute("resultList", requestList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mapping.findForward("Request");
	}
	
	public ActionForward request(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			DynaActionForm dynaForm = (DynaActionForm) form;
			resetForm(dynaForm, mapping, request);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mapping.findForward("Request");
	}

	public ActionForward login(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			DynaActionForm dynaForm = (DynaActionForm) form;
			List<User> users = userService.getLogin(dynaForm.getString("un"), dynaForm.getString("pw"));
			if (users != null && users.size() > 0) {
				User user = users.iterator().next();
				dynaForm.set("un",user.getUsername());
				dynaForm.set("pw", user.getPassword());
				setObjectSession(request, SESSION_USER, user);
			} else {
				
				return mapping.findForward("Index");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mappingForward(mapping, request, "mode", "getRequest", "index.htm", "eduForm", null);
	}
	
		
	
	public ActionForward requestBtn(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			DynaActionForm dynaForm = (DynaActionForm) form;
			resetForm(dynaForm, mapping, request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mappingForward(mapping, request, "mode", "getProject", "index.htm", "eduForm", null);
	}
	
	public ActionForward getProject(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		try {
			DynaActionForm dynaForm = (DynaActionForm) form;
			User user = (User) getObjectSession(request, SESSION_USER);
//			System.out.println(String.valueOf(user.getCustomer().getId()));
			List<Project> projectList = projectService.getProject(String.valueOf(user.getCustomer().getId()), String.valueOf(user.getId()));
			dynaForm.set("projectList", projectList);
			request.setAttribute("projectList", projectList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mapping.findForward("AddRequest");
	}
	
	
	public ActionForward addRequest(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
		try {
			DynaActionForm dynaForm = (DynaActionForm) form;
			
			Request entity = null;
			
			User user = (User) getObjectSession(request, SESSION_USER);
			entity.setUser(user);
			RequestStatus status = new RequestStatus();
			status.setId(1);
			entity.setRequest_status(null);
			
			Project project = new Project();
			project.setName(dynaForm.getString("project"));
			entity.setProject(null);
			
			entity.setTitle(dynaForm.getString("title"));
			entity.setRemark(dynaForm.getString("remark"));
			entity.setDate(null);
			entity.setFile(dynaForm.getString("file"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mapping.findForward("AddRequest");
	}
	
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public RequestService getRequestService() {
		return requestService;
	}

	public void setRequestService(RequestService requestService) {
		this.requestService = requestService;
	}


	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	
	
	

}
