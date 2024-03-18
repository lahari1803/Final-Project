import java.util.ArrayList;
import java.util.List;
public class UserAuthentication 
{
	private List<User> users;
	public UserAuthentication()
	{
		this.users = new ArrayList<>();
	}
	
 public void registerUser(String username, String password, String name, String email)
 {
	 if (isUsernameTaken(username)) {
	 System.out.println("Username is already taken. Please choose a different one.");
   	return;
 }
	 
	 User newUser = new User(username, password, name, email);
	 users.add(newUser);
	 System.out.println("User registered successfully!");
 }
 
 public User login(String username, String password)
 {
	 for (User user : users) 
	 {
		 if (user.getUsername().equals(username) && user.getPassword().equals(password))
		 {
			 return user;
		 }
	 }
	 return null; 
 }
 
 private boolean isUsernameTaken(String username)
 {
	 for (User user : users)
	 {
		 if (user.getUsername().equals(username))
		 {
			 return true; 
		 }
	 }
	 return false;
 }
 
 public boolean isValidPassword(String password)
 {
	// TODO Auto-generated method stub
	return false;
}
public boolean isValidUsername(String username)
{
	// TODO Auto-generated method stub
	return false;
	
}
}




