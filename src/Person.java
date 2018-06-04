/**
 *
 * @author megankale & nicoleBoodhai
 */

public class Person {
	private float _CreateTime;
	private float _ElevatorEnterTime;
	private float _ElevatorLeaveTime;

	private int _EnterFloor;
	private int _LeaveFloor;

	public Person(float createTime,
					int enterFloor,
					int leaveFloor) {
		if (enterFloor == leaveFloor) {
			System.out.println("ERROR: Person with same enter and leave level");
			return;
		}
		_CreateTime = createTime;
		_EnterFloor = enterFloor;
		_LeaveFloor = leaveFloor;
	}

	public float WaitTime() {
		return _ElevatorEnterTime - _CreateTime;
	}
	public float TravelTime() {
		return _ElevatorLeaveTime - _ElevatorEnterTime;
	}

	public int EnterFloor() {
		return _EnterFloor;
	}
	public int LeaveFloor() {
		return _LeaveFloor;
	}
	public int Direction() {
		if(_LeaveFloor > _EnterFloor)
		return 1;
		
		else return -1;
	}

	public void EnterElevator(float time) {
		_ElevatorEnterTime = time;
	}
	public void LeaveElevator(float time) {
		_ElevatorLeaveTime = time;
		Statistic.Add(this);
	}
}