package emp;

public class Employee {
	
		private String ename,email;

		

		public String getename() {
			return ename;
		}

		public void setename(String ename) {
			this.ename = ename;
		}

		public String getemail() {
			return email;
		}

		public void setemail(String email) {
			this.email = email;
		}
		
		
		@Override
		public String toString() {
			return "Employee [ename=" + ename + ", email=" + email + "]";
		}

	}


