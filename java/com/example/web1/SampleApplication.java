package com.example.web1;

import com.example.web1.algo.controller.AlgoController;
import com.example.web1.phone.controller.PhoneController;
import com.example.web1.quiz.controller.Feb07Controller;
import com.example.web1.quiz.controller.QuizController;
import com.example.web1.student.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {

		SpringApplication.run(SampleApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		PhoneController phoneController = new PhoneController();
		QuizController quizController = new QuizController();
		StudentController studentController = new StudentController();
		AlgoController algoController = new AlgoController();
		while (true){
			String menu = "0.EXIT 1.PHONE 2.QUIZ 3.STUDENT 4.알고리즘";
			System.out.println("--[MAIN Menu]--"+menu);
			System.out.println("press Number : ");
			switch (scanner.nextInt()){
				case 0:
					System.out.println("0.EXIT");
					return;
				case 1:
					System.out.println("PHONE");
					phoneController.execute(scanner);
					break;
				case 2:
					System.out.println("QUIZ");
					quizController.execute(scanner);
					break;
				case 3:
					System.out.println("STUDENT");
					studentController.execute(scanner);
					break;
				case 4:
					System.out.println("알고리즘");
					algoController.execute(scanner);
					break;
				default:
					break;
			}

		}
	}
}
