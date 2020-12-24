package findsanta;

public class SantaFinder {

	public static void main(String[] args) {
		
		SantaSuspects santaSuspects = new SantaSuspects(20);
		
		santaSuspects.addSuspect("bob@bezanga.com");
		santaSuspects.addSuspect("sally@zimmers.com");
		santaSuspects.addSuspect("peter@pinkelton.com");
		santaSuspects.addSuspect("bobby.drop@tables.com");
		santaSuspects.addSuspect("rudolph@rednose.com");
		santaSuspects.addSuspect("bob@ross.com");
		santaSuspects.addSuspect("ubiga@altman.com");
		santaSuspects.addSuspect("tony@ross.com");
		santaSuspects.addSuspect("aaron@rogers.com");
		santaSuspects.addSuspect("yolo@once.com");
		santaSuspects.addSuspect("yoka@yamalla.com");
		santaSuspects.addSuspect("big@show.com");
		santaSuspects.addSuspect("boug@dimmadome.com");
		
		santaSuspects.printSuspects();

	}

}
