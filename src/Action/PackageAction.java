package Action;

import java.util.List;

import DAO.PackageDao;
import Beans.Package;

import com.opensymphony.xwork2.ActionSupport;

public class PackageAction extends ActionSupport {

	private int terminalId;
	private PackageDao packageDao = new PackageDao();

	public String terminalPackageStatus() {

		
		//return  all packages in this terminal
		
		List<Package> packages;

		packages = packageDao.PackagesInThisTerminal(terminalId);

		if (packages != null) {
			return "terminalPackageStatus";
		} else {
			return "false";
		}

	}


	public int getTerminalId() {

		return terminalId;
	}

	public void setTerminalId(int terminalId) {

		this.terminalId = terminalId;
	}
}
