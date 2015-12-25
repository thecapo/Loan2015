package org.bhi.stage8.testmodels;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import org.bhi.stage8.controllers.LoanController;
import org.bhi.stage8.models.HomeLoan;
import org.bhi.stage8.models.InvestmentLoan;
import org.bhi.stage8.models.Loan;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestLoanApp {

    public static void main(String[] args) {
        LoanController lc = new LoanController();

        NumberFormat nfmt = NumberFormat.getCurrencyInstance(Locale.US);

        lc.addInvestmentLoan(56788, 0.75, 6.05, 100000, true);
        lc.addInvestmentLoan(98766, 2.5, 6.5, 70000, false);
        lc.addHomeLoan(2345, 20.0, 7.85, 300000, 100000);
        lc.addHomeLoan(1476, 30.0, 7.45, 400000, 40000);
        lc.addHomeLoan(5679, 16.0, 7.99, 250000, 50000);

        List<Loan> loans = lc.getLoans();

        for (Loan temploan : loans) {
            if (temploan instanceof InvestmentLoan) {
                InvestmentLoan investmentloan = (InvestmentLoan) temploan;

                System.out.println("Investment Loan ID : " + investmentloan.getLoanID() + "\nInvestment Loan Duration(Yrs) : " + investmentloan.getDuration() + "\nInvestment Loan Rate(%) : " + investmentloan.getRate() + "\nInvestment Loan Amount : " + (nfmt.format(investmentloan.getLoanamount())) + "\nInvestment Loan Reinvestment Option : " + investmentloan.isReinvest() + "\nInvestment Loan Interest : " + (nfmt.format(investmentloan.calculateInterestOnLoan())));
                System.out.println("");
            }

            if (temploan instanceof HomeLoan) {
                HomeLoan homeloan = (HomeLoan) temploan;

                System.out.println("Home Loan ID : " + homeloan.getLoanID() + "\nHome Loan Duration(Yrs) : " + homeloan.getDuration() + "\nHome Loan Rate(%) : " + homeloan.getRate() + "\nHome Loan Amount : " + (nfmt.format(homeloan.getLoanamount())) + "\nHome Loan Security : " + homeloan.getSecurity() + "\nHome Loan Interest : " + (nfmt.format(homeloan.calculateInterestOnLoan())));
                System.out.println("");
            }
        }

    }
}
