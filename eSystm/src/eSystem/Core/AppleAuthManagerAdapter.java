package eSystem.Core;

import eSystem.AppleAuth.AppleAuthManager;
import eSystem.Entities.concretes.User;


public class AppleAuthManagerAdapter implements AuthService{

	AppleAuthManager appleAuthManager;
	public AppleAuthManagerAdapter(AppleAuthManager appleAuthManager) {
		this.appleAuthManager = appleAuthManager;
	}
	@Override
	public void register(User user) {
		appleAuthManager.register(user);
		
	}

	@Override
	public void login(User user) {
		appleAuthManager.login(user);
		
	}

}
