using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WebApiDataAccessClassLibrary;

namespace WebApiBusinessClassLibrary
{
    public class BreweryBL
    {
        BreweryDA breweryDA = new BreweryDA();

        public List<Brewery> GetListOfBreweriesByTypeAndState(string brewType, string state)
        {
            try
            {
                var brewingCompanyRawData = breweryDA.RetrieveDataByTypeAndState(brewType, state);
                if (brewingCompanyRawData != "[]")
                {
                    try
                    {
                        List<Brewery> lstOfBreweries = JsonConvert.DeserializeObject<List<Brewery>>(brewingCompanyRawData);
                        return lstOfBreweries;
                    }
                    catch(JsonException jex)
                    {
                        string customMsg = "Received Data Not in JSON Format";
                        throw new Exception(customMsg + "\n\n" + jex.GetType().ToString());
                    }
                }
                else
                {
                    return null;
                }
            }
            catch(Exception ex)
            {
                throw ex;
            }
            finally
            {

            }
        }

        public BreweryBL() { }
    }
}
