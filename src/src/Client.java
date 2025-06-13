import java.awt.color.ICC_ColorSpace;

public class Client
{
    private String cpf;
    private String name;
    private String email;
    private String phoneNumber;

    public Client(String cpf, String name, String email, String phoneNumber)
    {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //getters
    public String getCpf()
    {
        return cpf;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    //setters
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPhoneUmber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String toString()
    {
        return  "\n---------Cliente---------"  +
                "\nNome: " + this.getName() +
                "\nCPF: " + this.getCpf() +
                "\nEmail: " + this.getEmail() +
                "\nphoneNumber" + this.getPhoneNumber() +
                "\n-------------------------";

    }
}
