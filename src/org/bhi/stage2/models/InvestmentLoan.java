package org.bhi.stage2.models;

/**
 *
 * @author carlo nino mabalatan
 */
public class InvestmentLoan extends Loan {

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

}
