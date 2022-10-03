package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entity.Book;
import entity.Magazine;
import entity.Publication;

public class PublicationManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Publication> list = new ArrayList<Publication>();
		do {
			boolean isCheck = false;
			System.out.println("Publication Management:");
			System.out.println("Choose:");
			System.out.println("_1: Add new book");
			System.out.println("_2: Add new magazine");
			System.out.println("_3: Display all publication with publication year and publisher:");
			System.out.println("_4: Add an author to a specific book:");
			System.out.println("_5: Display all publication:");
			System.out.println("_6: Exit!");
			int function = Integer.parseInt(sc.nextLine());
			switch (function) {
			case 1:
				Book book = new Book();
				book.input(sc);
				list.add(book);
				break;
			case 2:
				Magazine magazine = new Magazine();
				magazine.input(sc);
				list.add(magazine);
				break;
			case 3:
				displayByYearPublisher(sc, list);
				break;
			case 4:
				addBookAuthor(sc, list);
				break;
			case 5:
				displayAllPublication(list);
				break;
			default:
				isCheck = true;
				break;
			}
			if (isCheck) {
				break;
			}
		} while (true);
	}

	private static void addBookAuthor(Scanner sc, List<Publication> list) {
		System.out.println("Danh sach Book:");
		for (Publication publication : list) {
			if (publication instanceof Book) {
				publication.display();
			}
		}
		System.out.println("Chon isbn:");
		String isbn = sc.nextLine();
		System.out.println("Nhap author:");
		String author = sc.nextLine();
		for (Publication publication : list) {
			if (publication instanceof Book) {
				Book book = (Book) publication;
				if (isbn.equals(book.getIsbn())) {
					Set<String> set = book.getAuthor();
					if (set.contains(author)) {
						System.out.println("Author existed");
					} else {
						set.add(author);
						System.out.println("Add successfully");
					}
					break;
				}
			}
		}
	}

	private static void displayByYearPublisher(Scanner sc, List<Publication> list) {
		System.out.println("Nhap publication year:");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap publisher:");
		String publisher = sc.nextLine();

		for (Publication pub : list) {
			if (pub.getPublicationYear() == year && publisher.equals(pub.getPublisher())) {
				pub.display();
			}
		}
	}

	private static void displayAllPublication(List<Publication> list) {
		for (Publication pub : list) {
			pub.display();
		}
	}

}
