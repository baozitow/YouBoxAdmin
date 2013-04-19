package Action;

import Beans.Package;
import DAO.PackageDao;

import com.opensymphony.xwork2.ActionSupport;

public class getPackageDetailsByIdAction extends ActionSupport{
	
	private int packageId;
	
	PackageDao packageDao;


	public String getPackageById(){
		//fetch package details by package id
		packageDao=new PackageDao();
		Package p=packageDao.getPackageDetailsByID(packageId);
		if(p!=null){
			return "success";
		}else{
			return "fails";
		}
		
	}
	
	public int getPackageId() {
		return packageId;
	}


	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

}
