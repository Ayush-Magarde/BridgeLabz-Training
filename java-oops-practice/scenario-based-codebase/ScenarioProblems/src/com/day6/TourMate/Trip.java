package com.day6.TourMate;

public abstract class Trip implements IBookable{

	private String destination;
	private double budget;
	private int duration; // in days
	
	protected Transport transport;
	protected Hotel hotel;
	protected Activity activity;
	
	public Trip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
		this.destination = destination;
		this.duration = duration;
		this.transport = transport;
		this.hotel = hotel;
		this.activity = activity;
		
		this.budget = transport.getTransportCost() + 
					  hotel.getHotelCost() +
					  activity.getActivityCost();
		}
	
	
    public void displayTrip() {
        System.out.println(
                destination +
                " | Duration: " + duration + " days" +
                " | Budget: INR " + budget
        );
    }

	public abstract void book();
	public abstract void cancel();
}
