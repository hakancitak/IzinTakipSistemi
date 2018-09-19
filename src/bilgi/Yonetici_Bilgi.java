
package bilgi;

public class Yonetici_Bilgi {
    private String yAd;
    private String ySoyad;
    private String ytcKimlik;
    private String ydogumT;
    private String ycinsiyet;
    private String ykad;
    private String ysifre;
    private String ysehir;
    
    public Yonetici_Bilgi(){
    
    }
    
    public void yoneticiOlustur(String yAd,String ySoyad,String ytcKimlik,String ydogum,String ycinsiyet,String ykad,String ysifre,String ysehir){
        this.yAd=yAd;
        this.ySoyad=ySoyad;
        this.ytcKimlik=ytcKimlik;
        this.ydogumT=ydogum;
        this.ycinsiyet=ycinsiyet;
        this.ykad=ykad;
        this.ysifre=ysifre;
        this.ysehir=ysehir;
    }
    

    /**
     * @return the yAd
     */
    public String getyAd() {
        return yAd;
    }

    /**
     * @param yAd the yAd to set
     */
    public void setyAd(String yAd) {
        this.yAd = yAd;
    }

    /**
     * @return the ySoyad
     */
    public String getySoyad() {
        return ySoyad;
    }

    /**
     * @param ySoyad the ySoyad to set
     */
    public void setySoyad(String ySoyad) {
        this.ySoyad = ySoyad;
    }

    /**
     * @return the ytcKimlik
     */
    public String getYtcKimlik() {
        return ytcKimlik;
    }

    /**
     * @param ytcKimlik the ytcKimlik to set
     */
    public void setYtcKimlik(String ytcKimlik) {
        this.ytcKimlik = ytcKimlik;
    }

    /**
     * @return the ydogumT
     */
    public String getYdogumT() {
        return ydogumT;
    }

    /**
     * @param ydogumT the ydogumT to set
     */
    public void setYdogumT(String ydogumT) {
        this.ydogumT = ydogumT;
    }

    /**
     * @return the ycinsiyet
     */
    public String getYcinsiyet() {
        return ycinsiyet;
    }

    /**
     * @param ycinsiyet the ycinsiyet to set
     */
    public void setYcinsiyet(String ycinsiyet) {
        this.ycinsiyet = ycinsiyet;
    }

    /**
     * @return the ykad
     */
    public String getYkad() {
        return ykad;
    }

    /**
     * @param ykad the ykad to set
     */
    public void setYkad(String ykad) {
        this.ykad = ykad;
    }

    /**
     * @return the ysifre
     */
    public String getYsifre() {
        return ysifre;
    }

    /**
     * @param ysifre the ysifre to set
     */
    public void setYsifre(String ysifre) {
        this.ysifre = ysifre;
    }

    /**
     * @return the ysehir
     */
    public String getYsehir() {
        return ysehir;
    }

    /**
     * @param ysehir the ysehir to set
     */
    public void setYsehir(String ysehir) {
        this.ysehir = ysehir;
    }
}
