package multilevelinheritance;
import java.util.Date;
public class LevelOneEmployeExtendsEmployee {
	 private int noOfShares;
	    private String authority;
	    
	    public LevelOneEmployeExtendsEmployee() {}
	    
	    public LevelOneEmployeExtendsEmployee(String name, long contactNo, Date dateOfBirth,String deptName, double baseSalary, int noOfShares, String authority) {
	    	super();
	        this.noOfShares = noOfShares;
	        this.authority=authority;
	    }

		public int getNoOfShares() {
			return noOfShares;
		}

		public void setNoOfShares(int noOfShares) {
			this.noOfShares = noOfShares;
		}

		public String getAuthority() {
			return authority;
		}

		public void setAuthority(String authority) {
			this.authority = authority;
		}

		public String toString() {
			return "LevelOneEmployee ["+super.toString()+"noOfShares=" + noOfShares + ", authority=" + authority + "]";
		}   


	}
