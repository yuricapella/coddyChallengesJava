public class IsLuckyYear {
    public static void main(String[] args) {
        int birthYear = 1980;
        int luckyNumber = 4;
        System.out.println(isLuckyYear(birthYear,luckyNumber));

        int birthYear2 = 1999;
        int luckyNumber2 = 7;
        System.out.println(isLuckyYear(birthYear2,luckyNumber2));


    }

    public static String isLuckyYear(int birthYear, int luckyNumber) {
        if(birthYear % luckyNumber == 0){
            return birthYear + " is a lucky year!";
        }else{
            return birthYear + " is not a lucky year.";
        }
    }
}
