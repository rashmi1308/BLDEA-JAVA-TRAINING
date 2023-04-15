package trainingcodes;
interface calculator{
	void add();
	void sub();
}
abstract class Calcy1 implements calculator{
	@Override
	public void add() {
System.out.println("Add-1");
  }
}
abstract class Calcy2 implements calculator{
	@Override
	public void add() {
		System.out.println("Add-2");
	}
	@Override
	public void sub() {
		System.out.println("Sub-2");
		}
}