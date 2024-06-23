package com.project.bga.Impl;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.project.bga.Model.Employee;
import com.project.bga.Model.Student;
import com.project.bga.Repository.GreetingsRepository;

@Service
public class GreetingsServiceImpl {

	@Autowired
	GreetingsRepository greetingsRepository;

	@Autowired
	MailServiceImpl mailServiceImpl;

	Logger log = LoggerFactory.getLogger(GreetingsServiceImpl.class);

	public String generateGreetingCard(String Id, String Name, String DOB, String Branch, String filePath) {

		log.info("Entered into generateGreetingCard()...");

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
		Date dateObject = new Date();
		String date = dateFormat.format(dateObject);
		String fileName = filePath + Id + "_" + date + ".pdf";

		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(fileName));
			document.open();

			Image image1 = Image.getInstance("src/main/resources/static/Images/logo.png");
			Image image2 = Image.getInstance("src/main/resources/static/Images/flower.png");
			Image image3 = Image.getInstance("src/main/resources/static/Images/cake.png");
			image3.scaleAbsolute(200f, 200f);
			image2.scaleAbsolute(400f, 200f);

			image1.setAlignment(image1.ALIGN_CENTER);
			image2.setAlignment(image2.ALIGN_CENTER);
			image3.setAlignment(image3.ALIGN_CENTER);

