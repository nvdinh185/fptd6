package exe.entity;

import java.util.Date;
import java.util.Scanner;

import exe.common.DateUtil;

public abstract class Publication {
	private int publicationYear;
	private String publisher;
	private Date publicationDate;

	public Publication() {
	}

	public abstract void display();
	public abstract void input(Scanner sc);

	public String getCommonInfo() {
		return "publicationYear=" + this.publicationYear 
				+ ",publisher=" + this.publisher
				+ ",publicationDate=" + this.publicationDate;
	}
	public void inputCommonInfo(Scanner sc) {
		System.out.println("Nhap publicationYear:");
		this.publicationYear = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap publisher:");
		this.publisher = sc.nextLine();
		System.out.println("Nhap publicationYear:");
		this.publicationDate = DateUtil.convertStrToDate(sc.nextLine());
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

}
