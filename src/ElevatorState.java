/**
 *
 * @author megankale & nicoleBoodhai
 */
public enum ElevatorState {
	// When elevator is empty and not moving
	Idle,
	// When elevator is empty but moving
	MovingUnstoppable,
	// When people are entering elevator
	PeopleEntering,
	// When elevator is not empty and moving
	MovingStoppable,
	// When people are leaving elevator
	PeopleLeaving
}


