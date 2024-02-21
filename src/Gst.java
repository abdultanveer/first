public class Gst extends IncomeTax{

    @Override
    public int calculateTax(int income) {
        int basic = super.calculateTax(income);
        int gst  = 500;
        return  basic  + gst;
    }
}
