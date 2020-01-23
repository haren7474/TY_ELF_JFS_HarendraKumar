package edu.jspiders.onetoonemapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import edu.jspiders.onetoonemapping.dto.TrainerPersonalDTO;
import edu.jspiders.onetoonemapping.dto.TrainerProfessionalDTO;
import edu.jspiders.singletonfactory.classes.SingletonFactory;

public class OneToOneMappingDAO 
{
	public void create(TrainerProfessionalDTO trainer, TrainerPersonalDTO personal)
	{
		trainer.setPersonal(personal);
		
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		session.save(trainer);
		
		session.beginTransaction().commit();
		
		session.close();
	}
	
	public void readById(int personalId)
	{
		SessionFactory factory = SingletonFactory.getFactory();
		
		Session session = factory.openSession();
		
		//TrainerProfessionalDTO trainer = session.get(TrainerProfessionalDTO.class, trainerId);
		//System.out.println("Trainer Professional Info --> "+trainer);
		//System.out.println("Personal Info --> "+trainer.getPersonal());
		
		
		System.out.println("----------------------by trainer--------------------");
		TrainerPersonalDTO personal= session.get(TrainerPersonalDTO.class, personalId);
		System.out.println("Trainer Personal Info --> "+personal);
		System.out.println("Trainer Professional Info --> "+personal.getTrainer());
		
		session.close();
	}
}
