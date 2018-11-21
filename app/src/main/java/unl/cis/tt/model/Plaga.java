package unl.cis.tt.model;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Plaga extends RealmObject {
    @PrimaryKey
    private int idPlaga;
    private String nombrePlaga;
    private String tipoDePlaga;
    private String descripcionPlaga;
    private String controlPlaga;

    /*public Plaga(String nombrePlaga, String tipoDePlaga, String descripcionPlaga, String controlPlaga) {
        this.nombrePlaga = nombrePlaga;
        this.tipoDePlaga = tipoDePlaga;
        this.descripcionPlaga = descripcionPlaga;
        this.controlPlaga = controlPlaga;
    }*/

    public String getNombrePlaga() {
        return nombrePlaga;
    }

    public void setNombrePlaga(String nombrePlaga) {
        this.nombrePlaga = nombrePlaga;
    }

    public String getTipoDePlaga() {
        return tipoDePlaga;
    }

    public void setTipoDePlaga(String tipoDePlaga) {
        this.tipoDePlaga = tipoDePlaga;
    }

    public String getDescripcionPlaga() {
        return descripcionPlaga;
    }

    public void setDescripcionPlaga(String descripcionPlaga) {
        this.descripcionPlaga = descripcionPlaga;
    }

    public String getControlPlaga() {
        return controlPlaga;
    }

    public void setControlPlaga(String controlPlaga) {
        this.controlPlaga = controlPlaga;
    }
}
