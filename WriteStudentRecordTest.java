
public class WriteStudentRecordTest {

	public static void main(String[] args) {
		ReadStudentRecord app = new ReadStudentRecord();
			
			app.openFile();
			app.readRecord();
			app.closeFile();
	}

}
