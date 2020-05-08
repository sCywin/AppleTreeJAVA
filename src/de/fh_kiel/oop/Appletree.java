/*
 * Sebastian Cywinski, OOP Java 2.Semester
 * Fuer Test siehe/kompiliere TestClass.java
 * 
 */

package de.fh_kiel.oop;

import java.util.Arrays;

public class Appletree {
	
	private Apple[] apples;
	
	public Appletree() {
		this.apples = new Apple[100];
		for(int i = 0; i < this.apples.length; i++) {
			if(Math.random() < 0.5) {
				this.apples[i] = new Apple();
			}
		}
	}
	
	public void growApples() {
		for(int i = 0; i < this.apples.length; i++) {
			if(this.apples[i] != null) {
				this.apples[i].mature();
			}else if(Math.random() < 0.1){
				this.apples[i] = new Apple();
			}
		}
	}
	
	public int pluckApples() {
		int counter = 0;
		for(int i = 0; i < this.apples.length; i++) {
			if(this.apples[i] != null && this.apples[i].getRipeness() >= 100.0) {
				this.apples[i] = null;
				counter++;
			}
		}
		return counter;
	}
	
	public int shake() {
		int counter = 0;
		for(int i = 0; i < this.apples.length; i++) {
			if(Math.random() < 0.2) {
				this.apples[i] = null;
				counter++;
			}
		}
		return counter;
	}

	@Override
	public String toString() {
		return "Appletree [apples=" + Arrays.toString(apples) + "]";
	}

	public Apple[] getApples() {
		return apples;
	}

	public void setApples(Apple[] apples) {
		this.apples = apples;
	}
	

}
