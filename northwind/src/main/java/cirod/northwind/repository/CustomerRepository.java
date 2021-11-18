package cirod.northwind.repository;

import cirod.northwind.model.Customers;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface CustomerRepository
        extends CrudRepository<Customers,String> {

   /* @Query("SELECT customer FROM Customers customer")
    @Transactional(readOnly = true)
     List<Customers> All();*/
    List<Customers> findAll();
    Customers findByCustomerID(String customerID);
    List<Customers> findAllByCountry(String country);
    List<Customers> findAllByCompanyName(String companyName);
    Customers save(Customers customer);


}
