import javax.swing.JOptionPane;
public class Controller {

    private View v;
    private Model m;
    
    public Controller(View v, Model m) {
        this.v = v;
        this.m = m;
        
        //call Action of button click
        initController();    
    }

    public void initController() {
       v.getCalculateTaxButton().addActionListener(e -> actionOfButton());
    }

    private void actionOfButton(){
        try {
            double salary = Double.parseDouble(v.getSalaryTextfield());
            int monthCount = Integer.parseInt(v.getMonthCountTextfield());
            double btcProfits = Double.parseDouble(v.getBtcProfitsTextfield());

            if(m.checkSalaryAndMonth(salary, monthCount)){
                m.setSalary(salary);
                m.setMonthCount(monthCount); 
                m.setBtcProfits(btcProfits);

                // check select in JCheckBox
                if(v.getsocialSecurity().isSelected()){
                    double socialSecurity = Double.parseDouble(v.getsocialSecurityTextfield());
                    m.setSocialSecurity(socialSecurity);
                    System.out.println("ss -> " + socialSecurity);
                }
                if(v.getotherInsurance().isSelected()){
                    double insurance = Double.parseDouble(v.getotherInsuranceTextfield());
                    m.setOtherInsurance(insurance);
                    System.out.println("ins -> " + insurance);
                }
                if(v.getmutualFund().isSelected()){
                    double fund = Double.parseDouble(v.getmutualFundTextfield());
                    m.setMutualFund(fund);
                    System.out.println("fund -> " + fund);
                }
                m.calIncome();
                m.calTaxPay();
                double income = m.getIncome();
                double tax = m.getTax();

                // set label in front end
                v.setSalaryTotalTextfield(String.format("%.2f", income));
                v.setTaxTotalTextfield(String.format("%.2f", tax));
                
                System.out.println("income -> " + income);
            }            
            else{
                // error case
				v.errorMessage();
			}

            System.out.println(salary + "\n" + monthCount + "\n" + btcProfits);
        } catch (Exception e) {
            //TODO: handle exception 

            // error case
            System.out.println(e + "Connection error");
            v.errorMessage();
        }
    }

}
