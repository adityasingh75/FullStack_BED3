package legionBank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
	@Controller
	@RequestMapping("CashBackOffer")

	public class CashBackController {	
		   @RequestMapping(method = RequestMethod.POST)
		   public String checkCustomer(String customerId,String password) {
			   System.out.println("customerId >> "+customerId);
			   String custId = customerId.toUpperCase();
			   
			   CashBackService CashBackService = new CashBackService();
			   
			   String checkCredit =CashBackService.checkCustomer(custId,password);
			   String returnJsp = "";
			   switch (checkCredit) {
					case "A":
						returnJsp ="CashBackOfferPage";
						break;
					case "B":
						returnJsp ="NoCashBackPage";
						break;
					default:
						returnJsp ="InvalidCouponPage";
						break;
					}
		      return returnJsp;
		   }
	}


