package eSystem.com.company;


import eSystem.AppleAuth.AppleAuthManager;
import eSystem.Business.abstracts.UserService;
import eSystem.Business.concretes.UserManager;
import eSystem.Core.AppleAuthManagerAdapter;
import eSystem.Core.AuthService;
import eSystem.Core.GoogleAuthAdapterManager;
import eSystem.DataAccess.concretes.HibernateUserDao;
import eSystem.Entities.concretes.User;
import eSystem.GoogleAuth.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(), new AppleAuthManagerAdapter(new AppleAuthManager()));
		User user = new User("Emirhan", "Unal", "emirhan_60unal@hotmail.com", "19031903", true);
		User user1 = new User("Oguzcan", "Unal", "oguz_unal_60@hotmail.com", "159357", true);
		userService.register(user);
		userService.login(user);
		userService.confirm(user);
		userService.registerWithAccount(user1);
		userService.loginWithAccount(user1);
		
		
		

	}

}
