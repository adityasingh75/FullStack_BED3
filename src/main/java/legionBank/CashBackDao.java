package legionBank;

import org.springframework.orm.hibernate4.HibernateTemplate;

import legionBank.CashBack;
public class CashBackDao {
		HibernateTemplate template;  
		public void setTemplate(HibernateTemplate template) {  
		    this.template = template;  
		}   
		
		public void saveCC(CashBack valid){  
		    template.save(valid);  
		} 
		
		public CashBack getId(String customerId, String password){  
			CashBack valid=(CashBack)template.get(CashBack.class,customerId,password);  
		    return valid;  
		}  
	}

}
