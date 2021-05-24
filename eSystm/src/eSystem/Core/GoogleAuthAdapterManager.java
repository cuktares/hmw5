package eSystem.Core;

import eSystem.Entities.concretes.User;
import eSystem.GoogleAuth.GoogleAuthManager;

public class GoogleAuthAdapterManager implements AuthService{

	GoogleAuthManager googleAuthManager;
	
	public GoogleAuthAdapterManager(GoogleAuthManager googleAuthManager) {
		this.googleAuthManager = googleAuthManager;
	}
	@Override
	public void register(User user) {
		googleAuthManager.register(user);
		
	}

	@Override
	public void login(User user) {
		googleAuthManager.login(user);
		
	}
	

}
