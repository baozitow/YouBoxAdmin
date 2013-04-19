package Action;

import org.apache.struts2.ServletActionContext;

import Beans.Admin;
import DAO.AdminDao;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends ActionSupport implements ModelDriven<Admin>{
	

	private Admin admin=new Admin();
	
	
	public Admin getModel(){
		return admin;
	}
	
	private AdminDao adminDao=new AdminDao();

	/**
	 * Model-driven to fetch data
	 * So the method name have to be getModel()
	 * @return
	 */
	
	public String login() {
		
		
		if(adminDao.get(admin.getUsername(), admin.getPassword())!=null){
			ServletActionContext.getRequest().getSession().setAttribute("admin", "admin");		
			return "success";
		}else{
			return "fail";
		}
		
	}


	
	

	

}
