
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		Student student = new Student();
		instructor.setName("Alex");
		instructor.setLastName("Krimpen");
		instructor.setId(1);
		instructor.setEmail("asdkjas@gmail.com");
		instructor.setGivenCourse("Java OOP");
		instructor.setGivenCoursesCount(5);
		student.setName("Clara");
		student.setLastName("Brunson");
		student.setEmail("ajgkasdkjas@gmail.com");
		student.setTakenCourse("Java OOP");
		student.setTakenCoursesCount(1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor);
		instructorManager.login();
		instructorManager.logout();
		
		StudentManager studentManager = new StudentManager();
		studentManager.addUser(student);
		studentManager.logout();
		
		UserManager userManager = new UserManager();
		userManager.giveStatic(); //all user statics
		userManager.giveStatics(new StudentManager()); //only student statics
		userManager.giveStatics(new InstructorManager()); //only instructor statics
		
		
	}

}
