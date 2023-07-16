package com.ahmet.service;

import com.ahmet.repository.IYorumRepository;
import com.ahmet.repository.entity.Yorum;
import com.ahmet.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class YorumService  extends ServiceManager<Yorum,String> {
    private final IYorumRepository repository;

    public YorumService(IYorumRepository repository){
        super(repository);
        this.repository=repository;
    }
}
