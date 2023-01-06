public class Task2 {
    Integer[] array;
    Integer division;
    Integer position;
    Errors check = Errors.NOErrors;

    public Task2(Integer[] intArray, Integer pos, Integer div) {
        this.array = intArray;
        this.division = div;
        this.position = pos;
    }

    public void Task2() {
        check = new CheckArrayForNull().CheckArrayForNull(array);
        if (check.equals(Errors.NOErrors)) {
            if (array.length >= position) {
                if (array[position] == null) {
                    System.out.println(Errors.ERR1003 + " - элемент массива равен null");
                } else {
                    try {
                        double catchedRes1 = array[position] / division;
                        System.out.println("Result = " + catchedRes1);
                    } catch (ArithmeticException e) {
                        System.out.println(Errors.ERR1004 + "- деление на ноль не возможно");
                    }
                }
            } else {
                System.out.println(Errors.ERR1002 + " - неверная длинна массива");
            }
        } else {
            System.out.println(Errors.ERR1001 + " - массив равен NULL");
        }
    }
}