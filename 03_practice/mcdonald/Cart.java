import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart{
    private static List<Item> cartList = new ArrayList<Item>();
    private static int totalPrice;
    Kiosk kiosk = new Kiosk();
    Scanner sc = new Scanner(System.in);

    public static int getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(int totalPrice) {
        Cart.totalPrice = totalPrice;
    }

    public static List<Item> getCartList() {
        return cartList;
    }

    public static void setCartList(List<Item> cartList) {
        Cart.cartList = cartList;
    }

    public void addCart() {
        System.out.print("메뉴 번호를 입력하시면 장바구니에 담깁니다. 0번 입력 시 첫화면으로 돌아갑니다. : ");
        int addCartNum = sc.nextInt();

        if(addCartNum == 0){
            kiosk.mainMenu();
        } else {
            int menuNum = addCartNum - 1;
            cartList.add(Kiosk.menuList.get(menuNum));
            totalPrice += cartList.get(menuNum).getPrice();
            kiosk.foodMenu();
        }
    }

    public void checkCart() {
        for(Item item : cartList) {
            System.out.println(item.getNum() + ". " + item.getName() + "(" + item.getPrice() + ")");
        }
        System.out.println("삭제하실 메뉴는 번호를 눌러주세요\n" + "그게 아닌경우 0.돌아가기를 클릭해주세요");
        System.out.print("번호를 입력해주세요 : ");
        int cartNum = sc.nextInt();
        if(!cartList.isEmpty()){
            if(cartNum == 0){
                kiosk.mainMenu();
            } else {
                cartList.remove(cartNum - 1);
                for (int i = 0; i < cartList.size(); i++) {
                    totalPrice = cartList.get(i).getPrice();
                }
                checkCart();
            }
        } else {
            System.out.println("장바구니가 비어있습니다.");
        }
    }
}
