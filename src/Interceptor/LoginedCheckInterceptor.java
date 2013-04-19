package Interceptor;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginedCheckInterceptor extends AbstractInterceptor {

	public String intercept(ActionInvocation ai) throws Exception {
		
		if(!ServletActionContext.getRequest().isRequestedSessionIdValid()||
				ServletActionContext.getRequest()==null){
			System.out.println(">>>>>>>>>>>> fails");
			return "register";
		}
		
		ActionContext ctx = ai.getInvocationContext();
		Map session = ctx.getSession();
		String admin = (String)session.get("admin");
		if (admin != null && admin.equals("admin") )
		{
			return ai.invoke();
		}else{
			return "login";
		}
	}

}
