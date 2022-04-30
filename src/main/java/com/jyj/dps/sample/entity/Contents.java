package com.jyj.dps.sample.entity;

import lombok.AccessLevel;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Contents {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    public Contents(String content){
        this.content = content;
    }

}
