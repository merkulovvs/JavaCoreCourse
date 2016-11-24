package module4.assignment_4_1;

import module4.assignment_4_2.Currency;


/**
 * Created by merkulovvs on 11/22/2016.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees,
                  double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int withdrawalLimit;
        switch (currency){
            case USD:
                withdrawalLimit = 1000;
            break;
            case EUR:
                withdrawalLimit = 1200;
            break;
            default:
                return 0;
        }
        return withdrawalLimit;
    }

    @Override
    int getLimitOfFunding() {
        int fundingLimit;
        switch (currency){
            case USD:
                fundingLimit = Integer.MAX_VALUE;
            break;
            case EUR:
                fundingLimit = 10000;
            break;
            default:
                return 0;
        }
        return fundingLimit;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate;
        switch (currency) {
            case USD:
                monthlyRate = 1;
            break;
            case EUR:
                monthlyRate = 2;
            break;
            default:
                return 0;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int sum) {
        int commission;
        switch (currency) {
            case USD:
                if(sum<=1000)
                    commission = 5;
                else
                    commission = 7;
            break;
            case EUR:
                if(sum<=1000)
                    commission = 6;
                else
                    commission = 8;
            break;
            default:
                return 0;
        }
        return commission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return super.moneyPaidMonthlyForSalary();
    }
}
