/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.residuv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author ashly
 */
@Entity
@Data
@Table(name = "residuos")
public class Residuo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ResiduosID;
    
    @Column
    private String Tipo;
}
