/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.protech.apps.us.product.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author BLU Kwensy Eli
 */
@Entity
@Data
@NoArgsConstructor
public class Product implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    @NonNull
    private String name;
    
    /**
     * l'annotation @Column volontairement omise pour vérifier si cette colonne est générée ou pas
     */
    @NonNull
    private Integer quantity;

    
    
    
}
