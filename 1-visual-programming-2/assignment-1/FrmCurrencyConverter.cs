using Assignment1ClassLibrary;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Assignment1UserInterface
{
    public partial class FrmCurrencyConverter : Form
    {

        CurrencyConverterClass aCurrencyConversion = new CurrencyConverterClass();

        public FrmCurrencyConverter()
        {
            InitializeComponent();
        }

        private void BtnExitApplication_Click(object sender, EventArgs e)
        {
            this.Close();
            Application.Exit();
        }

        private void BtnClear_Click(object sender, EventArgs e)
        {
            txtUSAmount.Text = string.Empty;
            lblCurrencyResult.Text = string.Empty;
            txtUSAmount.Focus();
        }

        private void PerformCurrencyConversionBasedOnButtonClicked(object sender, EventArgs e)
        {
            double userEnteredAmount = 0;

            try
            {
                userEnteredAmount = Convert.ToDouble(txtUSAmount.Text);

                aCurrencyConversion.USAmount = userEnteredAmount;
                Button btnClicked = (Button)sender;
                string currSymbol = btnClicked.Text;
                aCurrencyConversion.CurrencyConversion(currSymbol);

                lblCurrencyResult.Text = "US $" + txtUSAmount.Text + " is equal to " + btnClicked.Text + " " + aCurrencyConversion.ForeignCurrencyValue.ToString("n2");
            }
            catch
            {
                MessageBox.Show("US Amount must be a double", "Data Validation Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }


            
        }
    }
}
