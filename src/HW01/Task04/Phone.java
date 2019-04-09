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

public class Phone {
    private String numberPhone;
    private boolean registeredOnTheNetwork;

    public Phone(String numberPhone) {
        this.numberPhone = numberPhone;
        this.registeredOnTheNetwork = false;
//        registerTheNumberInTheNetwork (getNumberPhone());
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public boolean isRegisteredOnTheNetwork() {
        return registeredOnTheNetwork;
    }

    public void setRegisteredOnTheNetwork(boolean registeredOnTheNetwork) {
        this.registeredOnTheNetwork = registeredOnTheNetwork;
    }

    public boolean registerTheNumberInTheNetwork (String numberPhone, Network network){
        for (String number : network.getNetworkBase()) {
         if (numberPhone.equals(number)){
             setRegisteredOnTheNetwork(true);
             return registeredOnTheNetwork;
         }
        }
        network.getNetworkBase().add(numberPhone);

        return registeredOnTheNetwork;
    }

    public String callTheNumber(String numberPhone, Network network){
        for (String number : network.getNetworkBase()) {
            if (numberPhone.equals(number)){
                return "%s%nThe call to the specified number is made%n%n";
            }
        }

        return "%s%nMistake! %nThe specified number is not registered on the network.%n%n";
    }
}