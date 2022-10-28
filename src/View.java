import java.awt.BorderLayout;
import javax.swing.*;

public class View extends JFrame {
    public static final String getCalculateTaxButton = null;
    private JLabel salaryLabel;
    private JLabel monthCountLabel;
    private JLabel btcProfitsLabel;
    private JLabel taxDiscountLabel;
    private JLabel salaryTotalLabel;
    private JLabel taxTotalLabel;
    private JTextField salaryTextfield;
    private JTextField monthCountTextfield;
    private JTextField btcProfitsTextfield;
    private JTextField salaryTotalTextfield;
    private JTextField taxTotalTextfield;
    private JCheckBox socialSecurity;
    private JCheckBox otherInsurance;
    private JCheckBox mutualFund;
    private JTextField socialSecurityTextfield;
    private JTextField otherInsuranceTextfield;
    private JTextField mutualFundTextfield;
    private JButton calculateTaxButton;

    public View() {
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        salaryLabel = new JLabel("Salary (Bath)");
        salaryTextfield = new JTextField();
        monthCountLabel = new JLabel("MonthCount");
        monthCountTextfield = new JTextField();
        btcProfitsLabel = new JLabel("Btc Profits (Bath)");
        btcProfitsTextfield = new JTextField();
        taxDiscountLabel = new JLabel("TaxDiscount ( Personal = 60,000 Bath )");
        socialSecurity = new JCheckBox("Social Security ( <= 5,100 Bath )");
        socialSecurityTextfield = new JTextField();
        otherInsurance = new JCheckBox("Other Insurance ( <= 100,000 Bath )");
        otherInsuranceTextfield = new JTextField();
        mutualFund = new JCheckBox("Mutual Fund ( <= 500,000 Bath )");
        mutualFundTextfield = new JTextField();
        calculateTaxButton = new JButton("Calculate");
        salaryTotalLabel = new JLabel("Salary Total (Bath)");
        salaryTotalTextfield = new JTextField();
        taxTotalLabel = new JLabel("Tax Total (Bath)");
        taxTotalTextfield = new JTextField();

        // Add UI element to frame
        GroupLayout layout = new GroupLayout(getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(salaryLabel)
                        .addComponent(monthCountLabel)
                        .addComponent(btcProfitsLabel)
                        .addComponent(taxDiscountLabel)
                        .addComponent(socialSecurity)
                        .addComponent(otherInsurance)
                        .addComponent(mutualFund)
                        .addComponent(calculateTaxButton)
                        .addComponent(salaryTotalLabel)
                        .addComponent(taxTotalLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(salaryTextfield)
                        .addComponent(monthCountTextfield)
                        .addComponent(btcProfitsTextfield)
                        .addComponent(socialSecurityTextfield)
                        .addComponent(otherInsuranceTextfield)
                        .addComponent(mutualFundTextfield)
                        .addComponent(salaryTotalTextfield)
                        .addComponent(taxTotalTextfield)));
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(salaryLabel)
                        .addComponent(salaryTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(monthCountLabel)
                        .addComponent(monthCountTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btcProfitsLabel)
                        .addComponent(btcProfitsTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(taxDiscountLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(socialSecurity)
                        .addComponent(socialSecurityTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(otherInsurance)
                        .addComponent(otherInsuranceTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(mutualFund)
                        .addComponent(mutualFundTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(calculateTaxButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(salaryTotalLabel)
                        .addComponent(salaryTotalTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(taxTotalLabel)
                        .addComponent(taxTotalTextfield)));
        layout.linkSize(SwingConstants.VERTICAL, salaryLabel, monthCountLabel, btcProfitsLabel, socialSecurity,
                otherInsurance, mutualFund, salaryTotalLabel, taxTotalLabel);
        // layout.linkSize(SwingConstants.HORIZONTAL, hello, bye);
        getContentPane().setLayout(layout);
    }

    public String getSalaryTextfield() {
        return salaryTextfield.getText();
    }

    public String getMonthCountTextfield() {
        return monthCountTextfield.getText();
    }

    public String getBtcProfitsTextfield() {
        return btcProfitsTextfield.getText();
    }

    public JButton getCalculateTaxButton() {
        return calculateTaxButton;
    }

    public JCheckBox getsocialSecurity() {
        return socialSecurity;
    }

    public String getsocialSecurityTextfield() {
        return socialSecurityTextfield.getText();
    }

    public JCheckBox getotherInsurance() {
        return otherInsurance;
    }

    public String getotherInsuranceTextfield() {
        return otherInsuranceTextfield.getText();
    }

    public JCheckBox getmutualFund() {
        return mutualFund;
    }

    public String getmutualFundTextfield() {
        return mutualFundTextfield.getText();
    }

    public void setSalaryTotalTextfield(String t) {
        salaryTotalTextfield.setText(t);
    }

    public void setTaxTotalTextfield(String t) {
        taxTotalTextfield.setText(t);
    }

    public void errorMessage() {
        JOptionPane.showMessageDialog(null, "Error! Try again.", "Error", JOptionPane.INFORMATION_MESSAGE);
    }
}
