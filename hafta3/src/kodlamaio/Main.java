package kodlamaio;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();
		userManager.comment();
		userManager.deleteComment();
		userManager.editProfile();
		userManager.register();
		userManager.login();
		userManager.logOut();

		System.out.println("-----------------------------------------");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.registerForTheCourse();
		instructorManager.manageSubscriptions();
		instructorManager.addCardInformation();
		instructorManager.updateCardInformation();
		instructorManager.comment();
		instructorManager.deleteComment();
		instructorManager.editProfile();
		instructorManager.register();
		instructorManager.login();
		instructorManager.logOut();

		System.out.println("-----------------------------------------");

		StudentManager studentManager = new StudentManager();
		studentManager.uploadVideo();
		studentManager.UploadCourse();
		studentManager.updateCourse();
		studentManager.deleteCourse();
		studentManager.blockMember();
		studentManager.comment();
		studentManager.deleteComment();
		studentManager.editProfile();
		studentManager.register();
		studentManager.login();
		studentManager.logOut();

		System.out.println("-----------------------------------------");

		Student student1 = new Student();
		student1.setDateOfRegistration("11.02.2020");
		student1.setId(1);
		student1.setFirstName("Hilal");
		student1.setLastName("ÇINAR");
		student1.setEmail("hilalcinar@gmail.com");
		student1.setPassword("132323254");
		student1.setProfilePhoto("Profil Fotoðrafý Yüklendi");
		System.out.println(student1.getId() + " Numaralý Kullanýcýnýn Kodu : " + student1.getCode() + " Olarak Atanmýþtýr.");

		Student student2 = new Student();
		student2.setDateOfRegistration("14.03.2020");
		student2.setId(2);
		student2.setFirstName("Ferhat");
		student2.setLastName("Tek");
		student2.setEmail("ferhatek@gmail.com");
		student2.setPassword("654321");
		student2.setProfilePhoto("Profil Fotoðrafý Eklendi!");
		System.out.println(student2.getId() + " Numaralý Kullanýcýnýn Kodu : " + student2.getCode() + " Olarak Atanmýþtýr.");
		
		System.out.println("-----------------------------------------");

		Instructor instructor1 = new Instructor();
		instructor1.setPhoneNumber("05000000001");
		instructor1.setId(1);
		instructor1.setFirstName("Hilal");
		instructor1.setLastName("ÇINAR");
		instructor1.setEmail("hilalcinar@gmail.com");
		instructor1.setPassword("132323254");
		instructor1.setProfilePhoto("Profil Fotoðrafý Yüklendi");
		instructor1.setProfilePhoto("Açýklama Eklendi!");
		System.out.println(instructor1.getId() + " Numaralý Kullanýcýnýn Kodu : " + instructor1.getCode() + " Olarak Atanmýþtýr.");

		Instructor instructor2 = new Instructor();
		instructor2.setPhoneNumber("05000000002");
		instructor2.setId(2);
		instructor2.setFirstName("Ferhat");
		instructor2.setLastName("Tek");
		instructor2.setEmail("ferhatek@gmail.com");
		instructor2.setPassword("654321");
		instructor2.setProfilePhoto("Profil Fotoðrafý Eklendi!");
		instructor2.setProfilePhoto("Açýklama Eklendi!");
		System.out.println(instructor2.getId() + " Numaralý Kullanýcýnýn Kodu : " + instructor2.getCode() + " Olarak Atanmýþtýr.");
	}

}
