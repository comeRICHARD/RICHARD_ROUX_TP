
package convertisseurobjet_roux_richard;

/**
 *
 * @author utilisateur
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur () {
        nbConversions = 0;
    }
    
    @Override
    public String toString() {
        return "nb de conversions " + nbConversions;
    }
    
    public double CelciusVersKelvin( double tempCelcius) {
        nbConversions = nbConversions + 1;
        double temp = tempCelcius+273.15f;
        return temp;
    }
    public double KelvinVersCelcius(double tempKelvin){
        nbConversions = nbConversions + 1;
        double temp = tempKelvin-273.15f;
        return temp;
    }
    public double FarenheitVersCelcius(double tempFarenheit){
        nbConversions = nbConversions + 1;
        double temp = (tempFarenheit-32)*5f/9;
        return temp;
    }
    public double CelciusVersFarenheit(double tempCelcius){
        nbConversions = nbConversions + 1;
        double temp = (tempCelcius*9f/5)+32;
        return temp;
    }
    public double FarenheitVersKelvin(double tempFarenheit){
        nbConversions = nbConversions + 1;
        double temp = ((tempFarenheit-32f)*5f/9)+273.15f;
        return temp;
    }
    public double KelvinVersFarenheit(double tempKelvin){
        nbConversions = nbConversions + 1;
        double temp = ((tempKelvin-273.15f)*9f/5)+32;
        return temp;
    }
    
    
}
