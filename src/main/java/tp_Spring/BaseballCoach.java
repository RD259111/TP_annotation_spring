package tp_Spring;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "baseballCoach";
	}

	public String getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

}