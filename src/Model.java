public class Model {

    private double salary = 0;
    private int monthCount = 0;
    private double btcProfits = 0;
    private double socialSecurity = 0;
    private double otherInsurance = 0;
    private double mutualFund = 0;
    private double income = 0;
    private double tax = 0;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    public double getBtcProfits() {
        return btcProfits;
    }

    public void setBtcProfits(double btcProfits) {
        this.btcProfits = btcProfits;
    }

    public double getIncome() {
        return income;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(double socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public double getOtherInsurance() {
        return otherInsurance;
    }

    public void setOtherInsurance(double otherInsurance) {
        this.otherInsurance = otherInsurance;
    }

    public double getMutualFund() {
        return mutualFund;
    }

    public void setMutualFund(double mutualFund) {
        this.mutualFund = mutualFund;
    }

    public double getTax() {
        return tax;
    }

    // check conditions of salary and num of month
    public boolean checkSalaryAndMonth(double salary, int monthCount) {
        if (salary > 0 && monthCount > 0 && monthCount < 13)
            return true;
        else
            return false;

    }

    // calculate income of natural person
    public void calIncome() {
        income = (salary * monthCount) / 2 + btcProfits - 60000 - socialSecurity - otherInsurance - mutualFund;
    }

    // calculate tax of natural person
    public void calTaxPay() {
        if (income > 0 && income <= 150000)
            tax = 0;
        else if (income > 150000 && income <= 300000)
            tax = (income - 150000) * 0.05;
        else if (income > 300000 && income <= 500000)
            tax = ((income - 300000) * 0.1) + 7500;
        else if (income > 500000 && income <= 750000)
            tax = ((income - 500000) * 0.15) + 27500;
        else if (income > 750000 && income <= 1000000)
            tax = ((income - 750000) * 0.2) + 65000;
        else if (income > 1000000 && income <= 2000000)
            tax = ((income - 1000000) * 0.25) + 115000;
        else if (income > 2000000 && income <= 5000000)
            tax = ((income - 2000000) * 0.30) + 365000;
        else if (income > 5000000)
            tax = ((income - 5000000) * 0.35) + 1265000;
    }

}
