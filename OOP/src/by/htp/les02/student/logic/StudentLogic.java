package by.htp.les02.student.logic;

import by.htp.les02.student.entity.Student;

public class StudentLogic {

	public static boolean isCheckGrades(Student student, int grade) {

		int[] marks = student.getMarks();

		int i = 0;

		for (i = 0; i < 5; i++) {

			// don't allow to continue
			// if our student has grade smaller than the given ones
			if (marks[i] < grade) {
				return false;
			}

		}

		return true;

	}

	public static String getInfo(Student student, int grade) {

		if (isCheckGrades(student, grade)) {
			return ("Student's surname is " + student.getSurname() + " / " + student.getInitials()
					+ " and his group is " + student.getGroup());
		}

		return null;

	}

}
