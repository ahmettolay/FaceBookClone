package com.ahmet.service;

import com.ahmet.repository.IBegeniRepository;
import com.ahmet.repository.entity.Begeni;
import com.ahmet.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class BegeniService extends ServiceManager<Begeni,String> {
    private final IBegeniRepository repository;
    public BegeniService(IBegeniRepository repository){
        super(repository);
        this.repository=repository;
    }
}
