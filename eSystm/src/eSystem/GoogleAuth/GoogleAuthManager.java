package eSystem.GoogleAuth;

import eSystem.Entities.concretes.User;

public class GoogleAuthManager {
	public void register(User user)
	{
		System.out.println("Sayin " + user.getName()+ " " + user.getSurName() + " " + "Google hesabiniz ile kayit oldunuz.");
	}
	public void login(User user)
	{
		System.out.println("Sayin " + user.getName()+ " " + user.getSurName() + " " + "Google hesabiniz ile giris yaptiniz.");
	}

}
