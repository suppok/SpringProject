package sample.spring;

/**
 * Created by Supanat Pokturng on 4/10/2017 AD.
 */
public interface BankAccountDao {
    int createBankAccount(BankAccountDetails bankAccountDetails);
    void subtractFromAccount(int bankAccountId, int amount);
}