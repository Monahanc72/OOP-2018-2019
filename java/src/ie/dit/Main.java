package ie.dit;

public class Main
{	

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}
	
	public void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
	}

	public void loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
		
	}
	
	public void arrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
		
	}

	public void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
		
	}

	public void heap1()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Heap1());
		
	}


	public void heap2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Heap2());
		
	}

	
	public static void main(String[] args)
	{
		Main main = new Main();
		main.heap1();		
	}

	
	
}