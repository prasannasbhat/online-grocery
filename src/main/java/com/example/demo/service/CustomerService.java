package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
         return customerRepository.findById(id)
            .orElseThrow(() -> new CustomerNotFoundException(id));
    }

    public Customer updateCustomer(Long id, Customer customer) {

        Customer existingCustomer = customerRepository.findById(id)
            .orElseThrow(() -> new CustomerNotFoundException(id));

    existingCustomer.setName(customer.getName());
    existingCustomer.setEmail(customer.getEmail());
    existingCustomer.setAddress(customer.getAddress());
    existingCustomer.setPhone(customer.getPhone());

    return customerRepository.save(existingCustomer);
    }

    public void deleteCustomer(Long id) {

    if (!customerRepository.existsById(id)) {
        throw new CustomerNotFoundException(id);
    }

    customerRepository.deleteById(id);
}
}