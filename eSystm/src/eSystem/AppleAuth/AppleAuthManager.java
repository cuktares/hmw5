package eSystem.AppleAuth;

import eSystem.Entities.concretes.User;

public class AppleAuthManager {
	public void register(User user)
	{
		System.out.println("Sayin " + user.getName()+ " " + user.getSurName() + " " + "Apple hesabiniz ile uye oldunuz.");
	}
	public void login(User user)
	{
		System.out.println("Sayin " + user.getName()+ " " + user.getSurName() + " " + "Apple hesabiniz ile giris yaptýnýz.");
	}

}
