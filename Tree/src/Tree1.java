public class Tree1 {
	int height;
	static void prt(String s){
		System.out.println(s);
	}
	{
		prt("Planting a seedling");
		height = 0;
	}
	Tree1(int i){
		prt("Creating new Tree that is " + i + "feet tall");
	}
	void info() {
		prt("Tree is" + height + "feet tall");
	}
	
	void info(String s) {
		prt(s + ":");
	}
}
