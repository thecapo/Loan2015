package org.bhi.stage8.controllers;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import org.bhi.stage8.models.HomeLoan;
import org.bhi.stage8.models.InvestmentLoan;
import org.bhi.stage8.models.Loan;

/**
 *
 * @author carlo nino mabalatan
 */
public class LoanController {

    private List<Loan> loans = null;

    public LoanController() {
        loans = new ArrayList<>();
    }

    public void addInvestmentLoan(int loanID, double duration, double rate, double loanamount, boolean reinvest) {
        InvestmentLoan invests = (new InvestmentLoan(loanID, duration, rate, loanamount, reinvest));
        loans.add(invests);
    }

    public void addHomeLoan(int loanID, double duration, double rate, double loanamount, double security) {
        HomeLoan homes = (new HomeLoan(loanID, duration, rate, loanamount, security));
        loans.add(homes);
    }

    public void writeLoansToFile(File file) {

    }

    public void readLoansDataFile(File file) {

    }

    public List<InvestmentLoan> getAllInvestmentLoans() {

        List<InvestmentLoan> invests = new ArrayList<>();
        return invests;
    }

    public List<HomeLoan> getAllHomeLoans() {

        List<HomeLoan> homes = new ArrayList<>();
        return homes;
    }

    public List<Loan> getLoans() {
        return loans;
    }
}
