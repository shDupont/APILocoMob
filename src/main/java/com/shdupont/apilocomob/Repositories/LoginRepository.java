package com.shdupont.apilocomob.Repositories;

import com.shdupont.apilocomob.Model.Login;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<Login, String> {
}
