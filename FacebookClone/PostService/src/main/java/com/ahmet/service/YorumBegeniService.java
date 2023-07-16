package com.ahmet.service;

import com.ahmet.repository.IYorumBegeniRepository;
import com.ahmet.repository.entity.YorumBegeni;
import com.ahmet.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class YorumBegeniService  extends ServiceManager<YorumBegeni,String> {
    private final IYorumBegeniRepository repository;
    public YorumBegeniService(IYorumBegeniRepository repository){
        super(repository);
        this.repository=repository;
    }
}
