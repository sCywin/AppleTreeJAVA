package de.fh_kiel.oop;

public class Apple {
	
	/* Sebastian Cywinski, OOP Java 2.Semester
	 * 
	 * 
	 * 
	 */
	
	private Colour colour;
	private double ripeness;
	
	//Komposition + Initialwerte im Konstruktor
	public Apple() {
		this.colour = new Colour();
		ripeness = 0.0;
		this.colour.setRed(0);
		this.colour.setGreen(255);
		this.colour.setBlue(0);
	}
	
	//lässt Apfel zufällig zwischen 9% und 11% reifen
	public void mature() {
		
		ripeness += rngNumber();
		ripeness = Math.round(ripeness * 100.0) / 100.0;
		if(ripeness > 200.0) {
			ripeness = 200.0;
			goBrown();
			//System.out.println("Der Apfel ist verdorben!");
			return;
		}
		
		if(ripeness < 100.0) {
			//System.out.println("Der Apfel reift!");
			goRed();
		}else{
			//System.out.println("Der Apfel verdirbt!");
			goBrown();
			}
		
	}
	//Ändert Farbe zu einem Reifen Apfel
	private void goRed() {
		this.colour.setRed(this.colour.getRed() + 23);
		this.colour.setGreen(this.colour.getGreen() - 23);
	}
	//Ändert Farbe zu einem Faulen Apfel
	private void goBrown() {
		this.colour.setRed(this.colour.getRed() - 10);
		this.colour.setGreen(this.colour.getGreen() + 1);
		this.colour.setBlue(this.colour.getBlue() + 3);
	}

	@Override
	public String toString() {
		return "Apple [colour=" + colour + ", ripeness=" + ripeness + "]";
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public double getRipeness() {
		return ripeness;
	}

	public void setRipeness(double ripeness) {
		this.ripeness = ripeness;
	}
	//Generiert Zufallszahl zwischen 11.0 und 9.0
	private double rngNumber() {
		return (Math.random() * ((11 - 9) + 1)) + 9;
	}

}
