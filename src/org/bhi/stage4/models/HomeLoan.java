package org.bhi.stage4.models;

import org.bhi.stage4.interfaces.InterestCalculator;

/**
 *
 * @author carlo nino mabalatan
 */
public class HomeLoan extends Loan implements InterestCalculator {

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

    @Override
    public float calculateInterestOnLoan() {
        float home;

        float interest = (float) ((this.getRate() / 100) * (this.getLoanamount() * this.getDuration()));

        float output = (float) (this.getLoanamount() - this.getSecurity());

        if (output <= 100000) {

            home = (interest + 300);

        } else if (output >= 100001 && output <= 300000) {

            home = (interest + 350);

        } else if (output >= 300001 && output <= 500000) {

            home = (interest + 400);

        } else {

            home = (interest + 450);

        }
        return home;
    }

}
