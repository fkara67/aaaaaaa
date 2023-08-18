public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    double effectOfNote;
    double effectOfVerbalNote;
    int verbalNote;

    public Course(String name, String code, String prefix,double effectOfNote) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.effectOfNote = effectOfNote;
        this.effectOfVerbalNote = 1.0 - effectOfNote;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public double getAvgNote() {
        //System.out.println("getAvgNote() " + note * effectOfNote + verbalNote * effectOfVerbalNote + "\n");
        return (this.note * this.effectOfNote) + (this.verbalNote * this.effectOfVerbalNote);
    }
}