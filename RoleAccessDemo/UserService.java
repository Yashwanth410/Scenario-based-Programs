public class UserService {
    @RoleAllowed(role="ADMIN")
    public void deleteUser() {
        System.out.println("User deleted.");
    }

    @RoleAllowed(role="USER")
    public void viewProfile() {
        System.out.println("User profile viewed.");
    }

    @RoleAllowed(role="ADMIN")
    public void addUser() {
        System.out.println("User added.");
    }
}

