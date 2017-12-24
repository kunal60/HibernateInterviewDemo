Q1) ->This package focuses on Dirty Checking in Hibernate
->Classes Used : Main.java and Student_Info.java

In Main.java

Transaction transaction = (Transaction) session.beginTransaction();
		Student_Info entityObject = (Student_Info)session.get(Student_Info.class, 10);
		entityObject.setName("updated names");
		
		
	If you run the above code for the first time ,in the console you can see 2 queries:
	Hibernate: select student_in0_.roll_no as roll_no1_2_0_, student_in0_.full_name as full_name2_2_0_ from STUDENT_INFORMATION student_in0_ where student_in0_.roll_no=?
Hibernate: update STUDENT_INFORMATION set full_name=? where roll_no=?

But if you run the above code for the 2nd time with nothing changed,
only select query will be triggered and not the Update Query.


Reference: http://learningviacode.blogspot.in/2012/02/automatic-dirty-checking.html


Q2) This class focuses on Difference between save and persist method
Class -> MainSavePersistDemo.java

Reference : https://www.youtube.com/watch?v=d6rgXfBYxG8




	
