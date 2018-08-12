package nz.ac.vuw.hayley.unitconverter;
import ecs100.*;
/* This program is designed to calculate unit
 * conversions from inches to centimetres. */

public class UnitConverter {
	//constructor: set up interface
	public UnitConverter() {
		UI.initialise();
		UI.addButton("Inches to cm", this :: inchToCm);
		UI.addButton("Cm to inches", this :: cmToInches);
		UI.addButton("Formula", this :: printFormula);
	}
	//inches to Cm function
	public void inchToCm() {
		double inch = UI.askDouble("Inches: ");
		double cm = inch * 2.54;
		UI.println(inch + "\" is " + cm + " cm");
	}
	//cm to inches function
	public void cmToInches() {
		double cm = UI.askDouble("Centimetres: ");
		double inch = cm / 2.54;
		UI.println(cm + "cm is " + inch + " inches");
	}
	//print conversion function
	public void printFormula() {
		UI.println("Centimetres = 1 inch * 2.54");
		UI.println("Inches = 1cm / 2.54");
	}
	public static void main(String[] args) {
		new UnitConverter();
	}
}
