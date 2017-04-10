package sample.spring;

/**
 * Created by Supanat Pokturng on 4/10/2017 AD.
 */
import java.util.Date;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBankApp {

    public static void main(String args[]) throws Exception {
        BasicConfigurator.configure(); //config the logger
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:META-INF/spring/applicationContext.xml");
        BankAccountService bankAccountService = context
                .getBean("bankAccountService", BankAccountService.class);
        BankAccountDetails bankAccountDetails = new BankAccountDetails();
        bankAccountDetails.setBalanceAmount(1000);
        bankAccountDetails.setLastTransactionTimestamp(new Date());

        bankAccountService.createBankAccount(bankAccountDetails);
    }
}