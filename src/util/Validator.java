package util;

public class Validator {
    // Validate kiểu số nguyên
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Validate kiểu số thực float
    public static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Validate kiểu số thực double
    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Validate kiểu Boolean với giá trị nhập vào là true/false
    public static boolean isBoolean(String str) {
        return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false");
    }
    // Validate kiếu String, bắt buộc nhập (Không được empty, phải cắt bỏ khoảng trắng 2 đầu), có độ dài từ min đến max
    public static boolean isString(String str, int min, int max) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        str = str.trim();
        return str.length() >= min && str.length() <= max;
    }
    // Validate kiểu email, phải có định dạng email
    public static boolean isEmail(String str) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return str.matches(emailRegex);
    }
    //Validate kiểu phone, phải có định dạng số điện thoại di động Việt Nam
    public static boolean isPhone(String str) {
        String phoneRegex = "^(0[3|5|7|8|9])+([0-9]{8})$";
        return str.matches(phoneRegex);
    }
}
