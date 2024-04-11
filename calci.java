import java.util.Scanner;


class Complex {

	public int real;
	public int img;
	
	//function to  add two complex number 	
	 public String addComplex(String s1,  String s2) {
        	int real1 = Integer.parseInt(s1.substring(0,s1.indexOf("+")));
        	int img1 = Integer.parseInt(s1.substring((s1.indexOf("+")+1),(s1.length()-1)));
        	int real2 = Integer.parseInt(s2.substring(0,s2.indexOf("+")));
        	int img2 = Integer.parseInt(s2.substring((s2.indexOf("+")+1),(s2.length()-1)));
        	int realSum = real1+real2;
        	int imgSum = img1+img2; 
        	
        	return realSum+"+"+imgSum+"i";
    	}
    	
    	//function to subtract two complex number
    	public String subtractComplex(String s1,  String s2) {
        	int real1 = Integer.parseInt(s1.substring(0,s1.indexOf("+")));
        	int img1 = Integer.parseInt(s1.substring((s1.indexOf("+")+1),(s1.length()-1)));
        	int real2 = Integer.parseInt(s2.substring(0,s2.indexOf("+")));
        	int img2 = Integer.parseInt(s2.substring((s2.indexOf("+")+1),(s2.length()-1)));
        	int realSum = real1-real2;
        	int imgSum = img1-img2; 
        	
        	return realSum+"+"+imgSum+"i";
    	}
    	
    	//function to multiply two complex number
    	public String multiplyComplex(String s1, String s2) {
        	int real1 = Integer.parseInt(s1.substring(0,s1.indexOf("+")));
        	int img1 = Integer.parseInt(s1.substring((s1.indexOf("+")+1),(s1.length()-1)));
        	int real2 = Integer.parseInt(s2.substring(0,s2.indexOf("+")));
        	int img2 = Integer.parseInt(s2.substring((s2.indexOf("+")+1),(s2.length()-1)));
        	int realSum = real1*real2;
        	int imgSum = img1*img2; 
        	
        	return realSum+"+"+imgSum+"i";
    	}
    	
    	//function to divide two complex number
    	public String divideComplex(String s1,  String s2) {
    		double realSum=0;
        	double imgSum=0;
        	double real1 =Integer.parseInt(s1.substring(0,s1.indexOf("+")));
        	double img1 = Integer.parseInt(s1.substring((s1.indexOf("+")+1),(s1.length()-1)));
        	double real2 = Integer.parseInt(s2.substring(0,s2.indexOf("+")));
        	double img2 = Integer.parseInt(s2.substring((s2.indexOf("+")+1),(s2.length()-1)));
        	
        	//handling exception if the Arithmetic exception if divide by zero exception occurs
       		if(real2==0){
       			try{
        	 		realSum = real1/real2;
        	 		imgSum = img1/img2; 
        	
        		}
        		catch(ArithmeticException e){
        		}
       			return "error occur";
       		}
       		
       		else{
        		 realSum = real1/real2;
        		 imgSum = img1/img2; 
        	}
        	return realSum+"+"+imgSum+"i";
    	}
    	
    	//standard form of priniting  complex numbers
    	public String toString(){
	 	return real+"+"+img+"i";
	 }
}


class calci extends Complex{

	//function to add two integers
	public double add(double a, double b) {
        	return a + b;
    	}
	
	//function to subtract two integers
	public double subtract(double a, double b) {
        	return a - b;
    	}
	//function to multiply two integers
	public double multiply(double a, double b) {
        	return a * b;
   	}
   	
	//function to divide two integers
	public double divide(double a, double b) {
		return a / b;
    	}

	//function to find remainder by dividing two integers
	public double modulo(double a, double b) {
        	return a % b;
    	}
    
	//function to get number for integers raised to another integer
    	public double power(double a, double b) {
    		double answer = a;	
    		for(int i=1;i<b;i++){
			answer = answer*a;
    		}
        	return answer;
    	}
    
    	//function to get square of the given integer
   	public double square(double a) {
        	return a * a;
   	}
   	
   	//initialize numbers for fraction
   	double numerator;
	double denominator;
	double dividend;
	double divisor;
	double quotient;
	double decimal_value;
	double remainder;
	
	//function to convert two numbers into fraction form
   	//function to get the lowest form possible by dividing fraction by same number
	public String fraction(double a,double b){
	   	int i;
		int lastNumber =1;
	   	String fr = new String();
	   		for(i=1;i<a;i++){
	   			if(a%i == 0 && b%i == 0){
		        	lastNumber =i;
	   			}
	   		}
	   		double n = a/lastNumber;
	   		double d = b/lastNumber;
	   		fr =fr.valueOf(n)+"_| " +fr.valueOf(d);
	   		return fr;
   	}
   	
