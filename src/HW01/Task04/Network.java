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

import java.util.HashSet;

public class Network {
    private HashSet<String> networkBase;

    public Network() {
        this.networkBase = new HashSet<String>();
    }

    public HashSet<String> getNetworkBase() {
        return networkBase;
    }

    public void setNetworkBase(HashSet<String> networkBase) {
        this.networkBase = networkBase;
    }

    @Override
    public String toString() {
        return "Network{" +
                "networkBase=" + networkBase +
                '}';
    }
}