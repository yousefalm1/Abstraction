class Teacher extends Person {
    private String subject;
    private int yearsOfTeaching;

    public Teacher(String name, String subject, int yearsOfTeaching) {
        super(name);
        this.subject = subject;
        this.yearsOfTeaching = yearsOfTeaching;
    }

    @Override
    void describeRole() {
        System.out.println(getName() + " Teaches the subject " + subject);
    }

    public int getYearsOfTeaching() {
        System.out.println(getName() + " was teaching for " + yearsOfTeaching + " years");
        return 0;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", yearsOfTeaching=" + yearsOfTeaching +
                '}';
    }
}