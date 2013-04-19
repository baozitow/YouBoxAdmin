package Action;

import java.util.List;

import DAO.PackageDao;
import Beans.Package;

import com.opensymphony.xwork2.ActionSupport;

public class getPackageDetailsByBoxNumAction extends ActionSupport{
	
	private int boxNum;
	PackageDao packageDao;
	List<Package> packages=null;
	
	public String execute(){
		//fetch package details by box number
		packageDao=new PackageDao();
		packages=packageDao.getPacakgeDetailsByBoxNum(boxNum);
		System.out.println("-----------------------------------------------");
		if(packages.iterator().hasNext())
			System.out.println("boxNum: "+boxNum);
		for(Package p:packages){
			p.print();
		}
		return "success";
	}

	public int getBoxNum() {
		return boxNum;
	}

	public void setBoxNum(int boxNum) {
		this.boxNum = boxNum;
	}

	public List<Package> getPackages() {
		return packages;
	}

	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}
	
	
}
