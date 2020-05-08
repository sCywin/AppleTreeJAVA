package de.fh_kiel.oop;

public class Colour {
	
	/* Sebastian Cywinski, OOP Java 2.Semester
	 * 
	 * 
	 * 
	 */
	
	private int red, green, blue;
	
	//Default Konstruktor
	public Colour() {
		
	}
	
	//Konstruktor der die 3 Farbwerte bekommt und setzt
	public Colour(int red, int green, int blue) {
		if(red >= 0 && red <= 255) {
			this.red = red;			
		}
		if(green >= 0 && green <= 255) {
			this.green = green;			
		}
		if(blue >= 0 && blue <= 255) {
			this.blue = blue;			
		}
	}
	public Colour(Colour colour) {
		if(red >= 0 && red <= 255) {
			this.red = colour.red;			
		}
		if(green >= 0 && green <= 255) {
			this.green = colour.green;			
		}
		if(blue >= 0 && blue <= 255) {
			this.blue = colour.blue;			
		}
	}

	@Override
	public boolean equals(Object obj) {
		Colour other = (Colour) obj;
		if (blue != other.blue)
			return false;
		if (green != other.green)
			return false;
		if (red != other.red)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Colour [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		if(red >= 0 && red <= 255) {
			this.red = red;			
		}
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		if(green >= 0 && green <= 255) {
			this.green = green;			
		}
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		if(blue >= 0 && blue <= 255) {
			this.blue = blue;			
		}
	}

}
