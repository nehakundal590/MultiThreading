package com.multiThread;
class BookTrainSeat{
	int total_seats=10;
	public void bookSeat(int seats) {
		// book train seat
	if(total_seats>=seats) {
		System.out.println("seat booked sucessfully");
		total_seats=total_seats-seats;
		System.out.println("Total seats left"+total_seats);
	}
	else {
		System.out.println("seats not booked ");
		System.out.println("Total seats left"+total_seats);
	}
	}
}
class abm extends Thread{
	BookTrainSeat bts;
	int seats;
	public abm(BookTrainSeat bts,int seats) {
		this.bts=bts;
		this.seats=seats;
	}
	public void run() {
		bts.bookSeat(seats);
		
	}
}

public class TrainReservation {
	public static void main(String[] args) {
		BookTrainSeat bts=new BookTrainSeat();
		abm  deepak =new abm(bts,3);
		deepak.start();
		
		abm amit =new abm(bts,4);
		amit.start();
		
		abm neha =new abm(bts,5);
		neha.start();
	}

}
