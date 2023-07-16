package com.ahmet.service;

import com.ahmet.repository.IUserRolesRepository;
import com.ahmet.repository.entity.UserRoles;
import com.ahmet.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class UserRolesService extends ServiceManager<UserRoles,String> {
    private final IUserRolesRepository repository;
    public UserRolesService(IUserRolesRepository repository){
        super(repository);
        this.repository=repository;
    }

}
