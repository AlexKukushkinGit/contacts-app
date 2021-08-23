package app.crm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import app.crm.model.Contact;

@RepositoryRestResource
public interface ContactRepository extends CrudRepository<Contact, Long> {

}
