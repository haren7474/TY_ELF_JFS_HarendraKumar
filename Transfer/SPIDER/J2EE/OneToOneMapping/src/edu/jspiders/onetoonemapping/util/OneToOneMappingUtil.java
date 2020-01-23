package edu.jspiders.onetoonemapping.util;

import java.util.Scanner;

import edu.jspiders.onetoonemapping.dao.OneToOneMappingDAO;
import edu.jspiders.onetoonemapping.dto.TrainerPersonalDTO;
import edu.jspiders.onetoonemapping.dto.TrainerProfessionalDTO;

public class OneToOneMappingUtil 
{
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		new OneToOneMappingDAO().create(readTrainerProfessionalDTO(), readTrainerPersonalDTO());
	}
	
	public static TrainerProfessionalDTO readTrainerProfessionalDTO()
	{
		System.out.println("Please enter FirstName, LastName, Designation, Salary");
		return new TrainerProfessionalDTO(sc.next(), sc.next(), sc.next(), sc.nextDouble());
	}
	
	public static TrainerPersonalDTO readTrainerPersonalDTO()
	{
		System.out.println("Please enter MotherTongue, Hometown, Status");
		return new TrainerPersonalDTO(sc.next(), sc.next(), sc.next());
	}
}
