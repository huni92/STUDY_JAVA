
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    public static List<Item> menuList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Cart cart = new Cart();

    public void mainMenu() {
        Cart cart = new Cart();
        System.out.println("1. 메뉴보기");
        System.out.println("2. 장바구니 보기");
        System.out.println("---------------");
        System.out.println("주문 : " + cart.getTotalPrice() + "원 " + "(" + Cart.getCartList().size() + "개)");
        System.out.println("5. 주문하기");
        System.out.println("---------------");
        System.out.println("0. 주문취소");
        System.out.print("번호를 입력해주세요 : ");
        int menuNum = sc.nextInt();
        switch(menuNum) {
            case 1 :
                foodMenu();
                break;
            case 2 :
                Car.checkCart();
                break;
            case 5 :
                orderConfirm();
                break;
            case 0 :
                orderCancle();
                break;
            default :
                System.out.println("번호를 잘못입력했습니다.");
                break;
        }
    }

    public void foodMenu() {
        Cart cart = new Cart();

        if(menuList.isEmpty()){
            menuList.add(new Item("불고기버거", 4000));
            menuList.add(new Item("새우버거", 4500));
            menuList.add(new Item("치킨버거", 5000));
            menuList.add(new Item("상하이버거", 7000));
            menuList.add(new Item("슈비버거", 9000));
        }

        for (Item item : menuList) {
            System.out.println(item.getNum() + ". " + item.getName() + " (" + item.getPrice() + "원)");
        }

        System.out.println("0. 돌아가기");

        cart.addCart();
    }

    public void orderConfirm() {
        if(Cart.getCartList().isEmpty()){
            System.out.println("장바구니가 비었습니다.");
            mainMenu();
        } else {
            System.out.println("주문이 완료되었습니다.");
        }
    }

    public void orderCancle() {
        Cart.getCartList().clear();
    }
}
