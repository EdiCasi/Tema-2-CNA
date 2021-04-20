import java.util.Date;

public class Fate
{
    private Date dataStart;
    private Date dataEnd;
    private String name;

    public Fate(Date dataStart, Date dataEnd, String name)
    {
        this.dataStart = dataStart;
        this.dataEnd = dataEnd;
        this.name = name;
    }

    public Date getDataStart()
    {
        return dataStart;
    }

    public void setDataStart(Date dataStart)
    {
        this.dataStart = dataStart;
    }

    public Date getDataEnd()
    {
        return dataEnd;
    }

    public void setDataEnd(Date dataEnd)
    {
        this.dataEnd = dataEnd;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean dateIsThisFate(Date date)
    {
        Date auxDate = date;
        auxDate.setYear(dataStart.getYear());
        if (auxDate.after(dataStart) && auxDate.before(dataEnd))
            return true;
        return false;
    }

    @Override
    public String toString()
    {
        return "Fate{" +
                "dataStart=" + dataStart +
                ", dataEnd=" + dataEnd +
                ", name='" + name + '\'' +
                '}';
    }
}
