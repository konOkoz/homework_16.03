public class PizzaFactory {
    public static void factory() {


        int choice = Main.order();
        switch(choice){
            case 1:
            Pizza hawaii = new Hawaii();
            hawaii.makingPizza();
            break;
            case 2:
                Pizza mozzarella = new Mozzarella();
                mozzarella.makingPizza();
                break;
            case 3:
                Pizza salami = new Salami();
                salami.makingPizza();
                break;
            default:
                System.out.println("Sorry but this type of pizza is not exist in our menu");
        }
    }
}
