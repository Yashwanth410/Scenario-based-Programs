public class UserAPI {
    @APIInfo(endpoint="/users", method="GET")
    public void getUsers() {
        // Logic for getting users
    }
    
    @APIInfo(endpoint="/users", method="POST")
    public void createUser() {
        // Logic for creating user
    }
    
    @APIInfo(endpoint="/users/{id}", method="DELETE")
    public void deleteUser() {
        // Logic for deleting user
    }
}