   	//function to convert fraction to mixed fraction
   	public String mixedFraction(double numerator , double denominator){
   		this.numerator = numerator;
   		this.denominator = denominator;
   		String mixed = new String();
   		double mixedNum;
   		mixedNum=numerator/denominator;
   		numerator = numerator%denominator;
   		mixed = mixed.valueOf(mixedNum)+ "_| " + mixed.valueOf(numerator) + " _| " +mixed.valueOf(denominator);
   		return mixed;
   	}
   	
   	//function to get the result in decimal form
   	public double getResult(double numerator , double denominator){
   		double result = numerator/denominator; 
   		return result;
   	}
   	
   
    public static void main(String[] args) {
    
    	Scanner scanner = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	
	boolean running = true;
	
        while (running) {
		    System.out.println("For integers Enter operations : '#' \n");
		    System.out.println("For complex numbers operation enter ~ \n ");
			System.out.println("For mixed fraction operation enter | \n ");
	       		System.out.println("or 'q' to quit: \n");
		    char operation = scanner.next().charAt(0);
		    if (operation == 'q') {
		        running = false;
		        continue;
		    }
		
		switch(operation){
			
			
			case  '#' : 
				// Take input for the two numbers
				System.out.print("Enter first number: ");
				double a1 = scanner.nextDouble();
				System.out.print("Enter second number: ");
				double a2 = scanner.nextDouble();
				System.out.println("For integers Enter operations : (+, -, *, /,% ,^ ) \n");
				calci c1 = new calci();
				char sign1 = scanner.next().charAt(0);

				switch (sign1){
					case  '+' : 
						System.out.println(c1.add(a1, a2));
						break;
					case  '-' : 
						System.out.println(c1.subtract(a1, a2));
						break;
					case  '*' : 
						System.out.println(c1.multiply(a1, a2));
						break;
					case  '/' : 
						System.out.println(c1.divide(a1, a2));
						break;
					case  '%' : 
						System.out.println(c1.modulo(a1, a2));
						break;
					case  '^' : 
						System.out.println(c1.power(a1, a2));
						break;
				}
				break;
				
			case  '|' : 
				// Take input for the two numbers for fractions
				System.out.print("Enter first number: ");
				double b1 = scanner.nextDouble();
				System.out.print("Enter second number: ");
				double b2 = scanner.nextDouble();
				calci c2 = new calci();
				System.out.println("Enter operation for fraction : '_' for fraction \t  '|' for converting into mixed fraction \t '=' for getting answer in lowest terms \n");
				char sign2 = sc1.next().charAt(0);
				
				switch (sign2){
					case  '_':
					System.out.println(c2.fraction(b1, b2));
					break;
			 		case  '|':
			 		System.out.println(c2.mixedFraction(b1, b2));
					case  '=' :
					System.out.println(c2.getResult(b1, b2));
				}
				break;
				
			case '~' : 
				double real;
				double img;
				System.out.println("Enter two complex numbers: \n");
				Scanner scanner1 = new Scanner(System.in);
				Scanner scanner2 = new Scanner(System.in);
				Scanner scanner3 = new Scanner(System.in);
				Scanner scanner4 = new Scanner(System.in);
				Scanner scanner5 = new Scanner(System.in);
				
				Complex obj1 = new Complex();
				Complex obj2 = new Complex();
				
				// Take input for the two numbers for complex numbers
				System.out.print("Enter first number real part: ");
				 obj1.real = scanner1.nextInt();
				System.out.print("Enter first number imaginary part : ");
				 obj1.img = scanner2.nextInt();
				System.out.print("Enter second number real part : ");
				 obj2.real = scanner3.nextInt();
				System.out.print("Enter second number imaginary part : ");
				 obj2.img = scanner4.nextInt();
				 String s1 = obj1.toString();
			 	 String s2 = obj2.toString();
				System.out.println("Enter the operation (+ , -, *, / )\n");
				char sign3 = scanner.next().charAt(0);

				switch (sign3){
					case  '+':
					System.out.println(obj1.addComplex(s1, s2));
					break;
			 		case  '-':
			 		System.out.println(obj1.subtractComplex(s1, s2));
					case  '*' :
					System.out.println(obj1.multiplyComplex(s1, s2));
					case  '/' :
					System.out.println(obj1.divideComplex(s1, s2));
				}
				break;		
			default :
				System.out.println("invalid operation");
			}
    		}	
    		System.out.println("Calculator is closed.");
    
        	try{
        		scanner.close();
        	}
        	catch(Exception e){
        		
        	}
	}
}

