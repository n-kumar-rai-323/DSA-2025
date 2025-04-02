public class studentGrade {
    public static int linearSearch(String[] students, int[] grades, String studentName){
       for(int i =0; i<students.length; i++){
        if(students[i].equals(studentName)){
            return grades[i];
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "David"};
        int[] grades = {90, 85, 95, 80};

        String StudentName = "Nishan";
        int grade1 = linearSearch(students, grades, StudentName);
        if(grade1 != -1){
            System.out.println(StudentName + "'s grade is: " + grade1);
        }else{
            System.out.println(StudentName + "not found.");
        }
    }
    
}
