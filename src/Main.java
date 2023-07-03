public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditAmount = 1_000_000;
        double annualInterestRate = 9.99;
        double landingPeriod = 12;
        double monthlyLoanPayment = service.calculate(creditAmount, annualInterestRate, landingPeriod);
        System.out.println("Ежемесячный платёж по кредиту составляет:" + monthlyLoanPayment);
    }
}
