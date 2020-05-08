package de.fh_kiel.oop;

public class TestClass {
	
	public static void main(String[] args) {
		
		//Erzeugt 3 Appletrees
		Appletree apltre1 = new Appletree();
		Appletree apltre2 = new Appletree();
		Appletree apltre3 = new Appletree();
		
		//Apples werden zuerst etwas reifer
		for(int i = 0; i < 15; i++) {
			apltre1.growApples();
			apltre2.growApples();
			apltre3.growApples();
		}
		//Counter
		int pickedApple = 0;
		int droppedApple = 0;
		//Alle 7 Tage, jeden Sonntag
		for(int i = 7; i < 200; i*=2) {
			//In den 200 Tagen wachsen ja auch neue Aepfel nach!
			apltre1.growApples();
			apltre2.growApples();
			apltre3.growApples();
			//Pfluecken der Aepfel von allen 3 Apfelbaeumen
			for(int j = 0; j < apltre1.getApples().length; j++) {
					pickedApple += apltre1.pluckApples();
					pickedApple += apltre2.pluckApples();
					pickedApple += apltre3.pluckApples();
			}
			//Der Besitzer mag den mittleren Baum ganz und gar nicht
			droppedApple += apltre2.shake();
			
		}
		System.out.println("Insgesamt gepflueckte Aepfel: " +pickedApple);
		System.out.println("Insgesamt zum Abzaehlreim zertreten:" +droppedApple);
	}

}
