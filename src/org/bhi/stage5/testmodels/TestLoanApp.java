package org.bhi.stage5.testmodels;

import org.bhi.stage5.models.HomeLoan;
import org.bhi.stage5.models.InvestmentLoan;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import org.bhi.stage5.models.Loan;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestLoanApp {

    public static void main(String[] args) {

        List<Loan> loans = new ArrayList<>();

        NumberFormat nfmt = NumberFormat.getCurrencyInstance(Locale.US);

        InvestmentLoan john = new InvestmentLoan(56788, 0.75d, 6.05d, 100000, true);
        InvestmentLoan john2 = new InvestmentLoan(98766, 2.50d, 6.50d, 70000, false);

        HomeLoan doe = new HomeLoan(2354, 20.0d, 7.85d, 300000, 100000);
        HomeLoan doe2 = new HomeLoan(1476, 30.0d, 7.45d, 400000, 40000);
        HomeLoan doe3 = new HomeLoan(5679, 16.0d, 7.99d, 250000, 50000);

        loans.add(john);
        loans.add(john2);

        loans.add(doe);
        loans.add(doe2);
        loans.add(doe3);

        for (Loan temploan : loans) {
            if (temploan instanceof InvestmentLoan) {
                InvestmentLoan investmentloan = (InvestmentLoan) temploan;
                System.out.println("Interest Paid per annum for Investment Loan: " + nfmt.format(investmentloan.calculateInterestOnLoan()));
            }
            if (temploan instanceof HomeLoan) {
                HomeLoan homeloan = (HomeLoan) temploan;
                System.out.println("Interest Paid per annum for Home Loan: " + nfmt.format(homeloan.calculateInterestOnLoan()));
            }
        }
    }
}
