public class Film4 {

    static class Student {
        private String clothes;
        private String sex;
        private boolean betIsLose;

        Student(String sex, boolean betIsLose) {
            this.sex = sex;
            this.betIsLose = betIsLose;
        }

        public String getClothes() {
            return clothes;
        }

        public void setClothes(String clothes) {
            this.clothes = clothes;
        }

        void bet(Student student) {
            betIsLose = !student.betIsLose;
        }

        void prepareToMeeting() {
            if (!betIsLose) {
                clothes = "dress";
            }
        }
    }


    private static void goToMeeting(Student fStudent, Student sStudent) {
        fStudent.prepareToMeeting();
        sStudent.prepareToMeeting();
    }

    public static void main(String args[]){
        Student murphy = new Student("male", false);
        Student libby = new Student("female", true);

        murphy.bet(libby);

        goToMeeting(murphy, libby);
    }

}
