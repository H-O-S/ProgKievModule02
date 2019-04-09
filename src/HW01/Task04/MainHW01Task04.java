/**
 * Java OOP. Home Work 01.
 *
 * @author Oleg Khrulov
 * @version dated 09.04.2019
 */

/*
        Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
        класс Network (сеть мобильного оператора). Телефон должен иметь метод
        регистрации в сети мобильного оператора. Также у телефона должен быть метод call
        (номер другого телефона), который переберет все телефоны, зарегистрированные в
        сети. Если такой номер будет найден, то осуществить вызов, если нет - вывести
        сообщение об ошибочности набранного номера.
*/

package HW01.Task04;

public class MainHW01Task04 {

    public static void main(String[] args) {
        Network network = new Network();
        String otherNumber = "+380503332212";

        Phone phoneMy = new Phone("+380505552211");
        Phone phoneFriend = new Phone("+380503332211");
        phoneMy.registerTheNumberInTheNetwork(phoneMy.getNumberPhone(), network);
        phoneFriend.registerTheNumberInTheNetwork(phoneFriend.getNumberPhone(), network);

        System.out.printf(phoneMy.callTheNumber(phoneFriend.getNumberPhone(), network), phoneFriend.getNumberPhone());
        System.out.printf(phoneMy.callTheNumber(otherNumber, network), otherNumber);

        System.out.println(network);
    }
}