package com.ahmet.manager;

import com.ahmet.repository.entity.UserProfile;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.ahmet.constants.EndPointList.SAVE;

@FeignClient(
        name = "elastic-service",
        url = "http://localhost:9099/elastic"
)
public interface IElasticServiceManager {

    @PostMapping("/userprofile" + SAVE)
    ResponseEntity<Void> save(@RequestBody UserProfile dto);

}
