package edu.spiders.onetomany.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import edu.jspiders.singletonfactory.classes.SingletonFactory;
import edu.spiders.onetomany.dto.BatchesDTO;
import edu.spiders.onetomany.dto.TrainerProfessionalDTO;

public class OneToManyMappingDAO 
{
	public void createBatches(int trainerId)
	{
		SessionFactory factory= SingletonFactory.getFactory();
		Session session= factory.openSession();
		TrainerProfessionalDTO trainer= session.get(TrainerProfessionalDTO.class, trainerId);
		
		if(trainer!=null)
		{
			BatchesDTO batch1= new BatchesDTO("HEHM15", "Hibernate");
			BatchesDTO batch2= new BatchesDTO("HEHM21", "Spring");
			BatchesDTO batch3= new BatchesDTO("HEHM26", "JDBC");
			BatchesDTO batch4= new BatchesDTO("HEHM30", "JSP");
			
			trainer.addBatches(batch1);
			trainer.addBatches(batch2);
			trainer.addBatches(batch3);
			trainer.addBatches(batch4);
			
			session.save(batch1);
			session.save(batch2);
			session.save(batch3);
			session.save(batch4);
			
			session.beginTransaction().commit();
		}
		else
		{
			System.out.println("Trainer with given Id is not present");
		}
	}
}
