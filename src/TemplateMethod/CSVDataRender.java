package TemplateMethod;

public class CSVDataRender extends DataRenderer {

	@Override
	public String readData() {
		return "CSV Data";
	}

	@Override
	public String processData(String data) {
		return "Processed The Data for "+ data;
	}

}
