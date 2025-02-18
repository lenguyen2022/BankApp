package ca.sheridancollege.lenguyen.bankapp.databases;

import ca.sheridancollege.lenguyen.bankapp.beans.Bank;
import org.springframework.data.repository.CrudRepository;

public interface BankRepository extends CrudRepository<Bank, Long> {
}
