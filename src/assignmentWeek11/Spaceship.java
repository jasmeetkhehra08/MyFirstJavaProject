package assignmentWeek11;

public interface Spaceship {

	boolean launch();

	boolean land();

	boolean canCarry(Item item);

	int carry(Item item);

}
