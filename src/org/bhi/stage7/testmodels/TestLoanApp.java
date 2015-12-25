package org.bhi.stage7.testmodels;

import org.bhi.stage7.models.HomeLoan;
import org.bhi.stage7.models.InvestmentLoan;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import org.bhi.stage7.models.Loan;
import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestLoanApp {

    public static void main(String[] args) {
        NumberFormat nfmt = NumberFormat.getCurrencyInstance(Locale.US);
        final String DELIMITER = ":";

        File consults = new File("D:\\loans2013.txt");

        List<Loan> loans = new ArrayList<>();
        List<InvestmentLoan> invests = new ArrayList<>();
        List<HomeLoan> homes = new ArrayList<>();
        InvestmentLoan john = new InvestmentLoan(56788, 0.75d, 6.05d, 100000, true);
        InvestmentLoan john2 = new InvestmentLoan(98766, 2.50d, 6.50d, 70000, false);

        HomeLoan doe = new HomeLoan(2354, 20.0d, 7.85d, 300000, 100000);
        HomeLoan doe2 = new HomeLoan(1476, 30.0d, 7.45d, 400000, 40000);
        HomeLoan doe3 = new HomeLoan(5679, 16.0d, 7.99d, 250000, 50000);

        invests.add(john);
        invests.add(john2);

        homes.add(doe);
        homes.add(doe2);
        homes.add(doe3);

        try {
            BufferedReader in = new BufferedReader(new FileReader(consults));
            String line = in.readLine();

            while (line != null) {
                StringTokenizer token1 = new StringTokenizer(line, DELIMITER);

                StringTokenizer token2 = new StringTokenizer(line, DELIMITER);

                int loanid = Integer.parseInt(token1.nextToken());
                double duration = Double.parseDouble(token1.nextToken());
                double rate = Double.parseDouble(token1.nextToken());
                double amount = Double.parseDouble(token1.nextToken());
                boolean reinvest = Boolean.parseBoolean(token1.nextToken());
                double security = Double.parseDouble(token2.nextToken());

                loans.add(new InvestmentLoan(loanid, duration, rate, amount, reinvest));
                //line = in.readLine();
                loans.add(new HomeLoan(loanid, duration, rate, amount, security));
                line = in.readLine();

            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Investment Loans");
        System.out.println("------------------------");
        System.out.println(" ");
        for (InvestmentLoan tempinvest : invests) {

            System.out.println("Investment Loan ID : " + tempinvest.getLoanID() + "\nInvestment Loan Duration(Yrs) : " + tempinvest.getDuration() + "\nInvestment Loan Rate(%) : " + tempinvest.getRate() + "\nInvestment Loan Amount : " + (nfmt.format(tempinvest.getLoanamount())) + "\nInvestment Loan Reinvestment Option : " + tempinvest.isReinvest() + "\nInvestment Loan Interest : " + (nfmt.format(tempinvest.calculateInterestOnLoan())));
            System.out.println("");

        }
        System.out.println(" ");
        System.out.println("Home Loan");
        System.out.println("------------------------");
        System.out.println(" ");

        for (HomeLoan temphome : homes) {

            System.out.println("Home Loan ID : " + temphome.getLoanID() + "\nHome Loan Duration(Yrs) : " + temphome.getDuration() + "\nHome Loan Rate(%) : " + temphome.getRate() + "\nHome Loan Amount : " + (nfmt.format(temphome.getLoanamount())) + "\nHome Loan Security : " + temphome.getSecurity() + "\nHome Loan Interest : " + (nfmt.format(temphome.calculateInterestOnLoan())));
            System.out.println("");

        }
    }

}
