package eSystem.Core;

import eSystem.Entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(User user);
	

}
