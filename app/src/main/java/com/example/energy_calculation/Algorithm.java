package com.example.energy_calculation;

public class Algorithm {

    // создание поля для алгоритма (ускорение свободного падения)
    private double zemlya = 9.8;
    private double mars = 3.7;

    public final double SPEED_OF_LIGHT = zemlya / mars; // коэффициент

    // создание пустого конструктора
    public Algorithm() {
    }

    // метод вычисляющий абсолютную энергию по величине массы
    public double absoluteEnergyCalculation(String input) {

        /** Необходимо проверить корректность ввода массы тела, так как пользователь может ввести нецелое значение
         * Java понимает нецелые значения лишь с точкой, если пользователь введёт нецелое число с запятой, то возникнет ошибка
         * Данную ситуацию нужно отработать
         */
        // проверка корректности вводимого значения (с помощью метода contains(",") мы можем проверить есть ли в строке символ ",")
        if (input.contains(",")) { // если в вводимой строке есть запятая, то

            String inputMod = input.replace(",", "."); // то с помощью метода replace() мы поменяем её на точку

            // конвертирование входного значения из String в float с помощью метода Float.parseFloat()
            double inputDouble = Double.parseDouble(inputMod);

            // возврат вычисленного значения
            return (double) (inputDouble * 100 / SPEED_OF_LIGHT);

        } else {
            // конвертирование входного значения из String в float с помощью метода Long.parseLong()
            float inputDouble = Float.parseFloat(input);

            // возврат вычисленного значения
            return (double) (inputDouble * 100 / SPEED_OF_LIGHT);
        }
    }


}
