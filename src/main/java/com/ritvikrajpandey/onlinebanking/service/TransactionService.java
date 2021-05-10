package com.ritvikrajpandey.onlinebanking.service;

import java.security.Principal;
import java.util.List;

import com.ritvikrajpandey.onlinebanking.entity.PrimaryAccount;
import com.ritvikrajpandey.onlinebanking.entity.PrimaryTransaction;
import com.ritvikrajpandey.onlinebanking.entity.Recipient;
import com.ritvikrajpandey.onlinebanking.entity.SavingsAccount;
import com.ritvikrajpandey.onlinebanking.entity.SavingsTransaction;

/**
 * Created by IntelliJ IDEA.
 * Project : online-banking
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/08/18
 * Time: 04.34
 * To change this template use File | Settings | File Templates.
 */
public interface TransactionService {

    List<PrimaryTransaction> findPrimaryTransactionList(String username);

    List<SavingsTransaction> findSavingsTransactionList(String username);

    void savePrimaryDepositTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsDepositTransaction(SavingsTransaction savingsTransaction);

    void savePrimaryWithdrawTransaction(PrimaryTransaction primaryTransaction);

    void saveSavingsWithdrawTransaction(SavingsTransaction savingsTransaction);

    void betweenAccountsTransfer(String transferFrom, String transferTo, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount) throws Exception;

    List<Recipient> findRecipientList(Principal principal);

    Recipient saveRecipient(Recipient recipient);

    Recipient findRecipientByName(String recipientName);

    void deleteRecipientByName(String recipientName);

    void toSomeoneElseTransfer(Recipient recipient, String accountType, String amount, PrimaryAccount primaryAccount, SavingsAccount savingsAccount);
}