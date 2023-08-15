/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.residuv.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.residuv.entities.Pregunta;
import org.uv.residuv.repositories.PreguntaRepo;

/**
 *
 * @author ashly
 */
@RestController
@RequestMapping("/preguntas")
public class PreguntaController {
    @Autowired
    PreguntaRepo repo;
    
    @GetMapping()
    public List<Pregunta> getPreguntas(){
        return repo.findAll();
    }
}
