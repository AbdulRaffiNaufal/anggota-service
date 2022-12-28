/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naufal.anggota.repository;

import com.naufal.anggota.entity.Anggota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IIISI
 */
@Repository
public interface AnggotaRepository extends JpaRepository<Anggota, Long>{
    
    public Anggota findByAnggotaId(Long anggotaId);
    
    public Anggota save(Anggota anggota);
}
