using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment1ClassLibrary
{
    public class CurrencyConverterClass
    {
        private const double AUD = 1.46740;
        private const double CNY = 7.1490;
        private const double EUR = 0.90620;
        private const double GBP = 0.811;
        private const double JPY = 106.90979;
        private double foreignCurrencyValue;
        private double usAmount;


        //Property Methods
        public double ForeignCurrencyValue
        {
            get { return foreignCurrencyValue; }
        }


        public double USAmount
        {
            set { usAmount = value; }
        }


        //Process Methods
        public void CurrencyConversion(string currSymbol)
        {
            switch (currSymbol)
            {
                case "AUD":
                    foreignCurrencyValue = usAmount * AUD;
                    break;
                case "CNY":
                    foreignCurrencyValue = usAmount * CNY;
                    break;
                case "EUR":
                    foreignCurrencyValue = usAmount * EUR;
                    break;
                case "GBP":
                    foreignCurrencyValue = usAmount * GBP;
                    break;
                case "JPY":
                    foreignCurrencyValue = usAmount * JPY;
                    break;
                default:
                    foreignCurrencyValue = 0;
                    break;

            }//end of switch
        }

        public CurrencyConverterClass() { }




    } //end of class
}
