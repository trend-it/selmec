package mx.com.selmec.services.impl;

import javax.jws.WebService;

import mx.com.selmec.dao.User;
import mx.com.selmec.services.MobileAppServices;

@WebService(endpointInterface = "mx.com.selmec.services.MobileAppServices")
public class MobileAppServicesImpl implements MobileAppServices{
	
	@Override
	public String login(User user){
		return "Hello "+ user.getUsername();
	}

}
