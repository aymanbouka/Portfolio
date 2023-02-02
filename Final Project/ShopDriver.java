public class ShopDriver
{
        public static void main(String[] args)
        {
            System.out.println("000StartShop000");

            Shop aShop = new Shop();
            Menu aMenu = new Menu();
            System.out.println(aShop);

            System.out.println(Shop.banner);
            System.out.println("Hello there I am: " + Owner.firstName + "!");
            System.out.println("Welcome to " + Shop.name);
            //System.out.println(Shop.id);
           // System.out.println(Shop.)

            System.out.println(" 000EndShop000");
        }


}