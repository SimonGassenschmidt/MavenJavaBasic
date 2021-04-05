/**
 * 
 */

/**
 * @author Simon
 *
 */
public class Basic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 10;
		
		//System.out.println(Basic.getAddition(a, b));
		//System.out.println(Basic.getSubstraction(a, b));
		//System.out.println(Basic.getMultiplication(a, b));
		//System.out.println(Basic.getDivision(a, b));
		
		int [] values = {a, b};
		int [] emptyvalues = {};
		
		//System.out.println(Basic.getSumofIntArray(values));
		//System.out.println(Basic.getSumofIntArray(values)+Basic.getAddition(a, b));
		//System.out.println(Basic.getSumofIntArray(emptyvalues));
		
		//System.out.println(Basic.getModulo(a,b));
		//System.out.println(Basic.getModulo(b,a));
		
		//System.out.println(Basic.getNegativeSumofIntArray(values));
		String c = "Simon";
		String d = "Gassenschmidt";
		//System.out.println(Basic.getappendStringwithSpace(c, d));
		
		//System.out.println (Basic.getAddition(a, c));
		//System.out.println(a + c);
		
		double e = 424_499.2392;
		//System.out.println(e);
                
                 int[] values_2 =
        {-180, -170, -190, -120, 0, 40, -30, 50, 60, -40, -30, -30, 0, -10, -20, 20, 40, 50, 20,
            -40, -30, -30, 40, 100, 240, 260, 180, 200, 280, 290, 260, 240, 250, 270, 240, 200, 120,
            30, -20, -80, 20, 30, 30, 0, -20, -40, -60, -80, -120, -160, -180, -100};
                 //System.out.println(Basic.getMaximumOfSubarray(values_2));
	}
	public static int getAddition (int a, int b) {
		return a+b;
	}
	public static int getSubstraction (int a, int b) {
		return a-b;
	}
	public static int getMultiplication (int a, int b) {
		return a*b;
	}
	public static int getDivision(int a, int b) {
		return a/b;
	}
	public static int getModulo(int a, int b) {
		return a%b;
	}
	public static int getSumofIntArray (int [] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	public static int getNegativeSumofIntArray (int [] array) {
		int sub = 0;
		for(int i = 0; i < array.length; i++) {
			sub -= array[i];
		}
		return sub;
	}
	public static int getSubstractionElementbyElementArray (int [] array) {
		int sum = array[0];
		for(int i = 1; i < array.length; i++) {
			sum = Basic.getSubstraction(sum, array[i]);
		}
		return sum;
		
	}
	public static String getappendStringwithSpace (String a, String b) {
		String c = a + " " + b;
		return c;
	}
        public static int getMaximumOfSubarray(int[] values) {
            int maximum = 0;
            int calcmax = 0;
            
            for(int value : values) {
                calcmax += value;
                if (calcmax < 0) {
                    calcmax = 0;
                }
                if (calcmax > maximum) {
                    maximum = calcmax;
                }
            }
            return maximum;
        }
}
