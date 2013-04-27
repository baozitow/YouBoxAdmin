package Service;

import DAO.BoxDao;

class BoxService {
	
	BoxDao boxDao;
	
	public BoxService(){
		boxDao=new BoxDao();
	}
	public boolean IncreaseBoxService(int terminalID,int boxNum,int boxType){
		
		for(int i=1;i<=boxNum;i++){
			boxDao.addBox(terminalID, i, boxType);
		}
		return true;
		
		
	}
	
}
