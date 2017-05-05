package com.bank;

import com.bank.repo.AccountRepository;
import com.bank.repo.JdbcAccountRepository;
import com.bank.service.NEFTTxrService;
import com.bank.service.TxrService;

public class App {

	public static void main(String[] args) {

		//------------------------------------
		// Init

		AccountRepository jdbcAccountRepo = new JdbcAccountRepository();

		//---------------------------------
		
		TxrService txrService = new NEFTTxrService(jdbcAccountRepo);
		txrService.doTxr(1000, "1", "2");

	}

}
