package com.tyss.forestrymanagementsystemboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.forestrymanagementsystemboot.dto.ContractBean;
import com.tyss.forestrymanagementsystemboot.dto.ContractResponse;
import com.tyss.forestrymanagementsystemboot.services.ContractServices;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContractController {

	@Autowired
	private ContractServices service;

	@PostMapping(path = "/fmsboot/addContract", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse addContract(@RequestBody ContractBean bean) {
		ContractResponse response = new ContractResponse();

		if (service.addContract(bean)) {
			response.setMessage("Success");
			response.setDescription("Contract added successfully");
			response.setStatusCode(201);
			response.setContractBean(Arrays.asList(bean));
			
		} else {
			response.setMessage("Failure");
			response.setDescription("contract not added");
			response.setStatusCode(401);
		}
		return response;
	}

	@PutMapping(path = "/fmsboot/updateContract", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse updateContract(@RequestBody ContractBean bean) {
		ContractResponse response = new ContractResponse();

		if (service.modifyContract(bean)) {
			response.setMessage("Success");
			response.setDescription("Contract cost updated successfully");
			response.setStatusCode(201);

		} else {
			response.setMessage("Failure");
			response.setDescription("Price not updated, Id not found");
			response.setStatusCode(401);
		}
		return response;
	}

	@DeleteMapping(path = "/fmsboot/deleteContract", produces = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse deleteContract(@RequestBody ContractBean bean) {
		ContractResponse response = new ContractResponse();

		if (service.deleteContract(bean.getContractId())) {
			response.setMessage("Success");
			response.setDescription("Contract deleted successfully");
			response.setStatusCode(201);

		} else {
			response.setMessage("Failure");
			response.setDescription("Contract not deleted, Id not found");
			response.setStatusCode(401);
		}
		return response;
	}
	
	@PostMapping(path = "/fmsboot/gtContract", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse getContract(@RequestParam("contractId") int contractId) {
		ContractResponse response = new ContractResponse();
		ContractBean bean=  service.getContractById(contractId);
		if (bean!=null) {
			response.setMessage("Success");
			response.setDescription("Contract found and displayed");
			response.setStatusCode(201);
			response.setContractBean(Arrays.asList(bean));

		} else {
			response.setMessage("Failure");
			response.setDescription("Contract not found");
			response.setStatusCode(401);
		}
		return response;
	}
	
	@PostMapping(path = "/fmsboot/getAllContracts", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse getAllContracts() {
		ContractResponse response = new ContractResponse();
		List<ContractBean> list=  service.getAllContract();
		if (list.size()>0) {
			response.setMessage("Success");
			response.setDescription("Contracts found and displayed");
			response.setStatusCode(201);
			response.setContractBean(list);

		} else {
			response.setMessage("Failure");
			response.setDescription("Empty List");
			response.setStatusCode(401);
		}
		return response;
	}
}
