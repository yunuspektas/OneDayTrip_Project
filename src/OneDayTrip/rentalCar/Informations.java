package rentalCar;

public class Informations {
    private String marka;
    private String model;
    private String vites;
    private String motorGucu;
    private int yil;
    private int fiyat;

    public Informations(String marka, String model, String vites, String motorGucu, int yil) {
        this.marka = marka;
        this.model = model;
        this.vites = vites;
        this.motorGucu = motorGucu;
        this.yil = yil;
    }

    public Informations(String marka, String model, String vites, String motorGucu, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.vites = vites;
        this.motorGucu = motorGucu;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public String getMotorGucu() {
        return motorGucu;
    }

    public void setMotorGucu(String motorGucu) {
        this.motorGucu = motorGucu;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return
                "marka = '" + marka + '\'' +
                ", model = '" + model + '\'' +
                ", vites = '" + vites + '\'' +
                ", motorGucu = '" + motorGucu + '\'' +
                ", yil = " + yil
                ;
    }
}
