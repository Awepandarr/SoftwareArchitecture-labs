class AddCalculator {
    private int aValue;
    private int bValue;

    public AddCalculator() {
        this.aValue = 1;
        this.bValue = 1;
    }
    /**
     * @param number1 the first number
     * @param number2 the second number
     * @return the sum of number 1 and  number 2 if number 1 is less than 6, otherwise 0
     */
    public int addOne(int number1, int number2) {
        if (number1 < 6) {
            return number1 + number2;
        }
        return 0;
    }

    /**
     * @param number the number to increment by one
     * @param times  the number of times it increments
     * @return the incremented number
     */

    public int addTwo(int number, int times) {
        for (int i = 0; i < times; i++) {
            number += 1;
        }
        return number;
    }


    public int getAValue() {
        return aValue;
    }

    public void setAValue(int aValue) {
        this.aValue = aValue;
    }

    public int getBValue() {
        return bValue;
    }

    public void setBValue(int bValue) {
        this.bValue = bValue;
    }
}

