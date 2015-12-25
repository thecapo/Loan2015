package org.bhi.stage6.testmodels;

import java.io.FileWriter;
import java.io.PrintWriter;
import org.bhi.stage6.models.HomeLoan;
import org.bhi.stage6.models.InvestmentLoan;
import java.util.ArrayList;
import java.util.List;
import org.bhi.stage6.models.Loan;
import java.io.*;

/**
 *
 * @author carlo nino mabalatan
 */
public class TestLoanApp {

    public static void main(String[] args) {

        List<Loan> loans = new ArrayList<>();

        InvestmentLoan john = new InvestmentLoan(56788, 0.75d, 6.05d, 100000, true);
        InvestmentLoan john2 = new InvestmentLoan(98766, 2.50d, 6.50d, 70000, false);

        HomeLoan doe = new HomeLoan(2354, 20.0d, 7.85d, 300000, 100000);
        HomeLoan doe2 = new HomeLoan(1476, 30.0d, 7.45d, 400000, 40000);
        HomeLoan doe3 = new HomeLoan(5679, 16.0d, 7.99d, 250000, 50000);

        loans.add(john);
        loans.add(john2);

        loans.add(doe);
        loans.add(doe2);
        loans.add(doe3);

        File filename = new File("D:\\loans2013.txt");
        PrintWriter output = null;
        try {
            final String DELIMITER = ":";
            output = new PrintWriter(new FileWriter(filename));

            for (Loan temploan : loans) {
                if (temploan instanceof InvestmentLoan) {
                    InvestmentLoan investmentloan = (InvestmentLoan) temploan;
                    output.println(investmentloan.getLoanID() + DELIMITER + investmentloan.getDuration() + DELIMITER + investmentloan.getRate() + DELIMITER + investmentloan.getLoanamount() + DELIMITER + investmentloan.isReinvest());
                }
                if (temploan instanceof HomeLoan) {
                    HomeLoan homeloan = (HomeLoan) temploan;
                    output.println(homeloan.getLoanID() + DELIMITER + homeloan.getDuration() + DELIMITER + homeloan.getRate() + DELIMITER + homeloan.getLoanamount() + DELIMITER + homeloan.getSecurity());
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception Found " + ex.getMessage());
        } finally {
            output.close();

        }
    }
}
