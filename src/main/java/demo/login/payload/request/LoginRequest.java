package demo.login.payload.request;

import org.springframework.lang.NonNull;

public class LoginRequest {
    
    @NonNull
    private String email;

    @NonNull
    private String password;

    public String getUsername() {
        return email;
    }

    public void setUsername(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
