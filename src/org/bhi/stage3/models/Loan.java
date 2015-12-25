package org.bhi.stage3.models;

/**
 *
 * @author carlo nino mabalatan
 */
public abstract class Loan {

    private int loanID;
    private double duration;
    private double rate;
    private double loanamount;

    public Loan(int loanID, double duration, double rate, double loanamount) {
        this.loanID = loanID;
        this.duration = duration;
        this.rate = rate;
        this.loanamount = loanamount;
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

    @Override
    public String toString() {
        return "Loan{" + "loanID=" + loanID + ", duration=" + duration + ", rate=" + rate + ", loanamount=" + loanamount + '}';
    }

}
