package org.bhi.stage3.models;

import org.bhi.stage3.interfaces.InterestCalculator;

/**
 *
 * @author carlo nino mabalatan
 */
public class InvestmentLoan extends Loan implements InterestCalculator {

    private boolean reinvest;

    public InvestmentLoan(int loanID, double duration, double rate, double loanamount, boolean reinvest) {
        super(loanID, duration, rate, loanamount);
        this.reinvest = reinvest;
    }

    public boolean isReinvest() {
        return reinvest;
    }

    public void setReinvest(boolean reinvest) {
        this.reinvest = reinvest;
    }

    @Override
    public String toString() {
        return "InvestmentLoan{" + "reinvest=" + reinvest + '}';
    }

    @Override
    public float calculateInterestOnLoan() {

        float interest = (float) ((this.getRate() / 100) * (this.getLoanamount() * this.getDuration()));

        return interest;

    }

}
