package eSystem.Business.abstracts;

import eSystem.Entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	void confirm(User user);
	void registerWithAccount(User user);
	void loginWithAccount(User user);

}
