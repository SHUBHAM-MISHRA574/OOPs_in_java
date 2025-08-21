package Students;

//constructor is use initialise the memory to the instant variable

//static variable is same for all objects . memory for these vaiable is alloted only once.


    class Student{
        String Name;
        int Age;
        int RollNo;
        float Cgpa;
        static String collegeName="KIET";

        public  void study(int hrs){
            hrs=6;
            System.out.println("The Student"+Name+" is Studing "+hrs+" hrs in a day ");

        }

        public  void readandwrite(){

            System.out.println("The Student can read and write");

        }
        public static void reading(){
            System.out.println("HE is reading");
        }

        public void displayInfo(){
            System.out.println("Student name is "+Name+",Age is "+Age+",RollNo is "+RollNo+"and CGPA is" +Cgpa);
        }
        public static void main(String[] args) {
            Student student1=new Student();
            Student student2=new Student();
            student1.Name="Shubham";
            student1.Age=19;
            student1.RollNo=245;
            student1.Cgpa=8;


            Student.reading();//static function can directly access by the clas  name,whereas instatanious function need object to access.


            System.out.println("CollageName is "+student1.collegeName);
            Student.collegeName="ABES";
            System.out.println("CollageName is "+student2.collegeName);
            System.out.println("CollageName is "+student1.collegeName);
            student1.collegeName="RKGIT";
            System.out.println("CollageName is "+student1.collegeName);
            System.out.println("CollageName is "+student2.collegeName);

            student1.displayInfo();
        }
    }









