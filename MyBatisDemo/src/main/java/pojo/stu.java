package pojo;

import java.util.List;

public class stu {

    private Integer sid;
    private Integer tid;
    private List<Teacher> teacherList;
    private List<Student> studentList;

    public stu() {
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "stu{" +
                "sid=" + sid +
                ", tid=" + tid +
                ", teacherList=" + teacherList +
                ", studentList=" + studentList +
                '}';
    }
}
