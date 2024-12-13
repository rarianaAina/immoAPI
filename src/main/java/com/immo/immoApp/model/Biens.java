package com.immo.immoApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Biens {

    @Id
    private String biensID;
    private String biensName;
    private int prix;

}
