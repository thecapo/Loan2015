package org.bhi.stage4.testmodels;

import org.bhi.stage4.models.HomeLoan;
import org.bhi.stage4.models.InvestmentLoan;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestLoanApp {

    public static void main(String[] args) {

        List<InvestmentLoan> invests = new ArrayList<>();
        List<HomeLoan> homes = new ArrayList<>();

        NumberFormat nfmt = NumberFormat.getCurrencyInstance(Locale.US);

        InvestmentLoan john = new InvestmentLoan(56788, 0.75d, 6.05d, 100000, true);
        InvestmentLoan john2 = new InvestmentLoan(98766, 2.50d, 6.50d, 70000, false);

        HomeLoan doe = new HomeLoan(2354, 20.0d, 7.85d, 300000, 100000);
        HomeLoan doe2 = new HomeLoan(1476, 30.0d, 7.45d, 400000, 40000);
        HomeLoan doe3 = new HomeLoan(5679, 16.0d, 7.99d, 250000, 50000);

        invests.add(john);
        invests.add(john2);

        homes.add(doe);
        homes.add(doe2);
        homes.add(doe3);

        System.out.println("Investment Loans");
        System.out.println("----------------");
        for (InvestmentLoan tempinvest : invests) {

            System.out.println("Investment Loan ID : " + tempinvest.getLoanID());
            System.out.println("Investment Loan Duration(Yrs.) : " + tempinvest.getDuration());
            System.out.println("Investment Loan Rate(%) : " + tempinvest.getRate());
            System.out.println("Investment Loan Amount : " + nfmt.format(tempinvest.getLoanamount()));
            System.out.println("Investment Loan Reinvest Option : " + tempinvest.isReinvest());
            System.out.println("Investment Loan Interest : " + nfmt.format(tempinvest.calculateInterestOnLoan()));

            System.out.println("");
        }
        System.out.println("Home Loans");
        System.out.println("----------------");
        for (HomeLoan temphome : homes) {

            System.out.println("Home Loan ID : " + temphome.getLoanID());
            System.out.println("Home Loan Duration(Yrs.) : " + temphome.getDuration());
            System.out.println("Home Loan Rate(%) : " + temphome.getRate());
            System.out.println("Home Loan Amount : " + nfmt.format(temphome.getLoanamount()));
            System.out.println("Home Loan Security : " + nfmt.format(temphome.getSecurity()));
            System.out.println("Home Loan Interest : " + nfmt.format(temphome.calculateInterestOnLoan()));

            System.out.println("");
        }
    }
}
