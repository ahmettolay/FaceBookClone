package com.ahmet.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "yorum")
public class Yorum {
    @Id
    String id;
    String postid;
    String userid;
    String parentid;
    String icerik;
    Long paylasmazamani;
    int begenisayisi;
}
