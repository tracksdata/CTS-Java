package com.bank.service;

import com.bank.model.Account;
import com.bank.repo.AccountRepository;

public class NEFTTxrService implements TxrService {

	private AccountRepository accountRepository;

	public NEFTTxrService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	/* (non-Javadoc)
	 * @see com.bank.service.TxrService#doTxr(double, java.lang.String, java.lang.String)
	 */
	@Override
	public void doTxr(double amunt, String fromAccNum, String toAccNum) {

		Account fromAccount = accountRepository.find(fromAccNum);
		Account toAccount = accountRepository.find(toAccNum);

		// debit & credit

		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);

	}

}
