package entity;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import validator.Validation;

public class Book extends Publication {
	private String isbn;
	private Set<String> author;
	private String publicationPlace;

	public Book() {
	}

	@Override
	public void display() {
		System.out.println("Book [" + this.getCommonInfo() + ", isbn=" + this.isbn + ", author=" + this.author
				+ ", publicationPlace=" + this.publicationPlace + "]");
	}

	@Override
	public void input(Scanner sc) {
		this.inputCommonInfo(sc);
		String inputIsbn = "";
		do {
			System.out.println("Nhap isbn:");
			inputIsbn = sc.nextLine();
			if (Validation.checkValidIsbn(inputIsbn)) {
				break;
			}
			System.out.println("Sai roi ban oi...");
		} while (true);
		this.isbn = inputIsbn;
		// Nhap author
		this.author = this.getAuthorList(sc);
		System.out.println("Nhap publicationPlace:");
		this.publicationPlace = sc.nextLine();
	}

	private Set<String> getAuthorList(Scanner sc) {
		Set<String> set = new HashSet<>();
		do {
			System.out.println("Nhap author:");
			set.add(sc.nextLine());
			System.out.println("Con nua khong? (Y/N)");
			if (!"y".equalsIgnoreCase(sc.nextLine())) {
				break;
			}
		} while (true);
		return set;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Set<String> getAuthor() {
		return author;
	}

	public void setAuthor(Set<String> author) {
		this.author = author;
	}

	public String getPublicationPlace() {
		return publicationPlace;
	}

	public void setPublicationPlace(String publicationPlace) {
		this.publicationPlace = publicationPlace;
	}
}
