package com.loi;

public class Exam {

    private String name;
    static int teller = 0;

    public Exam() {
        teller++;
        System.out.println("de contructor wordt aangeroepen");
    }

    public String getName(){
        return name;
    }

    /**
     * @param newName
     */
    public void setName(String newName) {
        this.name = newName;
        System.out.println("setName() is aangeroepen");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("het object wordt afgebroken");
        ++teller;
        super.finalize();
        ++teller;
    }

    static {
        System.out.println("De static wordt uitgevoerd");
    }
    {
        System.out.println("De initializer wordt uitgevoerd");
    }
}
