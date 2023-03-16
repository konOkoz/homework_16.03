import java.util.Scanner;

public class Main {
    /*
   1.Создать фабрику по производству пиццы.Фабрика должна уметь готовить три вида пиццы:
   Гавайи, Моцарелла, Салями
   2.Каждый вид пиццы должен уметь:подготавливаться(накладывать ингридиенты напр.)печься и упаковываться.
   В каждом случае должно быть понятно о какой пицце речь
   3.В классе мейн не должен создаваться новый обьект пиццы, а из него должен поступать заказ на изготовление требуемого
   вида пиццы в класc PizzaFactory, который и должен выбрать нужнюю пиццу для изготовления.
    */
    public static void main(String[] args) {
        System.out.println("We have 3 types of pizza for u 1.Hawaii , 2.Mozzarella , 3.Salami");
        System.out.println("Enter the number of the according pizza to order");
        PizzaFactory.factory();
    }

    public static int order(){
       Scanner sc = new Scanner(System.in);
       int choice = sc.nextInt();
       return choice;

        }
    }
