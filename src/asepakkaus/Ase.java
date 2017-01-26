package asepakkaus;

import java.util.List;

/**
 * @author HELIL
 */
public abstract class Ase {
    
    protected double aseenSuuntaAsteina;
    protected double rivi;
    protected double sarake;   
    
    public double getAseenSuuntaAsteina() {
        return aseenSuuntaAsteina;
    }

    public void setAseenSuuntaAsteina(double aseenSuuntaAsteina) {
        this.aseenSuuntaAsteina = aseenSuuntaAsteina;
    }

    public void kaanna(double muutosAsteina) {
        this.aseenSuuntaAsteina+=muutosAsteina;
    }

    public double getRivi() {
        return rivi;
    }

    public void setRivi(double rivi) {
        this.rivi = rivi;
    }

    public double getSarake() {
        return sarake;
    }

    public void setSarake(double sarake) {
        this.sarake = sarake;
    }
    
    public abstract List<Ammus> getAmmukset();       
}
