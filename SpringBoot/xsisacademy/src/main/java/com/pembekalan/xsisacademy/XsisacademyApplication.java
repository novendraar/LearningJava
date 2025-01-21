package com.pembekalan.xsisacademy;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;
import com.pembekalan.xsisacademy.entity.Authors;
import com.pembekalan.xsisacademy.entity.Books;
import com.pembekalan.xsisacademy.entity.Category;
import com.pembekalan.xsisacademy.entity.Publisher;
import com.pembekalan.xsisacademy.entity.User;
import com.pembekalan.xsisacademy.repository.AuthorRepository;
import com.pembekalan.xsisacademy.repository.BooksRepository;
import com.pembekalan.xsisacademy.repository.CategoryRepository;
import com.pembekalan.xsisacademy.repository.PublisherRepository;
import com.pembekalan.xsisacademy.repository.UserRepository;

@SpringBootApplication
public class XsisacademyApplication {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	PublisherRepository publisherRepository;

	@Autowired
	AuthorRepository authorRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	BooksRepository booksRepository;

	public static void main(String[] args) {
		SpringApplication.run(XsisacademyApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			// Category thriller = new Category("Thriller");
			// Category novel = new Category("Novel");
			// Category horror = new Category("Horror");
			// Category romance = new Category("Romance");

			// categoryRepository.save(thriller);
			// categoryRepository.save(novel);
			// categoryRepository.save(horror);
			// categoryRepository.save(romance);

			Faker faker = new Faker(Locale.forLanguageTag("id"));

			Random random = new Random();

			for (int i = 0; i < 10; i++) {
				User userSeed = new User(faker.name().fullName(), faker.phoneNumber().phoneNumber(),
						faker.address().fullAddress());
				userRepository.save(userSeed);
			}

			for (int i = 0; i < 10; i++) {
				Publisher publisherSeed = new Publisher(faker.book().publisher(), faker.address().fullAddress());
				publisherRepository.save(publisherSeed);
			}

			for (int i = 0; i < 10; i++) {
				Authors authorSeed = new Authors(faker.name().fullName(), 1 + random.nextInt(10));
				authorRepository.save(authorSeed);
			}

			for (int i = 0; i < 5; i++) {
				Category categorySeed = new Category(faker.book().genre());
				categoryRepository.save(categorySeed);
			}

			for (int i = 0; i < 10; i++) {
				Integer randomYear = 1990 + random.nextInt(50);
				LocalDate randomDate = LocalDate.of(randomYear, 1, 1);

				Authors autorSeed = authorRepository.findById(1 + random.nextInt(10)).orElse(null);
				Category categorySeed = categoryRepository.findById(1 + random.nextInt(5)).orElse(null);
				Publisher pubisherSeed = publisherRepository.findById(1 + random.nextInt(10)).orElse(null);
				Books book = new Books(faker.book().title(), "Random Synopsis", 1 + random.nextInt(100), randomDate,
						autorSeed,
						categorySeed, pubisherSeed);
				booksRepository.save(book);

			}
		};
	}

}
