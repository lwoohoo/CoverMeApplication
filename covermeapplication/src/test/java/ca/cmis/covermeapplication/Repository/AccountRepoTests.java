package ca.cmis.covermeapplication.Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ca.cmis.covermeapplication.model.Account;
import ca.cmis.covermeapplication.repository.AccountRepository;

@SpringBootTest
public class AccountRepoTests {
    @Autowired
    private AccountRepository accountRepository;

    @AfterEach
    public void clear() {
        accountRepository.deleteAll();
    }

    @Test
    public void testFindAccount() {
        //create account
        String name = "Peter Quinley";
        String email = "Peter@yandex.ru";
        String phoneNumber = "902-310-3030";
        String username = "peteyboy";
        String password = "password123";
        boolean isAdmin = false;

        Account account = new Account(name, email, phoneNumber, username, password, isAdmin);

        account = accountRepository.save(account);

        account = accountRepository.findAccountByAccountID(account.getAccountID());

        assertNotNull(account);
        assertEquals(name, account.getName());
        assertEquals(email, account.getEmail());
        assertEquals(phoneNumber, account.getPhoneNumber());
        assertEquals(username, account.getUsername());
        assertEquals(password, account.getPassword());
        assertEquals(isAdmin, account.getIsAdmin());
    }

}
