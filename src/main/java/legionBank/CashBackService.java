package legionBank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import legionBank.CashBackDao;
public class CashBackService {
		
		public String checkCustomer(String customerId,String password) {
			//String checkCredit="C";

		    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		      
		    CashBackDao dao=context.getBean("CashBackdao",CashBackDao.class);  
		      
		    CashBack val =  dao.getId(customerId,password);
		       String cId=val.getcustomerId();
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	
		    
		    if(val == null) {
		    	checkCredit = "C";
		    }else if(val.getCreditScore()>=5) {
		    	checkCredit = "A";
		    }else if(val.getCreditScore()<5) {
		    	checkCredit = "B";
		    }
		    
			return checkCredit; 
		}
	}





