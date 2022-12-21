package task7x5;

class ProcessString implements Inter
{
    private String s;

    public ProcessString(String s) {
        this.s = s;
    }

    @Override
    public int counter()
    {
        return s.length();
    }

    @Override
    public String symb135()
    {
        char[] chr = s.toCharArray();
        String str = "";
        for (int i = 0; i < chr.length; i += 2)
        {
            str += chr[i];
        }
        return str;
    }

    @Override
    public String inversion()
    {
        char[] chr = s.toCharArray();
        String str = "";
        for (int i = chr.length - 1; i >= 0; i--)
        {
            str += chr[i];
        }
        return str;
    }
}
