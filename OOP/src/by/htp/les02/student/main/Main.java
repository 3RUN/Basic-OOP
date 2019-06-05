package by.htp.les02.student.main;

import by.htp.les02.student.entity.Student;
import by.htp.les02.student.logic.StudentLogic;

public class Main {

	public static void main(String[] args) {

		Student[] student = new Student[10];

		student[0] = new Student("Kuznetsova", "KAA", 2);
		student[0].setGrades(9, 10, 7, 9, 8);

		student[1] = new Student("Ivanov", "IRE", 1);
		student[1].setGrades(10, 9, 9, 9, 10);

		student[2] = new Student("Petrov", "PMI", 2);
		student[2].setGrades(9, 10, 9, 10, 9);

		student[3] = new Student("Kutuzov", "KMO", 3);
		student[3].setGrades(9, 10, 10, 10, 10);

		student[4] = new Student("Semenova", "SLA", 3);
		student[4].setGrades(3, 4, 6, 3, 8);

		student[5] = new Student("Bayramukova", "BAB", 1);
		student[5].setGrades(10, 10, 10, 10, 10);

		student[6] = new Student("Sarkisyan", "SVA", 2);
		student[6].setGrades(5, 9, 3, 3, 2);

		student[7] = new Student("Kochkarov", "KMR", 2);
		student[7].setGrades(9, 10, 9, 9, 10);

		student[8] = new Student("Dumanishev", "DJO", 1);
		student[8].setGrades(5, 7, 8, 5, 8);

		student[9] = new Student("Lisenko", "LAS", 3);
		student[9].setGrades(10, 8, 7, 9, 10);

		int i = 0;

		// display only students with 9 to 10 grades
		for (i = 0; i < 10; i++) {

			if (StudentLogic.getInfo(student[i], 9) != null) {
				System.out.println(StudentLogic.getInfo(student[i], 9));
			}

		}

	}

}
