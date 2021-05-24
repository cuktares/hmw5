package eSystem.Business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eSystem.Business.abstracts.UserService;
import eSystem.Core.AuthService;
import eSystem.DataAccess.abstracts.UserDao;
import eSystem.Entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	
	private AuthService authService;
	
	
	public UserManager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void register(User user) {
		if(user.getPassword().length() <6)
		{
			System.out.println("sifre en az 6 karakterden olusmalidir.");
		}
		final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
		final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(user.getEmail());
		if(!matcher.matches())
		{
			System.out.println(user.getEmail() + "Gecersiz e-mail");
		}
		for(User users:userDao.getAll())
		{
			if(users.getEmail().equals(user.getEmail()))
			{
				System.out.println(user.getEmail() + "Gecerli e-mail"); 
				
			}
		}
		if(user.getName().length() < 2 && user.getSurName().length() < 2)
		{
			System.out.println("Ad ve Soyad en az 2 karakterden oluþmalýdýr.");
		}
		
		
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		if(user.isVerify() == true)
		{
			userDao.login(user);
		}
		else {
			System.out.println("Lutfen mail adresinizi kontrol ediniz.");
		}
		
	}

	@Override
	public void confirm(User user) {
		// TODO Auto-generated method stub
		if(user.isVerify() == true)
		{
			userDao.confirm(user);
			System.out.println("Sayýn " + user.getName() + " " + user.getSurName()+" " + "mail adresi dogrulanmistir.");

		}
		else
		{
			System.out.println("Sayýn " + user.getName() + " " + user.getSurName()+" " + "belirttiginiz mail adresi dogrulanmamistir.");
		}
		
	}

	@Override
	public void registerWithAccount(User user) {
		user.setVerify(true);
		this.authService.register(user);
		
	}

	@Override
	public void loginWithAccount(User user) {
		if(user.isVerify() == true)
		{
			this.authService.login(user);;
		}else
		{
			System.out.println(" Kayitli degil.");
		}
		
	}

}
