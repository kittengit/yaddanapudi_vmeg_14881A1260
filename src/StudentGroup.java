import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		try{
			if(students==NULL)
			{
				throw new IllegalArgumentExceptionException
			}
		}
		catch(Exception e)
		{
			System.out.println("IllegalArgumentException");
		}
		for(int i=0;i<length;i++)
		{
			System.out.println(Students[i]);
		}
		
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		/*int ind;
		ind=index;*/
		try{
			for(i=student;i>=0;i++)
			{
				if(i<0 || i>=student)
				{
					throw new IllegalArgumentException;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("IllegalArgumentException");
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			Students[i]=Integer.parseInt(br.readLine());
		}
		return Students;
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		System.out.println(Student[index]);
		
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		b=integer.parseInt(br.readLine());
		
		
	}

	@Override
	public void addLast(Student student) {
		student.addLast(student);
	}

	@Override
	public void add(Student student, int index) {
		student.add(student,index);
	}

	@Override
	public void remove(int index) {
		student.remove(index);
	}

	@Override
	public void remove(Student student) {
		student.remove(student);
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		student.removeFromIndex(index);
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		student.removeFromElement(student);
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		student.removeToIndex(index);
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		student.removeToElement(student);
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here

		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
