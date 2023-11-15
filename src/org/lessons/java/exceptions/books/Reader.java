package org.lessons.java.exceptions.books;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Reader {
	public static void main(String[] args) throws Exception {
		final File myFile = new File("D:\\studio\\studio\\eclipse\\java-exceptions-books\\books.txt");
		int booksCount = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Quanti libri vuoi inserire?");
		String numberBooks = in.nextLine();
		int intNumberBooks = Integer.parseInt(numberBooks);
		
		Book[] books = new Book[intNumberBooks];
		
		while(booksCount < intNumberBooks) {
			System.out.print("Inserisci il titolo: ");
			String title = in.nextLine();
			System.out.print("Inserisci il numero delle pagine: ");
			int pagesNumber = Integer.parseInt(in.nextLine());
			System.out.print("Inserisci l'autore: ");
			String author = in.nextLine();
			System.out.print("Inserisci l'editore: ");
			String publisher = in.nextLine();
			
			Book b = null;
			try {
				b = new Book(title, pagesNumber, author, publisher);
				books[booksCount++] = b;
				for(int x=0;x<books.length;x++) {
					if(books[x] == null) {
						break;
					}
					Book c = books[x];
					System.out.println(c);
					System.out.println("-----------------------");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}finally {
				in.close();
			}
			
			FileWriter myWriter = null;
			
			try {
				
				myWriter = new FileWriter(myFile);
				
				for (int x=0;x<books.length;x++) {
					
					Book y = books[x];
					
					myWriter.write(y.getTitle() + "\n");
					myWriter.write(y.getPagesNumber() + "\n");
					myWriter.write(y.getAuthor() + "\n");
					myWriter.write(y.getPublisher() + "\n");
				}
			} catch (Exception e) {
				
				System.out.println("Error writing file: " + e.getMessage());
			} finally {
				
				if (myWriter != null)
					try {
						myWriter.close();
					} catch (Exception e) { }
				
				Scanner reader = null;
				try {
					
					reader = new Scanner(myFile);
					
					while (reader.hasNextLine()) {
					   String data = reader.nextLine();
					   System.out.println(data);
					}
				} catch (FileNotFoundException e) {
					
					System.out.println("Error reading file: " + e.getMessage());
				} finally {
					
					if (reader != null)
						reader.close();
				}
			}	
			
		}
	}
}
