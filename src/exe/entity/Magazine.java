package exe.entity;

import java.util.Scanner;

public class Magazine extends Publication {
	private String author;
	private int volumn;
	private int edition;

	public Magazine() {
	}

	@Override
	public void display() {
		System.out.println("Magazine [" + this.getCommonInfo() + ", author=" + this.author + ", volumn=" + this.volumn
				+ ", edition=" + this.edition + "]");
	}

	@Override
	public void input(Scanner sc) {
		this.inputCommonInfo(sc);
		System.out.println("Nhap author:");
		this.author = sc.nextLine();
		System.out.println("Nhap volumn:");
		this.volumn = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap edition:");
		this.edition = Integer.parseInt(sc.nextLine());
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}
}
