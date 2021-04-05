/**
 * 
 */
import java.util.Arrays;
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
                 //System.out.println(Arrays.toString(values_2));
                //System.out.println(Basic.getMaximumOfSubarray(values_2));
                
                //System.out.println(Basic.getSumofMultiplesofValueUnderMax(3, 10));
                //System.out.println(Basic.getSumofMultplesof2ValuesUnderMax(3, 5, 10));
                //System.out.println(Basic.getSumofMultplesof2ValuesUnderMax(3, 5, 1000));
                
                //System.out.println(Basic.isEven(4));
                //System.out.println(Basic.isEven(3));
                //System.out.println(Basic.isOdd(4));
                //System.out.println(Basic.isOdd(3));
                
                //System.out.println(Basic.getFibonacci(10));
                
               //System.out.println(Basic.getNthFibonacciUnderValue(4000000));
               //System.out.println(Basic.getSumofEvenValuedTermsFibonacciUnder4Mil());
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
        
        public static int getMinimumValueofArray(int[] values){
            int minimum = 0;
            for(int value : values){
                if(value < minimum){
                    minimum = value;
                }
            }
            return minimum;
        }
        public static int getMaximumValueofArray(int[] values){
            int maximum = 0;
            for(int value : values) {
                if(value > maximum){
                    maximum = value;
                }
            }
            return maximum;
        }
        public static int getSumofMultiplesofValueUnderMax (int value, int max) {
            int sum = 0;
            for (int i = 1; i < max; i++){
                if((i % value) == 0){
                    sum += i;
                }
            }
            return sum;
        }
        public static int getSumofMultplesof2ValuesUnderMax(int value1, int value2, int max) {
            int sum = 0;
            for (int i = 1; i < max; i++){
                if(((i % value1) == 0) || ((i % value2) == 0)){
                    sum += i;
                }
            }
            return sum;
        }
        public static boolean isEven(int value) {
            return (value % 2) == 0;
        }
        public static boolean isOdd(int value) {
            return !Basic.isEven(value);
        }
        public static int getFibonacci (int nth) {
            if(nth == 0) {
                return 0;
            }
            else if(nth == 1) {
                return 1;
            }
            else {
                int sum = 0;
                sum = Basic.getFibonacci(nth-1)+Basic.getFibonacci(nth-2);
                return sum;
            }
        }
        /*
        * By considering the terms in the Fibonacci sequence whose values do not
        * exceed 4_000_000 , find the sum of the even valued terms
        */
        public static int getSumofEvenValuedTermsFibonacciUnder4Mil (){
            int maximalterm = 4_000_000;
            int maximalnth = 34;
            int sum = 0;
            for(int i = 0; i <= 34; i++){
                int calsum = Basic.getFibonacci(i);
                if(Basic.isEven(calsum)){
                    sum += calsum;
                }
            }
            
            return sum;
        }
        public static int getNthFibonacciUnderValue(int value){
            int nth = 0;
            for(int i = 0; i < value; i++ ){
                int calcsum = Basic.getFibonacci(i);
                if(value < calcsum){
                    return i;
                }
            }
            return nth;
        }
        public static boolean isPrime(int value){
            return false;
        }
}
