package ca.sheridancollege.lenguyen.bankapp.databases;

import ca.sheridancollege.lenguyen.bankapp.beans.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}