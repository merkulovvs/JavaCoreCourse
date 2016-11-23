package module4.assignment_4_1;

import java.util.Currency;

/**
 * Created by merkulovvs on 11/22/2016.
 */
public class EUBank extends Bank{
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    int getLimitOfFunding() {
        return 0;
    }

    @Override
    int getMonthlyRate() {
        return 0;
    }

    @Override
    int getCommission(int sum) {
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return super.moneyPaidMonthlyForSalary();
    }
}
