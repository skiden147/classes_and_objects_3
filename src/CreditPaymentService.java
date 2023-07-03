public class CreditPaymentService {

    public double calculate(double creditAmount, double annualInterestRate, double landingPeriod) {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        double a = (1 + monthlyInterestRate);
        double a1 = Math.pow(a, landingPeriod);
        double b = monthlyInterestRate * a1;
        double b1 = a1 - 1;
        double monthlyLoanPayment = creditAmount * (b / b1);
        return (int) monthlyLoanPayment;
    }

}
