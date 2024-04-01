package MEMEBER;
import java.math.BigDecimal;
import java.sql.Date;

public class MEMBER {
    private int EMPNO; // 번호
    private String ID;
    private String PW;
    private BigDecimal PH;
    private String EMAIL;
    private String NICKNAME;
    private String ADMIN;

    public MEMBER(int empno, String id, String pw, BigDecimal ph,
                  String email, String nickname, String admin){
    this.EMPNO = empno;
    this.ID= id;
    this.PW = pw;
    this.PH = ph;
    this.EMAIL = email;
    this.NICKNAME = nickname;
    this.ADMIN = admin;
    }

    public int getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(int EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public BigDecimal getPH() {
        return PH;
    }

    public void setPH(BigDecimal PH) {
        this.PH = PH;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getNICKNAME() {
        return NICKNAME;
    }

    public void setNICKNAME(String NICKNAME) {
        this.NICKNAME = NICKNAME;
    }

    public String getADMIN() {
        return ADMIN;
    }

    public void setADMIN(String ADMIN) {
        this.ADMIN = ADMIN;
    }
}