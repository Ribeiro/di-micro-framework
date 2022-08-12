package com.useraccout;

import com.useraccout.services.AccountService;
import com.useraccout.services.UserService;
import org.di.framework.annotations.Autowired;
import org.di.framework.annotations.Component;
import org.di.framework.annotations.Qualifier;

@Component
public class UserAccountClientComponent {

    @Autowired
    private UserService userService;

    @Autowired
    @Qualifier(value = "accountServiceImpl")
    private AccountService accountService;

    public void displayUserAccount() {
        String username = userService.getUserName();
        Long accountNumber = accountService.getAccountNumber(username);
        System.out.println("\n\tUser Name: " + username + "\n\tAccount Number: " + accountNumber + "\n");
    }
}
