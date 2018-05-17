package com.delta.angular4cassandra.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.delta.angular4cassandra.model.Customer;

public interface CustomerRepository extends CassandraRepository<Customer> {

}
