/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.residuv.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.uv.residuv.entities.Alumno;

/**
 *
 * @author ashly
 */
@Repository
public interface AuthRepo extends JpaRepository<Alumno, Integer>{
    
    public Optional<Alumno> findByUsername(String username);

    public Boolean existsByUsername(String username);
}
