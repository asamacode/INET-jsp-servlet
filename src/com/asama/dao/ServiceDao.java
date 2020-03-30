package com.asama.dao;

import java.util.List;

import com.asama.model.Service;

public interface ServiceDao {
	
	List<String> getListServiceName();
	
	List<Service> getListServices();
	
	Service getSingleService(String code);
	
	boolean insertService(Service service);
	
	boolean updateService(Service service);
	
	boolean deleteService(String code);
}