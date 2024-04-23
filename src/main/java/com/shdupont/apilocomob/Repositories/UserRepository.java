package com.shdupont.apilocomob.Repositories;

import com.shdupont.apilocomob.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
