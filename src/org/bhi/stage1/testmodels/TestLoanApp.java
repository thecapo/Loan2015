package org.bhi.stage1.testmodels;

import org.bhi.stage1.models.HomeLoan;
import org.bhi.stage1.models.InvestmentLoan;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestLoanApp {

    public static void main(String[] args) {
        InvestmentLoan john = new InvestmentLoan(56788, 0.75d, 6.05d, 100000, true);
        InvestmentLoan john2 = new InvestmentLoan(98766, 2.50d, 6.50d, 70000, false);

        HomeLoan doe = new HomeLoan(2354, 20.0d, 7.85d, 300000, 100000);
        HomeLoan doe2 = new HomeLoan(1476, 30.0d, 7.45d, 400000, 40000);
        HomeLoan doe3 = new HomeLoan(5679, 16.0d, 7.99d, 250000, 50000);

        System.out.println("Investment Loans");
        System.out.println("----------------");
        System.out.println("Investment Loan ID : " + john.getLoanID());
        System.out.println("Investment Loan Duration(Yrs.) : " + john.getDuration());
        System.out.println("Investment Loan Rate(%) : " + john.getRate());
        System.out.println("Investment Loan Amount : " + john.getLoanamount());
        System.out.println("Investment Loan Reinvest Option : " + john.isReinvest());

        System.out.println("");
        System.out.println("Investment Loan ID : " + john2.getLoanID());
        System.out.println("Investment Loan Duration(Yrs.) : " + john2.getDuration());
        System.out.println("Investment Loan Rate(%) : " + john2.getRate());
        System.out.println("Investment Loan Amount : " + john2.getLoanamount());
        System.out.println("Investment Loan Reinvest Option : " + john2.isReinvest());

        System.out.println("");

        System.out.println("Home Loans");
        System.out.println("----------------");
        System.out.println("Home Loan ID : " + doe.getLoanID());
        System.out.println("Home Loan Duration(Yrs.) : " + doe.getDuration());
        System.out.println("Home Loan Rate(%) : " + doe.getRate());
        System.out.println("Home Loan Amount : " + doe.getLoanamount());
        System.out.println("Home Loan Security : " + doe.getSecurity());

        System.out.println("");
        System.out.println("Home Loan ID : " + doe2.getLoanID());
        System.out.println("Home Loan Duration(Yrs.) : " + doe2.getDuration());
        System.out.println("Home Loan Rate(%) : " + doe2.getRate());
        System.out.println("Home Loan Amount : " + doe2.getLoanamount());
        System.out.println("Home Loan Security : " + doe2.getSecurity());

        System.out.println("");
        System.out.println("Home Loan ID : " + doe3.getLoanID());
        System.out.println("Home Loan Duration(Yrs.) : " + doe3.getDuration());
        System.out.println("Home Loan Rate(%) : " + doe3.getRate());
        System.out.println("Home Loan Amount : " + doe3.getLoanamount());
        System.out.println("Home Loan Security : " + doe3.getSecurity());
    }

}
