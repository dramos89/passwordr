package pk.com.security.dao;

import java.util.ArrayList;
import java.util.List;

import pk.com.security.domain.Service;
//provisoriamente é a camada de persistencia dos dados de senha
public class ServiceDAO {
	
	private static List<Service> services = new ArrayList<>();
	
	
	public static void save(Service service){
		services.add(service);
	}
	
	public static List<Service> list(){
		return services;
	}
	
	public static Object findByService(String serviceInput){
		for (Service service : services) {
			if(service.getService().equals(serviceInput)){
				return service;
			}
		}
		return null;
	}
}
