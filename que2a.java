package shahid;
// Loan.java
abstract class Loan {
    private double loanAmount;
    private double interestRate;

    public Loan(double loanAmount, double interestRate) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public abstract double calculateInterest();

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

// LoanApproval.java
interface LoanApproval {
    String getApprovalStatus();
}

// PersonalLoan.java
class PersonalLoan extends Loan implements LoanApproval {
    public PersonalLoan(double loanAmount) {
        super(loanAmount, 0.15); // 15% interest rate for personal loan
    }

    @Override
    public double calculateInterest() {
        return getLoanAmount() * getInterestRate();
    }

    @Override
    public String getApprovalStatus() {
        if (getLoanAmount() <= 50000) {
            return "Loan Approved";
        } else {
            return "Loan Rejected";
        }
    }
}

public class que2a {
    public static void main(String[] args) {
        Loan personalLoan = new PersonalLoan(50000);

        System.out.println("Loan Amount: $" + personalLoan.getLoanAmount());
        System.out.println("Interest Rate: " + personalLoan.getInterestRate() * 100 + "%");
        System.out.println("Interest Amount: $" + personalLoan.calculateInterest());

        if (personalLoan instanceof LoanApproval) {
            LoanApproval approval = (LoanApproval) personalLoan;
            String approvalStatus = approval.getApprovalStatus();
            System.out.println("Approval Status: " + approvalStatus);
        }
    }
}
