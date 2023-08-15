/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.residuv.config;

/**
 *
 * @author ashly
 */
public class JWTAuthResonseDTO {
    private String tokenDeAcceso;
    private String tipoDeToken = "Bearer";
    private int id;

    public JWTAuthResonseDTO(String tokenDeAcceso,int id) {
        super();
        this.tokenDeAcceso = tokenDeAcceso;
        this.id=id;
    }

    public JWTAuthResonseDTO(String tokenDeAcceso, String tipoDeToken) {
        super();
        this.tokenDeAcceso = tokenDeAcceso;
        this.tipoDeToken = tipoDeToken;
        
    }

    public String getTokenDeAcceso() {
        return tokenDeAcceso;
    }

    public void setTokenDeAcceso(String tokenDeAcceso) {
        this.tokenDeAcceso = tokenDeAcceso;
    }

    public String getTipoDeToken() {
        return tipoDeToken;
    }

    public void setTipoDeToken(String tipoDeToken) {
        this.tipoDeToken = tipoDeToken;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
