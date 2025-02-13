package easy.coddy_25_12_2024;

public class ConvertToBinaryCountOnes {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        System.out.println(convertToBinaryCountOnes(num1,num2));

        num1 = 0;
        num2 = 0;
        System.out.println(convertToBinaryCountOnes(num1,num2));

        num1 = 0;
        num2 = 1;
        System.out.println(convertToBinaryCountOnes(num1,num2));

    }
    public static int convertToBinaryCountOnes(int num1, int num2) {
        String num1ConvertedToBinary = convertToBinary(num1,num2);
        int count1 = 0;

        for(int i = 0; i < num1ConvertedToBinary.length();i++){
            if(num1ConvertedToBinary.charAt(i) == '1'){
                count1++;
            }
        }

        return count1;
    }
    public static String convertToBinary(int num1, int num2){
        String binaryNum1 = "";
        String binaryNum2 = "";

        for(int i = num1; i > 0;){
            binaryNum1 += i % 2;
            i = i / 2;
        }
        for(int j = num2;j > 0;){
            binaryNum2 += j % 2;
            j = j / 2;
        }

        if (binaryNum1.isEmpty()) {
            binaryNum1 = "0";
        }else if(binaryNum2.isEmpty()){
            binaryNum2 = "0";
        }
        return binaryNum1+binaryNum2;
    }
}
