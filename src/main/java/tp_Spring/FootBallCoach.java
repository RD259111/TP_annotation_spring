package tp_Spring;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "footballCoach";
	}

	public String getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

}