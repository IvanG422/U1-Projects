import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Sales {
    public static void main(String[] args) {

        DecimalFormat round = new DecimalFormat("#,###.00");

        int quantity, discount, salesTax;
        double price, taxTotal, subtotal, totalCost, discountedPrice;

        price = Double.parseDouble(JOptionPane.showInputDialog("What is the sale price?"));
        discount = Integer.parseInt(JOptionPane.showInputDialog("What is the discount?"));
        quantity = Integer.parseInt(JOptionPane.showInputDialog("How many are you buying?"));
        salesTax = Integer.parseInt(JOptionPane.showInputDialog("what is the sales tax?"));
        
        subtotal = quantity * price;
        taxTotal = salesTax/100;
        totalCost = subtotal + taxTotal;
        discountedPrice = price - (price * discount / 100);


    }

}
    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */