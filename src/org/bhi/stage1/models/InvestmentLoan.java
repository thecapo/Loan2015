package org.bhi.stage1.models;

/**
 *
 * @author carlo nino mabalatan
 */
public class InvestmentLoan {

    private int loanID;
    private double duration;
    private double rate;
    private double loanamount;
    private boolean reinvest;

    public InvestmentLoan(int loanID, double duration, double rate, double loanamount, boolean reinvest) {
        this.loanID = loanID;
        this.duration = duration;
        this.rate = rate;
        this.loanamount = loanamount;
        this.reinvest = reinvest;
    }

    public InvestmentLoan() {
    }

    public int getLoanID() {
        return loanID;
    }

    public void setLoanID(int loanID) {
        this.loanID = loanID;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(double loanamount) {
        this.loanamount = loanamount;
    }

    public boolean isReinvest() {
        return reinvest;
    }

    public void setReinvest(boolean reinvest) {
        this.reinvest = reinvest;
    }

    @Override
    public String toString() {
        return "InvestmentLoan{" + "loanID=" + loanID + ", duration=" + duration + ", rate=" + rate + ", loanamount=" + loanamount + ", reinvest=" + reinvest + '}';
    }

}
