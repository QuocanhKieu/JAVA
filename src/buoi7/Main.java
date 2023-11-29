package buoi7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> listSV = new ArrayList<>();

        showMenu(listSV);




    }

    public static void showOption() {
        System.out.println("=== Menu ===");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id");
        System.out.println("3. Delete student by id");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void showMenu(ArrayList<SinhVien> listSV) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while(true) {


            showOption();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    addStudent(listSV);
                    // Add functionality for Option 1
                    break;
                case 2:
                    editStudentById(listSV);
                    // Add functionality for Option 2
                    break;
                case 3:
                    deleteStudentById(listSV);
                    // Add functionality for Option 3
                    break;
                case 4:
                    sortStudentByGpa(listSV);
                    break;
                case 5:
                    sortStudentByName(listSV);
                    break;
                case 6:
                    showStudent(listSV);
                    break;
                case 0:
                    scanner.close();
                    return;
                default:
                    System.out.println("Please enter a valid option (1-6)");
            }
            scanner.nextLine();// consume
            System.out.println("press any to continue.");
            scanner.nextLine();// wait
        }

    }
    static void addStudent(ArrayList<SinhVien> listSV) {
        Scanner scanner = new Scanner(System.in);

        int id = 0;
        String name = "";
        String dateOfBirth = "";

        String address = "";
        float gpa = 0.0f;
        boolean isSvExist = false;

        System.out.println("Enter Id, Name, DateOfBirth, Address, Gpa");
        System.out.println("Enter at least one value for student creation ");

        do {
            isSvExist = false;
            System.out.println("Enter Id");
            id = scanner.nextInt();
            scanner.nextLine();

            for (SinhVien aSv : listSV) {
                if(aSv.id == id) {
                System.out.println("id already exists, Enter Id again");
                isSvExist = true;
                break;
            }
        }
       }while (isSvExist);
        System.out.println("Enter Name");
        name = scanner.nextLine ();

        System.out.println("Enter DateOfBirth");
        dateOfBirth = scanner.nextLine();

        System.out.println("Enter Address");
        address = scanner.nextLine();
        System.out.println("Enter Gpa");
        gpa = scanner.nextFloat();
        scanner.nextLine();
        SinhVien newSv = new SinhVien(id, name, dateOfBirth, address, gpa);
        listSV.add(newSv);
    }
    static void editStudentById(ArrayList<SinhVien> listSV) {
        Scanner scanner = new Scanner(System.in);

        int id = 0;
        boolean isIdExist =false;
        SinhVien foundSV = new SinhVien();

        System.out.println("Enter Id to Edit Student");
        id = scanner.nextInt();
        scanner.nextLine();// consume

        for (SinhVien aSV : listSV) {
            if(aSV.id == id) {
                isIdExist = true;
                foundSV = aSV;
                break;
            }
        }
        if(isIdExist) {
            System.out.println("Enter Name");
            foundSV.setName(scanner.nextLine());

            System.out.println("Enter DateOfBirth");
            foundSV.setDateOfBirth(scanner.nextLine());

            System.out.println("Enter Address");
            foundSV.setAddress(scanner.nextLine());

            System.out.println("Enter Gpa");
            foundSV.setGpa(scanner.nextFloat());
            scanner.nextLine();// consume
        }

    }
    static void deleteStudentById(ArrayList<SinhVien> listSV) {
        Scanner scanner = new Scanner(System.in);
        int id;
        System.out.println("Enter Id to Delete Student");
        id = scanner.nextInt();
        for (SinhVien aSV : listSV) {
            if(aSV.id == id) {
                listSV.remove(aSV);
                break;
            }
        }
    }
    static void sortStudentByGpa(ArrayList<SinhVien> listSV) {
        listSV.sort((sv1, sv2) -> Float.compare(sv1.getGpa(), sv2.getGpa()));

    }
    static void  sortStudentByName(ArrayList<SinhVien> listSV) {
        listSV.sort((sv1, sv2) -> sv1.getName().compareTo(sv2.getName()));
        return;
    }
    static void showStudent(ArrayList<SinhVien> listSV){
        System.out.println("6 entered");
        for (SinhVien element : listSV) {
            System.out.println(element.getName() + element.getId() + element.getAddress()+ element.getDateOfBirth() + element.getGpa());
        }

    }
}
