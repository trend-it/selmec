package mx.com.selmec.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import mx.com.selmec.dao.User;


@WebService
@SOAPBinding(style = Style.RPC)
public interface MobileAppServices {
	

	@WebMethod 
	public String login (User user);
	

}
