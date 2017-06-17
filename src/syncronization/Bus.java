package syncronization;

public class Bus {
	final int seat=50;
	int available;
	public void book(){
		if( available<=seat){
			System.out.println( "seats are available");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
