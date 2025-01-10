public class CheckPicnicBasket {
    public static void main(String[] args) {

        String[] basket = {null};
        System.out.println(checkPicnicBasket(basket));

        String[] basket2 = {"sandwich"};
        System.out.println(checkPicnicBasket(basket2));

        String[] basket3 = {"blanket"};
        System.out.println(checkPicnicBasket(basket3));

        String[] basket4 = {"apple"};
        System.out.println(checkPicnicBasket(basket4));

        String[] basket5 = {"sandwich", "blanket"};
        System.out.println(checkPicnicBasket(basket5));

        String[] basket6 = {"sandwich", "apple"};
        System.out.println(checkPicnicBasket(basket6));

        String[] basket7 = {"sandwich", "blanket","apple"};
        System.out.println(checkPicnicBasket(basket7));

        String[] basket8 = {"sandwich", "blanket","apple", "chips", "cookies","juice"};
        System.out.println(checkPicnicBasket(basket8));

    }

    public static String checkPicnicBasket(String[] basket) {
        boolean temSandwich = false;
        boolean temBlanket = false;
        boolean temSnackOuDrink = false;

        for (int i = 0; i < basket.length; i++) {
            if(basket[i] == null){
                return "sandwich";
            }else if(basket[i].equals("sandwich")){
                temSandwich = true;
            }else if(basket[i].equals("blanket")){
                temBlanket = true;
            }else if(basket[i].equals("apple") || basket[i].equals("chips") || basket[i].equals("cookies") || basket[i].equals("juice")){
                temSnackOuDrink = true;
            }
        }
        if(temSandwich && !temBlanket){
            return "blanket";
        } else if (!temSandwich && temBlanket) {
            return "sandwich";
        } else if (temSandwich && temBlanket && !temSnackOuDrink){
            return "snack or drink";
        }else if(!temSandwich && !temBlanket && temSnackOuDrink){
            return "sandwich";
        }else if (temSandwich && temBlanket && temSnackOuDrink) {
            return "The picnic basket is complete!";
        }
        return "sandwich";
    }
}
