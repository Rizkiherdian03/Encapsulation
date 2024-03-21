import java.util.Scanner;;
public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Buat objek student
            System.out.print("Masukkan nama mahasiswa: ");
            String namaMahasiswa = scanner.nextLine();
            System.out.print("Masukkan alamat mahasiswa: ");
            String alamatMahasiswa = scanner.nextLine();
            Student student = new Student(namaMahasiswa, alamatMahasiswa);

            // Buat objek dosen
            System.out.print("Masukkan nama dosen: ");
            String namaDosen = scanner.nextLine();
            System.out.print("Masukkan alamat dosen: ");
            String alamatDosen = scanner.nextLine();
            Teacher teacher = new Teacher(namaDosen, alamatDosen);

            // Tambahkan mata kuliah ke dosen
            System.out.print("Masukkan jumlah mata kuliah yang diajar dosen: ");
            int numCourses = scanner.nextInt();
            for (int i = 0; i < numCourses; i++) {
                System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
                String courseName = scanner.nextLine();
                teacher.addCourse(courseName);
            }

            // Tampilkan informasi mahasiswa dan dosen
            System.out.println(student);
            System.out.println(teacher);
        }
    }
}
