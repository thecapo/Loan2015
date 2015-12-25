package org.bhi.stage1.models;

/**
 *
 * @author carlo nino mabalatan
 */
public class HomeLoan {

    private int loanID;
    private double duration;
    private double rate;
    private double loanamount;
    private double security;

    public HomeLoan(int loanID, double duration, double rate, double loanamount, double security) {
        this.loanID = loanID;
        this.duration = duration;
        this.rate = rate;
        this.loanamount = loanamount;
        this.security = security;
    }

    public HomeLoan() {
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

    public double getSecurity() {
        return security;
    }

    public void setSecurity(double security) {
        this.security = security;
    }

    @Override
    public String toString() {
        return "HomeLoan{" + "loanID=" + loanID + ", duration=" + duration + ", rate=" + rate + ", loanamount=" + loanamount + ", security=" + security + '}';
    }

     
}
