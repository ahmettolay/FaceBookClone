package com.ahmet.service;

import com.ahmet.repository.IKayitliPostlarRepository;
import com.ahmet.repository.entity.KayitliPostlar;
import com.ahmet.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class KayitliPostlarService extends ServiceManager<KayitliPostlar,String> {
    private final IKayitliPostlarRepository repository;

    public KayitliPostlarService(IKayitliPostlarRepository repository){
        super(repository);
        this.repository=repository;
    }
}
