package com.ahmet.service;

import com.ahmet.repository.IPostResimPoszisyonRepository;
import com.ahmet.repository.entity.PostResimPozisyon;
import com.ahmet.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class PostResimPoszisyonService  extends ServiceManager<PostResimPozisyon,String> {
    private final IPostResimPoszisyonRepository repository;

    public PostResimPoszisyonService(IPostResimPoszisyonRepository repository){
        super(repository);
        this.repository=repository;
    }
}
