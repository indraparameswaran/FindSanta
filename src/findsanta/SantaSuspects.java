package findsanta;

public class SantaSuspects {
  String[] suspects;
  
  int nextindex = 0;
  
  public SantaSuspects(int size) {
	  this.suspects = new String [size];
  }
  
  public void addSuspect(String suspect) {
	  this.suspects[this.nextindex] =suspect;
	  this.nextindex++;
	  if (this.nextindex >= this.suspects.length) {
		  this.nextindex = 0;
		  }
	  }
  public void printSuspects() {
	  for (int i =0; i < suspects.length; i++) {
		if (null == this.suspects[i]) {
			continue;
		} else {
			System.out.println(this.suspects[i]);
		}
	  }
  }
  
}
