/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.residuv.entities;

import java.util.Date;
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
@Table(name = "contribuciones")
@Data
public class Contribucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ContribucionesID;
    
    private int AlumnoID;
    private Date fecha_registro;
    private int Cantidad;
    private int ResiduosID;
}
