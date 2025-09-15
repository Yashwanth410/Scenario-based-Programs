public class Customer {
    @NotEmpty
    public String name = "";  // simulate empty value to trigger warning

    public String email = "customer@example.com";  // not validated here
}

