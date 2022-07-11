package group.project02;

public class Task6 {

    /*
    Create Registration Class in which you would have variables as email, userName and password that have an access scope
    only within its own class. After creating an object of the class user should be able to call methods and in each method
    separately pass values to set users email, username and password.
    Requirements:
    Valid email consider to be only yahoo
    Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.
     */
}

class Registration{
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if(email.contains("@yahoo.com")) {
            this.email = email;
        }else{
            System.out.println("Yahoo is the only valid email");
        }
    }

    public void setUserName(String userName) {
        if(!userName.isEmpty()&&userName.length()>6) {
            this.userName = userName;
        }else{
            System.out.println("Username cannot be empty or must be larger than 6 characters ");
        }
    }

    public void setPassword(String password) {
        if(!password.isEmpty()&&password.length()>6&&!password.contains(userName)) {
            this.password = password;
        }else{
            System.out.println("Password cannot be empty or must be larger than 6 characters. Also it cannot contain username.");
        }
    }
    public static void main(String[] args) {
        Registration user=new Registration();
        user.setEmail("user@yahoo.com");
        user.setUserName("user12345");
        user.setPassword("12345user");
    }
}
