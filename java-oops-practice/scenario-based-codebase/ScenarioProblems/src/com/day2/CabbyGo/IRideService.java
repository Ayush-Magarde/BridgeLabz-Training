package com.day2.CabbyGo;

public interface IRideService {

	void bookRide();
	void endRide();
	double calculateFare(int distance);
}
