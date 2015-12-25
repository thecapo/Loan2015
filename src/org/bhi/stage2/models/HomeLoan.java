package org.bhi.stage2.models;

/**
 *
 * @author carlo nino mabalatan
 */
public class HomeLoan extends Loan {

    private double security;

    public HomeLoan(int loanID, double duration, double rate, double loanamount, double security) {
        super(loanID, duration, rate, loanamount);
        this.security = security;
    }

    public double getSecurity() {
        return security;
    }

    public void setSecurity(double security) {
        this.security = security;
    }

    @Override
    public String toString() {
        return "HomeLoan{" + "security=" + security + '}';
    }

}
