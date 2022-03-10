public class MarsWeightCalFikireyesus{
    public static void main(String[]args){
        float earthWeight;
        float marsWeight;
        double  marsWeightInDouble;
        int marsWeightInInt;

        earthWeight=84;
        marsWeight =(earthWeight *0.38F);
        System.out.println(earthWeight + "kg on Earth is " + "kg on Mars");
        //
        marsWeightInDouble=marsWeight;
        System.out.println("Kilo on mars on Mars after converting to double" + marsWeightInDouble);
        //
        System.out.printf("kilograms on Mars displayed to four decimal places: %.4f %n",marsWeightInDouble);
        //
        marsWeightInInt = (int)marsWeightInDouble;
        System.out.println("Kilograms on Mars when casted to integer " + marsWeightInInt);
        // 
        char c=(char)marsWeightInInt;
        System.out.println("The ASCII table equivalent of marsWeightInInt is:" +c);
        //
        int exampleOfMathOnChar=c*c;
        System.out.println("An example of a mathematical operation on the char type:" + exampleOfMathOnChar);
        
    }
}
