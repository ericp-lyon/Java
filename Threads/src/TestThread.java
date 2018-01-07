public class TestThread implements Runnable {

	MonCompteur TC;
	private String name;

	// ajouter aussi un constructeur ave 2 paremeters
	
	public TestThread(MonCompteur tC, String name) {
		super();
		TC = tC;
		this.name = name;
	}
	
	
	public void run() {
		try {
			for (int i = 0; i < 3; i++) {

				
				if (TC.getCompteur() > 0) {

					Thread.sleep(500);
					TC.decrementerCompteur();
					
					System.out.println("operation reussie " + TC.getCompteur() + " demandee par " + this.name);
					
				} else
					
					System.out.println("Echec " + TC.getCompteur() + "demandee par " + this.name);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	
}
