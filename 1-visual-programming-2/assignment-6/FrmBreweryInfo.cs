using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WebApiBusinessClassLibrary;

namespace WebApiUserInterface
{
    public partial class FrmBreweryInfo : Form
    {
        public FrmBreweryInfo()
        {
            InitializeComponent();
        }

        BreweryBL breweryBL = new BreweryBL();

        private void BtnGetData_Click(object sender, EventArgs e)
        {
            try
            {
                
                string brewType = txtBreweryType.Text;
                string state = txtState.Text;
                if (state.Length >= 1 && brewType.Length >= 1)
                {
                    List<Brewery> lstOfBreweries = breweryBL.GetListOfBreweriesByTypeAndState(brewType, state);
                    if (lstOfBreweries != null)
                    {
                        dgvBrewery.AutoSizeColumnsMode = DataGridViewAutoSizeColumnsMode.AllCells;
                        dgvBrewery.DataSource = lstOfBreweries;
                    }
                    else
                    {                        
                        MessageBox.Show("No Data Returned by API", "Warning", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    }
                }
                else
                {
                    MessageBox.Show("No Information was Entered. \nPlease Enter Data into Respective Textboxes", "Information", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
            }
            catch(Exception ex)
            {
                MessageBox.Show(ex.Message, ex.GetType().ToString(), MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
            finally
            {

            }
        }

        private void BtnExit_Click(object sender, EventArgs e)
        {
            this.Close();
            Application.Exit();
        }
    }
}
