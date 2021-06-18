
public class StringManipulatorTest {

	public static void main(String[] args) {
		
		StringManipulator sM = new StringManipulator();

        String str = sM.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(str);

        StringManipulator manipulator = new StringManipulator();

        char letter = 'n';
        int a= manipulator.getIndexOrNull("Coding", letter);
        int b = manipulator.getIndexOrNull("Hola Mundo", letter);
        int c = manipulator.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1


        StringManipulator manipulator2 = new StringManipulator();
        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        int d = manipulator2.getIndexOrNull(word, subString);
        int e = manipulator2.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // -1


        StringManipulator manipulator3 = new StringManipulator();
        String word2 = manipulator3.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(word2); // olmundo
	

	}

}
