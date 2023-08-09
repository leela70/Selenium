package org.system;
//single inheritance
public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("desktopSize");
	}
	
	
public static void main(String[] args) {
		
	Desktop Total = new Desktop();
	
	Total.desktopSize();
	Total.computerModel();
	
}
}