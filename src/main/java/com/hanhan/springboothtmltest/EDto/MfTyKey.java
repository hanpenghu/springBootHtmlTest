package main.java.com.hanhan.springboothtmltest.EDto;

public class MfTyKey {
    private String tyId;

    private String tyNo;

    public String getTyId() {
        return tyId;
    }

    public void setTyId(String tyId) {
        this.tyId = tyId == null ? null : tyId.trim();
    }

    public String getTyNo() {
        return tyNo;
    }

    public void setTyNo(String tyNo) {
        this.tyNo = tyNo == null ? null : tyNo.trim();
    }
}