package pk.com.security.domain;

public class Service {
	
	private String service;
	private Data data;
	
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}	
}
