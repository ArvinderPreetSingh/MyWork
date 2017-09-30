package testcase;

public class test {

	public static void main(String[] args) throws Exception {
		
		DataPreparation data = new DataPreparation();
		data.prepareData("45566");
		System.out.println(data.data("MPC_PERC"));
		
		
	}

}
