package com.empresa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.empresa.entities.*;
import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;

/**
 * @author rogelio.mejiausam
 *
 */
@Stateless
public class PersonaDAO {
    @PersistenceContext(unitName = "cooperativaPU")
            EntityManager em; 
	
	public Persona insertPersona(Persona per) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cooperativa");
//		EntityManager em = emf.createEntityManager();
		
		try {
//			em.getTransaction().begin();
			em.persist(per);
			em.flush();
//			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}finally {
//			em.close();
//			emf.close();
		}
		return per;
	}
	
	public String insertarReferencias(List<Referencia> refs) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cooperativa");
//		EntityManager em = emf.createEntityManager();
		String respuesta ="";
		try {
//			em.getTransaction().begin();
			for(Referencia ref:refs) {
				em.persist(ref);
			}
//			em.getTransaction().commit();
			respuesta = "Exito";
		}catch(Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}
	
	public String insertarBeneficiarios(List<Beneficiario> bens) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cooperativa");
//		EntityManager em = emf.createEntityManager();
		String respuesta ="";
		try {
//			em.getTransaction().begin();
			for(Beneficiario ben:bens) {
				em.persist(ben);
			}
//			em.getTransaction().commit();
			respuesta = "Exito";
		}catch(Exception e) {
			e.printStackTrace();
		}
		return respuesta;
	}

}

