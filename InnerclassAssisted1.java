package innerclasses;

public class InnerclassAssisted1 {
	private String msg = "I am a programmer";
	
	class Inner {
		void hello() {System.out.println(msg+", Start programming");}
		}
		public static void main(String[] args) {
			InnerclassAssisted1 obj = new InnerclassAssisted1();
			InnerclassAssisted1.Inner in = obj.new Inner();
			in.hello();
		}
	}


