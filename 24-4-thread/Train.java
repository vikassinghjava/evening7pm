
public class Train implements Runnable {
	int availSeat=1;
	int bookSeat;
	public Train(int bookSeat) {
		this.bookSeat=bookSeat;
	}
		
	public void run() {
		if(bookSeat<=availSeat) {
			availSeat=availSeat-bookSeat;
			System.out.println(bookSeat +" berth is avail for "+Thread.currentThread().getName());
		} 
		else
		{
			System.out.println("Berth is not available!");
		}
	}

}
