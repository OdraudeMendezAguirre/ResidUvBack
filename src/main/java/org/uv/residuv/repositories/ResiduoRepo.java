/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.uv.residuv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uv.residuv.entities.Residuo;

/**
 *
 * @author ashly
 */
@Repository
public interface ResiduoRepo extends JpaRepository<Residuo, Integer> {
    
}
