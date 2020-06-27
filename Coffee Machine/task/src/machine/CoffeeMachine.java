package machine;

import javax.print.attribute.standard.Media;
import javax.swing.undo.CannotUndoException;
import java.util.Scanner;

enum CoffeeMachineStates {

    MENU,
    BUY,
    FILL,
    WATER,
    BEANS,
    MILK,
    CUPS,
    REMAINING,
    TAKE,
    EXIT;
}


public class CoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine();
        CoffeeMachineStates state = cm.getCurrentState();
        Scanner scanner = new Scanner(System.in);

        while (state != CoffeeMachineStates.EXIT) {
            if (state == CoffeeMachineStates.MENU) {
                System.out.println("Write action (buy, fill, take, remaining, exit):");
            }
            String action = scanner.nextLine().toUpperCase();
            state = cm.readAction(action);
        }
    }

    private CoffeeMachineStates currentState = CoffeeMachineStates.MENU;
    private int money = 550;
    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cups = 9;

    public CoffeeMachineStates getCurrentState() {
        return this.currentState;
    }

    public CoffeeMachineStates readAction(String action) {
        switch (currentState) {
            case BUY:
                buy(action);
                break;
            case EXIT:
                this.currentState = CoffeeMachineStates.EXIT;
            case FILL:
                fill();
                break;
            case WATER:
                water(action);
                break;
            case MILK:
                milk(action);
                break;
            case BEANS:
                beans(action);
                break;
            case CUPS:
                cups(action);
                break;
            case MENU:
                this.currentState = CoffeeMachineStates.valueOf(action);
                menu();
                break;
            case TAKE:
                take();
                break;
            case REMAINING:
                remaining();
                break;
            default:
        }
        return this.currentState;
    }

    private void water(String action) {
        int add = Integer.parseInt(action);
        water += add;
        System.out.println("Write how many ml of milk do you want to add:");
        currentState = CoffeeMachineStates.MILK;
    }

    private void milk(String action) {
        int add = Integer.parseInt(action);
        milk += add;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        currentState = CoffeeMachineStates.BEANS;

    }

    private void beans(String action) {
        int add = Integer.parseInt(action);
        coffeeBeans += add;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        currentState = CoffeeMachineStates.CUPS;

    }

    private void cups(String action) {
        int add = Integer.parseInt(action);
        cups += add;
        currentState = CoffeeMachineStates.MENU;

    }

    private void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        currentState = CoffeeMachineStates.WATER;
    }

    private void take() {
        System.out.println("I gave you $" + money);
        money -= money;
        currentState = CoffeeMachineStates.MENU;
    }

    private void remaining() {
        System.out.println("The coffee machine has:\n" + water +
                " of water\n" + milk + " of milk\n" +
                coffeeBeans + " of coffee beans\n" + cups + " of disposable cups\n" +
                money + " of money");
        currentState = CoffeeMachineStates.MENU;
    }

    private void menu() {
        switch (currentState) {
            case BUY:
                System.out.println("What do you want to buy? 1 - espresso, " +
                        "2 - latte, 3 - cappuccino, back - to main menu: :");
                break;
            case EXIT:
                this.currentState = CoffeeMachineStates.EXIT;
                break;
            case FILL:
                fill();
                break;
            case TAKE:
                take();
                break;
            case REMAINING:
                remaining();
                break;

        }
    }

    private void buy(String action) {
        switch (action) {
            case "1":
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    currentState = CoffeeMachineStates.MENU;
                    break;
                } else if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    currentState = CoffeeMachineStates.MENU;
                    break;
                } else if (cups <= 0) {
                    System.out.println("Sorry, not enough cups!");
                    currentState = CoffeeMachineStates.MENU;
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    coffeeBeans -= 16;
                    cups -= 1;
                    money += 4;
                    currentState = CoffeeMachineStates.MENU;
                    break;
                }
            case "2":
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    currentState = CoffeeMachineStates.MENU;
                    break;
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough coffee milk!");
                    currentState = CoffeeMachineStates.MENU;
                    break;
                } else if (coffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    currentState = CoffeeMachineStates.MENU;
                    break;
                } else if (cups <= 0) {
                    System.out.println("Sorry, not enough cups!");
                    currentState = CoffeeMachineStates.MENU;
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    cups -= 1;
                    money += 7;
                    currentState = CoffeeMachineStates.MENU;
                    break;
                }
            case "3":
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                    currentState = CoffeeMachineStates.MENU;
                    break;
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough coffee milk!");
                    currentState = CoffeeMachineStates.MENU;
                    break;
                } else if (coffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    currentState = CoffeeMachineStates.MENU;
                    break;
                } else if (cups <= 0) {
                    System.out.println("Sorry, not enough cups!");
                    currentState = CoffeeMachineStates.MENU;
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    cups -= 1;
                    money += 6;
                    currentState = CoffeeMachineStates.MENU;
                    break;
                }
            case "BACK":
                currentState = CoffeeMachineStates.MENU;
        }
    }
}
