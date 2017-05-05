package com.bank.repo;

import com.bank.model.Account;

public interface AccountRepository {

	Account find(String num);

	void update(Account account);

}