			Font font = new Font(Font.FontFamily.TIMES_ROMAN, 17, Font.ITALIC | Font.BOLD, BaseColor.RED);
			Font font1 = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
			Font font2 = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD);
			Font font3 = new Font(Font.FontFamily.TIMES_ROMAN, 22, Font.ITALIC | Font.BOLD, BaseColor.BLUE);

			Paragraph P = new Paragraph("Many More Happy Returns of the Day", font3);
			P.setAlignment(P.ALIGN_CENTER);
			Paragraph p1 = new Paragraph(
					"Designed & Devoleped by Shaik Reshma (211FD01053) & Ch. Lakshmi Bhargavi (211FD01012)"
							+ "\nMaster of Computer Applications - Department of Information Technology"
							+ "\nVignan's Foundation for Science Technology & Research (Deemed to be) University",
					font2);
			p1.setAlignment(p1.ALIGN_CENTER);

			Paragraph pp1 = new Paragraph(DOB, font2);
			pp1.setAlignment(pp1.ALIGN_RIGHT);
			document.add(pp1);
			document.add(image1);
			document.add(P);
			Paragraph p = new Paragraph(Name.toUpperCase() + " " + "(" + Id.toUpperCase() + ")\nBranch: " + Branch,
					font);
			p.setAlignment(p.ALIGN_CENTER);
			Paragraph pp = new Paragraph("Heartful Birthday Wishes to you for Celebrating Birthday today", font1);
			pp.setAlignment(pp.ALIGN_CENTER);

			Paragraph pp2 = new Paragraph(
					"Wishing you a year filled with adventure! Keep getting better every year...\nHope your birthday cake is as sweet as you!",
					font1);
			pp2.setAlignment(pp2.ALIGN_CENTER);

			document.add(p);
			document.add(pp);
			document.add(image2);
			document.add(pp2);
			document.add(image3);
			document.add(p1);

			log.info("Greeting Card for " + Name + " Created at: " + fileName);

			document.close();

			return fileName;
		} catch (Exception e) {
			log.info(e.getMessage());
			return "Error while generating Greeting Card for: " + Name + "(" + Id + ")";
		}

	}

	public String generateExternalGreetingCard(String Name, String fName, String fEmail, String filePath) {

		log.info("Entered into generateGreetingCard()...");

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
		Date dateObject = new Date();
		String date = dateFormat.format(dateObject);
		String fileName = filePath + Name + "_" + date + ".pdf";

		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(fileName));
			document.open();

			Image image1 = Image.getInstance("src/main/resources/static/Images/flowers-1.png");
			Image image2 = Image.getInstance("src/main/resources/static/Images/flower.png");
			Image image3 = Image.getInstance("src/main/resources/static/Images/cake.png");
			image1.scaleAbsolute(300f, 200f);
			image3.scaleAbsolute(150f, 150f);
			image2.scaleAbsolute(300f, 200f);

			image1.setAlignment(image1.ALIGN_CENTER);
			image2.setAlignment(image2.ALIGN_CENTER);
			image3.setAlignment(image3.ALIGN_CENTER);

			Font font = new Font(Font.FontFamily.TIMES_ROMAN, 17, Font.ITALIC | Font.BOLD, BaseColor.RED);
			Font font1 = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
			Font font2 = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD);
			Font font3 = new Font(Font.FontFamily.TIMES_ROMAN, 22, Font.ITALIC | Font.BOLD, BaseColor.BLUE);

			Paragraph P = new Paragraph("Many More Happy Returns of the Day", font3);
			P.setAlignment(P.ALIGN_CENTER);
			Paragraph p1 = new Paragraph(
					"Designed & Devoleped by Shaik Reshma (211FD01053) & Ch. Lakshmi Bhargavi (211FD01012)"
							+ "\nMaster of Computer Applications - Department of Information Technology"
							+ "\nVignan's Foundation for Science Technology & Research (Deemed to be) University",
					font2);
			p1.setAlignment(p1.ALIGN_CENTER);

			Paragraph pp1 = new Paragraph(date, font2);
			pp1.setAlignment(pp1.ALIGN_RIGHT);
			document.add(pp1);
			document.add(image1);
			document.add(P);
			Paragraph p = new Paragraph(Name.toUpperCase() + "\n", font);
			p.setAlignment(p.ALIGN_CENTER);
			Paragraph pp = new Paragraph("Heartful Birthday Wishes to you for Celebrating Birthday today", font1);
			pp.setAlignment(pp.ALIGN_CENTER);

			Paragraph pp2 = new Paragraph(
					"Wishes from: " + fName.toUpperCase() + "\nYou can reply to: " + fEmail + "\n", font1);
			pp2.setAlignment(pp2.ALIGN_CENTER);

			document.add(p);
			document.add(pp);
			document.add(image2);
			document.add(pp2);
			document.add(image3);
			document.add(p1);

			log.info("Greeting Card for " + Name + " Created at: " + fileName);

			document.close();

			return fileName;
		} catch (Exception e) {
			log.info(e.getMessage());
			return "Error while generating Greeting Card for External Friend: " + Name;
		}

	}

	public String generateStudentGreetingsDocument(List<Student> birthdayStudents, String filePath, String mode) {

		log.info("Entered into generateStudentGreetingsDocument()...");
		String format = "dd-MM-YYYY";
		if (mode.equals("Month"))
			format = "MMMM-YYYY";

		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		Date dateObject = new Date();
		String date = dateFormat.format(dateObject);
		String fileName = filePath + date + ".pdf";

		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(fileName));
			document.open();

			Image image1 = Image.getInstance("src/main/resources/static/Images/logo.png");
			Image image2 = Image.getInstance("src/main/resources/static/Images/flower.png");
			Image image3 = Image.getInstance("src/main/resources/static/Images/cake.png");
			image3.scaleAbsolute(200f, 200f);
			image2.scaleAbsolute(400f, 200f);

			image1.setAlignment(image1.ALIGN_CENTER);
			image2.setAlignment(image2.ALIGN_CENTER);
			image3.setAlignment(image3.ALIGN_CENTER);

			Font font = new Font(Font.FontFamily.TIMES_ROMAN, 17, Font.ITALIC | Font.BOLD, BaseColor.RED);
			Font font1 = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
			Font font2 = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD);
			Font font3 = new Font(Font.FontFamily.TIMES_ROMAN, 22, Font.ITALIC | Font.BOLD, BaseColor.BLUE);

			Paragraph P = new Paragraph("Many More Happy Returns of the Day", font3);
			P.setAlignment(P.ALIGN_CENTER);
			Paragraph p1 = new Paragraph(
					"Designed & Devoleped by Shaik Reshma (211FD01053) & Ch. Lakshmi Bhargavi (211FD01012)"
							+ "\nMaster of Computer Applications - Department of Information Technology"
							+ "\nVignan's Foundation for Science Technology & Research (Deemed to be) University",
					font2);
			p1.setAlignment(p1.ALIGN_CENTER);

			for (Student s : birthdayStudents) {
				Paragraph pp1 = new Paragraph(s.getStudentDOB(), font2);
				pp1.setAlignment(pp1.ALIGN_RIGHT);
				document.add(pp1);
				document.add(image1);
				document.add(P);
				Paragraph p = new Paragraph(s.getStudentName().toUpperCase() + " " + "("
						+ s.getStudentId().toUpperCase() + ")\nBranch: " + s.getStudentBranch(), font);
				p.setAlignment(p.ALIGN_CENTER);
				Paragraph pp = new Paragraph("Heartful Birthday Wishes to you for Celebrating Birthday today", font1);
				pp.setAlignment(pp.ALIGN_CENTER);

				Paragraph pp2 = new Paragraph(
						"Wishing you a year filled with adventure! Keep getting better every year...\nHope your birthday cake is as sweet as you!",
						font1);
				pp2.setAlignment(pp2.ALIGN_CENTER);

				document.add(p);
				document.add(pp);
				document.add(image2);
				document.add(pp2);
				document.add(image3);
				document.add(p1);
				document.newPage();
			}

			log.info("Greeting Card for " + date + " Created at: " + fileName);

			document.close();

			return fileName;
		} catch (Exception e) {
			log.info(e.getMessage());
			return "Error while generating Greeting Card for: " + date;
		}

	}

	public String generateEmployeeGreetingsDocument(List<Employee> birthdayEmployees, String filePath, String mode) {

		log.info("Entered into generateEmployeeGreetingsDocument()...");
		String format = "dd-MM-YYYY";
		if (mode.equals("Month"))
			format = "MMMM-YYYY";

		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		Date dateObject = new Date();
		String date = dateFormat.format(dateObject);
		String fileName = filePath + date + ".pdf";

		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(fileName));
			document.open();

			Image image1 = Image.getInstance("src/main/resources/static/Images/logo.png");
			Image image2 = Image.getInstance("src/main/resources/static/Images/flower.png");
			Image image3 = Image.getInstance("src/main/resources/static/Images/cake.png");
			image3.scaleAbsolute(200f, 200f);
			image2.scaleAbsolute(400f, 200f);

			image1.setAlignment(image1.ALIGN_CENTER);
			image2.setAlignment(image2.ALIGN_CENTER);
			image3.setAlignment(image3.ALIGN_CENTER);

			Font font = new Font(Font.FontFamily.TIMES_ROMAN, 17, Font.ITALIC | Font.BOLD, BaseColor.RED);
			Font font1 = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
			Font font2 = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.BOLD);
			Font font3 = new Font(Font.FontFamily.TIMES_ROMAN, 22, Font.ITALIC | Font.BOLD, BaseColor.BLUE);

			Paragraph P = new Paragraph("Many More Happy Returns of the Day", font3);
			P.setAlignment(P.ALIGN_CENTER);
			Paragraph p1 = new Paragraph(
					"Designed & Devoleped by Shaik Reshma (211FD01053) & Ch. Lakshmi Bhargavi (211FD01012)"
							+ "\nMaster of Computer Applications - Department of Information Technology"
							+ "\nVignan's Foundation for Science Technology & Research (Deemed to be) University",
					font2);
			p1.setAlignment(p1.ALIGN_CENTER);

			for (Employee emp : birthdayEmployees) {
				Paragraph pp1 = new Paragraph(emp.getEmployeeDOB(), font2);
				pp1.setAlignment(pp1.ALIGN_RIGHT);
				document.add(pp1);
				document.add(image1);
				document.add(P);
				Paragraph p = new Paragraph(emp.getEmployeeName().toUpperCase() + " " + "("
						+ emp.getEmployeeId().toUpperCase() + ")\nBranch: " + emp.getEmployeeBranch(), font);
				p.setAlignment(p.ALIGN_CENTER);
				Paragraph pp = new Paragraph("Heartful Birthday Wishes to you for Celebrating Birthday today", font1);
				pp.setAlignment(pp.ALIGN_CENTER);

				Paragraph pp2 = new Paragraph(
						"Wishing you a year filled with adventure! Keep getting better every year...\nHope your birthday cake is as sweet as you!",
						font1);
				pp2.setAlignment(pp2.ALIGN_CENTER);

				document.add(p);
				document.add(pp);
				document.add(image2);
				document.add(pp2);
				document.add(image3);
				document.add(p1);
				document.newPage();
			}

			log.info("Greeting Card for " + date + " Created at: " + fileName);

			document.close();

			return fileName;
		} catch (Exception e) {
			log.info(e.getMessage());
			return "Error while generating Greeting Card for: " + date;
		}

	}

	public List<String> generateStudentGreetings(String filePath, String userEmailId, String userPassword)
	{
		log.info("Entered into generateStudentGreetings()...");
		
        
        List<String> files = new ArrayList<String>();
		
		try
		{
			List<Student> birthdayStudents = greetingsRepository.fetchTodaysBirthdayStudents();
			
			for(Student s:birthdayStudents)
			{
				String fileName = generateGreetingCard(s.getStudentId(), s.getStudentName(), s.getStudentDOB(), s.getStudentBranch(), filePath);
				log.info("Sending Email Greetings to: "+s.getStudentName()+"("+s.getStudentId()+")");
				String subject = "Happy Birthday: "+s.getStudentName();
				String message = "Dear "+s.getStudentName()+" ("+s.getStudentId()+"),"
						+ "\n\nMany More Happy Returns of the Day..."
						+ "\n\nHope this birthday brings lot of Joy, Health & Wealth..."
						+ "\n\nThanks & Regards,"
						+ "\nTeam Birthday Greetings App,"
						+ "\nDepartment of MCA,"
						+ "\nVignans University.";
				mailServiceImpl.sendEmail(s.getStudentEmail(), subject, message, fileName, userEmailId, userPassword);
				log.info("Email Greetings Sent to: "+s.getStudentName()+"("+s.getStudentId()+")");
				files.add(fileName);
			}
			
			log.info("Generating Student Greetings Document...");
			
			String documentName = generateStudentGreetingsDocument(birthdayStudents,filePath,"Day");
			files.add(documentName);
			
			log.info("studentGreetingsDocument for the day is created at: "+documentName);
			log.info("All Student GreetingCards Generated");
			return files;
			
		}
		catch(Exception e)
		{
			log.info(e.getMessage());
			return files;
		}
		
	}

	public List<String> generateEmployeeGreetings(String filePath, String userEmailId, String userPassword) {
		log.info("Entered into generateEmployeeGreetings()...");

		List<String> files = new ArrayList<String>();

		try {
			List<Employee> birthdayEmployees = greetingsRepository.fetchTodaysBirthdayEmployees();

			for (Employee emp : birthdayEmployees) {
				String fileName = generateGreetingCard(emp.getEmployeeId(), emp.getEmployeeName(), emp.getEmployeeDOB(),
						emp.getEmployeeBranch(), filePath);
				
				
				log.info("Sending Email Greetings to: "+emp.getEmployeeName()+"("+emp.getEmployeeId()+")");
				String subject = "Happy Birthday: "+emp.getEmployeeName();
				String message = "Dear "+emp.getEmployeeName()+" ("+emp.getEmployeeId()+"),"
						+ "\n\nMany More Happy Returns of the Day..."
						+ "\n\nHope this birthday brings lot of Joy, Health & Wealth..."
						+ "\n\nThanks & Regards,"
						+ "\nTeam Birthday Greetings App,"
						+ "\nDepartment of MCA,"
						+ "\nVignans University.";
				mailServiceImpl.sendEmail(emp.getEmployeeEmail(), subject, message, fileName, userEmailId, userPassword);
				log.info("Email Greetings Sent to: "+emp.getEmployeeName()+"("+emp.getEmployeeId()+")");
				
				
				files.add(fileName);
			}

			log.info("Generating Employee Greetings Document...");

			String documentName = generateEmployeeGreetingsDocument(birthdayEmployees, filePath, "Day");
			files.add(documentName);

			log.info("employeeGreetingsDocument for the day is created at: " + documentName);
			log.info("All Employee GreetingCards Generated");
			return files;

		} catch (Exception e) {
			log.info(e.getMessage());
			return files;
		}

	}

	public List<String> generateMonthlyGreetings(String studentFilePath, String employeeFilePath, String userEmailId, String userPassword) {
		List<Student> birthdayStudents = greetingsRepository.fetchMonthlyBirthdayStudents();
		List<Employee> birthdayEmployees = greetingsRepository.fetchMonthlyBirthdayEmployees();

		List<String> files = new ArrayList<String>();

		String studentsDocument = generateStudentGreetingsDocument(birthdayStudents, studentFilePath, "Month");
		String employeeDocument = generateEmployeeGreetingsDocument(birthdayEmployees, employeeFilePath, "Month");

		if (studentsDocument.length() != 0 && employeeDocument.length() != 0) {
			files.add(studentsDocument);
			files.add(employeeDocument);
			return files;
		}
		return files;
	}

}
