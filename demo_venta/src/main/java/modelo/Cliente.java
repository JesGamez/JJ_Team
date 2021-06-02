/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jesus
 */
public class Cliente {

    private int IDCLI;
    private String NOMAPECLI, DIRCLI, SEXCLI, TELCLI,ESTCLI;
    private int EDACLI;

    public Cliente() {
    }

    public Cliente(int IDCLI, String NOMAPECLI, String DIRCLI, String SEXCLI, String TELCLI, String ESTCLI, int EDACLI) {
        this.IDCLI = IDCLI;
        this.NOMAPECLI = NOMAPECLI;
        this.DIRCLI = DIRCLI;
        this.SEXCLI = SEXCLI;
        this.TELCLI = TELCLI;
        this.ESTCLI = ESTCLI;
        this.EDACLI = EDACLI;
    }

    

    public int getIDCLI() {
        return IDCLI;
    }

    public void setIDCLI(int IDCLI) {
        this.IDCLI = IDCLI;
    }

    public String getNOMAPECLI() {
        return NOMAPECLI;
    }

    public void setNOMAPECLI(String NOMAPECLI) {
        this.NOMAPECLI = NOMAPECLI;
    }

    public String getDIRCLI() {
        return DIRCLI;
    }

    public void setDIRCLI(String DIRCLI) {
        this.DIRCLI = DIRCLI;
    }

    public String getSEXCLI() {
        return SEXCLI;
    }

    public void setSEXCLI(String SEXCLI) {
        this.SEXCLI = SEXCLI;
    }

    public String getTELCLI() {
        return TELCLI;
    }

    public void setTELCLI(String TELCLI) {
        this.TELCLI = TELCLI;
    }

    public int getEDACLI() {
        return EDACLI;
    }

    public void setEDACLI(int EDACLI) {
        this.EDACLI = EDACLI;
    }

    public String getESTCLI() {
        return ESTCLI;
    }

    public void setESTCLI(String ESTCLI) {
        this.ESTCLI = ESTCLI;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "IDCLI=" + IDCLI + ", NOMAPECLI=" + NOMAPECLI + ", DIRCLI=" + DIRCLI + ", SEXCLI=" + SEXCLI + ", TELCLI=" + TELCLI + ", ESTCLI=" + ESTCLI + ", EDACLI=" + EDACLI + '}';
    }

    

}
