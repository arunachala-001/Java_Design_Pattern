package Adapter;

public class WhetherUI {

	public void ShowTempreature(int zipcode) {
		WhetherAdapter wp = new WhetherAdapter();
		int temp = wp.findByTempreature(zipcode);
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
        WhetherUI ui = new WhetherUI();
        ui.ShowTempreature(631702);
		
	}
		
}
