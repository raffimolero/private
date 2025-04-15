class Student extends Person {
    public String IDnumber;

    public String getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber;
    }

    public Student(String iDnumber, String name) {
        super(name);
        IDnumber = iDnumber;
    }

    public Student() {
    }

}