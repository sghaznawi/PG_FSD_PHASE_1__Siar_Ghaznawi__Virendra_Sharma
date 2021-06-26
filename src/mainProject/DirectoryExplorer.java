package mainProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("serial")
class duplicateFileException extends Exception {
	duplicateFileException(String exception) {
		super(exception);
	}
}

public class DirectoryExplorer {

	public static void main(String[] args) throws IOException {
		System.out.println(".......................Welcome to DiREcTORY EXpLORER.....................\n");
		System.out.println("Author: Siar Ghaznawi\n" + "Email: siar_wafa@hotmail.com");
		System.out.println("................................................................");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String dirAddress, fileName = null;
		int choice;
		File dir;

		do {
			System.out.println("Please type your root direcory");
			dirAddress = input.next();
			dir = new File(dirAddress);
		} while (dir.isDirectory() == false);
		do {
			System.out.println(".........................................................................");
			System.out.println("To choose from below options, please type number from 1 to 3.\n"
					+ "1: List all directories/files in the root directory\n" + "2: Operations on the root directory\n"
					+ "3: To exit the application");
			System.out.println(".........................................................................");

			choice = input.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Option 1 is selected");
				listDirectory(dirAddress);
				break;
			case 2:
				System.out.println("Option 2 is selected");
				int choicetwo;
				do {
					System.out.println("\t.........................................................................");
					System.out.println("\t1: Add a file to the existing directory list.\n"
							+ "\t2: Add a direcoty to the existing directory list.\n"
							+ "\t3: Delete a user specified file from the existing directory list\n"
							+ "\t4: Search for a file from the main directory\n" + "\t5: Return to the main menu\n");
					System.out.println("\t.........................................................................");
					choicetwo = input.nextInt();
					switch (choicetwo) {
					case 1:
						System.out.println("Please type name of a file you want to create");
						fileName = input.next();
						try {
							makeFile(dirAddress, fileName);
						} catch (duplicateFileException e) {
							e.printStackTrace();
						}
						break;

					case 2:
						System.out.println("Please type name of a directory you want to create");
						fileName = input.next();
						try {
							makeDirectory(dirAddress, fileName);
						} catch (duplicateFileException e) {
							e.printStackTrace();
						}
						break;

					case 3:
						System.out.println("Please type name of a file you want to delete");
						fileName = input.next();
						try {
							deleteFile(dirAddress, fileName);
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						}
						break;

					case 4:
						System.out.println("Please type name of the file you are looking for");
						fileName = input.next();
						searchFile(dirAddress, fileName);
						break;
					case 5:
						System.out.println("Main Menu");
						break;
					default:
						System.out.println("Option not in the list");
						break;
					}

				} while (choicetwo != 5);
				break;
			case 3:
				System.out.println("Option 3 is selected");
				System.out.println("Application ended");
				System.exit(1);
			default:
				System.out.println("Option not in the list");
			}
		} while (choice != 3);

	}

	static void listDirectory(String dirAddress) {
		File dir = new File(dirAddress);
		List<String> fileList = Arrays.asList(dir.list());
		Collections.sort(fileList);
		for (String file : fileList) {
			System.out.println(file);
		}
	}

	static void makeDirectory(String dirAddress, String fileName) throws duplicateFileException {
		File file = new File(dirAddress + fileName);
		if (file.exists()) {
			throw new duplicateFileException("Duplicate Directory Creation not allowed!");
		} else {
			file.mkdir();
			System.out.println("Directory successfully create at " + dirAddress + "\\" + fileName);
		}
	}

	static void makeFile(String dirAddress, String fileName) throws duplicateFileException {
		File file = new File(dirAddress + fileName);
		if (file.exists()) {
			throw new duplicateFileException("Duplicate File Creation not allowed!");
		} else 
			{ try {
				file.createNewFile();
				System.out.println("File successfully create at " + dirAddress + "\\" + fileName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static void deleteFile(String dirAddress, String fileName) throws FileNotFoundException {
		File file = new File(dirAddress + fileName);
		boolean result = file.delete();
		if (result == true) {
			System.out.println("Your file in " + dirAddress + "\\" + fileName + " was deleted");
		} else {
			throw new FileNotFoundException("File  not found");
		}
	}

	static void searchFile(String dirAddress, String fileName) throws FileNotFoundException {

		File dir = new File(dirAddress);
		List<String> listFile = Arrays.asList(dir.list());
		if (listFile.contains(fileName)) {
			System.out.println("File exists in the current [" + dirAddress + "] directory");
		} else {
			throw new FileNotFoundException("File was not found");
		}
	}
}
