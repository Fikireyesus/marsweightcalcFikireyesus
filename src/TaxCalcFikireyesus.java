import java.math.BigDecimal;

public class TaxCalcFikireyesus
{
    public static void main(String[] ags)
    {
        double priceWithoutVat =14.99;
        System.out.println("price without VAT: " + priceWithoutVat);
        double priceWithVat=priceWithoutVat*1.33;
        System.out.println("price with VAT" +  priceWithVat);
        double valueWithVat=priceWithVat*10000;
        System.out.println("value with VAT:" + valueWithVat);
        double priceWithOutVat2=valueWithVat/1.23;
        System.out.println("value with out VAT:" + priceWithOutVat2);
        //Using significant class
        System.out.println("");
        System.out.println("Same thing after using big decimal:");

        BigDecimal dbPriceWithoutVat=new BigDecimal("14.99 ");
        System.out.println("price with out VAT:" +dbPriceWithoutVat);
        BigDecimal dbPriceWithVat = dbPriceWithoutVat.multiply(new BigDecimal("1.33"));
        dbPriceWithVat =dbPriceWithVat.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Price with VAT rounded: " + dbPriceWithVat);
        BigDecimal dbValueWithVat = dbPriceWithVat.multiply(new BigDecimal(10000));
        System.out.println("value with VAT:" + dbValueWithVat);
        BigDecimal dbPriceWithoutVat2=dbPriceWithVat.divide(new BigDecimal("1.33"),BigDecimal.ROUND_HALF_EVEN);
        System.out.println("value with out VAT:"+ dbPriceWithoutVat2);

    }
}
