package accountHandling;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthon Steiness
 */
public class Account
{

    private String usrName;
    private String pswd;
    private int id;

    public Account(String usrName, String pswd, int id)
    {
        this.usrName = usrName;
        this.pswd = pswd;
        this.id = id;
    }

    public String getUsrName()
    {
        return usrName;
    }

    public String getPswd()
    {
        return pswd;
    }

    public void setUsrName(String usrName)
    {
        this.usrName = usrName;
    }

    public void setPswd(String pswd)
    {
        this.pswd = pswd;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Account{" + "usrName=" + usrName + ", pswd=" + pswd + ", id=" + id + '}';
    }

}
