import java.text.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caleb
 */
public class BankCharges {
    
    public static void main(String[] args) {
		
		double baseFee = 10;
		
		
		String input1 = JOptionPane.showInputDialog("Enter the number of checks written");
		
		
		int checks = Integer.parseInt(input1);
		

		double Twenty = .10*checks;
		double Overtwenty = .08*checks;
		double Overforty = .06*checks;
		double Oversixty = .04*checks;
		
		
		double TwentyTotal = .10*checks + baseFee;
		double OvertwentyTotal = .08*checks + baseFee;
		double OverfortyTotal = .06*checks + baseFee;
		double OversixtyTotal = .04*checks + baseFee;
		
		
	    NumberFormat df = DecimalFormat.getInstance();
	    df.setMaximumFractionDigits(2);
		 
		
		if (checks < 60)
			if (checks >= 40)
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(Overforty) + "\nTotal Fees: $" + OverfortyTotal);
			else if(checks >= 20)
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(Overtwenty) + "\nTotal Fees: $" + OvertwentyTotal);
			else
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(Twenty) + "\nTotal Fees: $" + TwentyTotal);
		else
			JOptionPane.showMessageDialog(null, "Check (QTY): " + checks + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(Oversixty) + "\nTotal Fees: $ " + OversixtyTotal);
	}

}
