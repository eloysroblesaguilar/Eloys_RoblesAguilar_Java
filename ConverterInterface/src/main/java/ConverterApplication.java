public class ConverterApplication {

    public static void main(String[] args) {
        ConverterIf ConIf = new ConverterIf();

        System.out.println(ConIf.convertDay(1));
        System.out.println(ConIf.convertMonth(1));

        ConverterSwitch ConSw = new ConverterSwitch();

        System.out.println(ConSw.convertDay(1));
        System.out.println(ConSw.convertMonth(1));
    }


}
