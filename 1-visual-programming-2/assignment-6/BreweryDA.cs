using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace WebApiDataAccessClassLibrary
{
    public class BreweryDA
    {
        public string RetrieveDataByTypeAndState(string brewType, string state)
        {
            try
            {
                string brewTypeLowerCase = brewType.ToLower();
                string stateLowerCase = state.ToLower();
                string url = "https://api.openbrewerydb.org/breweries?by_type=" + brewTypeLowerCase + "&by_state=" + stateLowerCase;
                var webClient = new WebClient();
                var brewingCompanyRawData = webClient.DownloadString(url);
                return brewingCompanyRawData;
            }
            catch(JsonException jsonex)
            {
                throw jsonex;
            }
            catch(WebException wex)
            {
                string customMSG = string.Empty;
                string status = (wex.Response as HttpWebResponse)?.StatusCode.ToString() ?? wex.Status.ToString();
                switch (status)
                {
                    case "NotFound":
                        {
                            customMSG = "Resource you are looking for is not available - either the directory is missing or the file is missing. Please check your URL Entry";
                            break;
                        }               
                }
                throw new Exception(customMSG + "\n\n" + wex.Message);
            }
            catch(Exception ex)
            {
                throw ex;
            }
            finally
            {

            }
        }
    }
}
