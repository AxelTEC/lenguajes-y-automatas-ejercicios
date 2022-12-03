public class CreditCard {
  
    boolean checkLuhn(String cardNo){
        int nDigits = cardNo.length();
    
        int nSum = 0;
        boolean isSecond = false;
        for (int i = nDigits - 1; i >= 0; i--)
        {
    
            int d = cardNo.charAt(i) - '0';
    
            if (isSecond == true)
                d = d * 2;
    
            nSum += d / 10;
            nSum += d % 10;
    
            isSecond = !isSecond;
        }
        return (nSum % 10 == 0);
    }
    public String getType(String card) {
        int n = Integer.parseInt(card.substring(0,2));
        if(n>=51&&n<=55 ){
            return "MasterCard";
        }else if((card.charAt(0) == '4')) return "Visa      ";

        return "otro        ";
    }
}
