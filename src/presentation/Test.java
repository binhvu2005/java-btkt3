package presentation;

import util.Validator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("***********************MENU***********************");
            System.out.println("1. Validate kiểu số nguyên");
            System.out.println("2. Validate kiểu số thực float");
            System.out.println("3. Validate kiểu số thực double");
            System.out.println("4. Validate kiểu Boolean với giá trị nhập vào là true/false");
            System.out.println("5. Validate kiếu String, bắt buộc nhập (Không được empty, phải cắt bỏ khoảng trắng 2 đầu), có độ dài từ min đến max");
            System.out.println("6. Validate kiểu email, phải có định dạng email");
            System.out.println("7. Validate kiểu phone, phải có định dạng số điện thoại di động Việt Nam");
            System.out.println("8. Thoát");
            System.out.println("***************************************************");
            System.out.print("Nhập lựa chọn của bạn: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Nhập số nguyên: ");
                    String intInput = scanner.nextLine();
                    if (Validator.isInteger(intInput)) {
                        System.out.println(intInput + " là số nguyên hợp lệ.");
                    } else {
                        System.out.println(intInput + " không phải là số nguyên hợp lệ.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập số thực float: ");
                    String floatInput = scanner.nextLine();
                    if (Validator.isFloat(floatInput)) {
                        System.out.println(floatInput + " là số thực float hợp lệ.");
                    } else {
                        System.out.println(floatInput + " không phải là số thực float hợp lệ.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập số thực double: ");
                    String doubleInput = scanner.nextLine();
                    if (Validator.isDouble(doubleInput)) {
                        System.out.println(doubleInput + " là số thực double hợp lệ.");
                    } else {
                        System.out.println(doubleInput + " không phải là số thực double hợp lệ.");
                    }
                    break;
                case 4:
                    System.out.print("Nhập giá trị Boolean (true/false): ");
                    String booleanInput = scanner.nextLine();
                    if (Validator.isBoolean(booleanInput)) {
                        System.out.println(booleanInput + " là giá trị Boolean hợp lệ.");
                    } else {
                        System.out.println(booleanInput + " không phải là giá trị Boolean hợp lệ.");
                    }
                    break;
                case 5:
                    System.out.print("Nhập chuỗi (tối thiểu 3 ký tự, tối đa 10 ký tự): ");
                    String stringInput = scanner.nextLine();
                    if (Validator.isString(stringInput, 3, 10)) {
                        System.out.println(stringInput + " là chuỗi hợp lệ.");
                    } else {
                        System.out.println(stringInput + " không phải là chuỗi hợp lệ.");
                    }
                    break;
                case 6:
                    System.out.print("Nhập địa chỉ email: ");
                    String emailInput = scanner.nextLine();
                    if (Validator.isEmail(emailInput)) {
                        System.out.println(emailInput + " là địa chỉ email hợp lệ.");
                    } else {
                        System.out.println(emailInput + " không phải là địa chỉ email hợp lệ.");
                    }
                    break;
                case 7:
                    System.out.print("Nhập số điện thoại: ");
                    String phoneInput = scanner.nextLine();
                    if (Validator.isPhone(phoneInput)) {
                        System.out.println(phoneInput + " là số điện thoại hợp lệ.");
                    } else {
                        System.out.println(phoneInput + " không phải là số điện thoại hợp lệ.");
                    }
                    break;
                case 8:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }while(choice != 8);
    }
}
