package cirod.northwind.controller;

import cirod.northwind.model.Customers;
import cirod.northwind.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/ListCustomer")
    public List<Customers> getCustomer(){

        List<Customers> response = customerRepository.findAll();

        if(response != null){
            return response;
        }else{
            return null;
        }

    }
    @PostMapping(value = "/customers")
    public Customers getCustomer(@RequestBody Customers customer){
        return customerRepository.findByCustomerID(customer.getCustomerID());
    }

    @PostMapping(value="/customers/add",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Customers addCustomer(@RequestBody Customers customer){
        return customerRepository.save(customer);
    }

    @PostMapping(value = "/customers/country")
    public List<Customers> getCustomerByCountry(@RequestBody Customers customer){
        return customerRepository.findAllByCountry(customer.getCountry());
    }
    @PostMapping(value = "/customers/company")
    public List<Customers> getCustomerByCompanyName(@RequestBody Customers customer){
        return customerRepository.findAllByCompanyName(customer.getCompanyName());
    }


    @GetMapping(value = "/hello")
    public String hello(){
        return "Hola mundo desde springBoot <h1>hola</h1>";
    }


}
