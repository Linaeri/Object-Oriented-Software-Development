package lab3q1;

//Driver program to test the Time class.
public class TimeTest
{
	public static void main (String args[])
	{
		Time t = new Time (23, 59, 59);
		System.out.println(t.toMilitaryString()); // format hhmm
		System.out.println(t.toString()); // format hh:mm:ss
		t.tick(); // progress the time by 1 second
		System.out.println(t.toMilitaryString());
		System.out.println(t.toString());
	}
}