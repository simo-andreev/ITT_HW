package enumerators;

public enum Months {


	JANUARY(1),		//unucember
	FEBRUARY(2),	//duocember
	MARCH(3),		//trecember
	APRIL(4),		//quacember
	MAY(5),			//quicember
	JUNE(6),		//sexcember
	JULY(7),		//sepcember
	AUGUST(8),		//octoumber
	SEPTEMBER(9),	//nouvember
	OCTOMBER(10),	//deccember
	NOVEMBER(11),	//undecember
	DECEMBER(12);	//dudecember

	
	int monthNumber;
	
	private Months(int number){
		this.monthNumber = number;
	}
	
	
}
