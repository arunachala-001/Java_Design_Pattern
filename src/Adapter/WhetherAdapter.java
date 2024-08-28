package Adapter;

public class WhetherAdapter {

	public int findByTempreature(int ZipCode) {
		String city = null;
		if(ZipCode == 631702) {
			city = "Tiruvannamali";
		}
		WhetherFinder wf = new WhetherImpl();
		int tempreature = wf.findByCity(city);
		return tempreature;
		
	}
	

}
