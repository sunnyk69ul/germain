class Signal extends TrafficLight{
	enum SignalState{
		RED,
		YELLOW ,
		GREEN
	}
	
	int signal = 0;
	
	public void changeState(int fromState, int toState){
		System.out.println(fromState);
		System.out.println(toState);
	}
	
	public static void main(String[] args){
		new Signal().changeState(0,2);
	}
}

abstract class TrafficLight {
	abstract void changeState(int fromState, int toState);
}

/*interface TrafficLight {
	void changeState(int fromState, int toState);
}*/
