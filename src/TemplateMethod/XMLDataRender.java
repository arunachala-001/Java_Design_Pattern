package TemplateMethod;

public class XMLDataRender extends DataRenderer {

	@Override
	public String readData() {
		return "XML Data";
	}

	@Override
	public String processData(String data) {
		return "Processed The Data for "+ data;
	}

}
