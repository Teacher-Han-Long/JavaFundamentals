class Test {

  public static void main(String[] args) {

      try {
      	//stmnt1
      	//stmnt2
      	//stmnt3
      } catch (Exception e) {
      	//stmnt4
      } finally {
      	System.out.println(
      	"nothing to see here...the lesson is inside");//stmnt5
      }

      //stmnt6

  }

}

/**
case 1: if no exception -->  1,2,3,5,6 - normal termination
case 2: exception at stmnt2, catch block matches -->  1,4,5,6 -normal termination
case 3: exception at stmnt2, catch block doesn't match -->  1,5 -abnormal termination 
case 4: exception raised at stmnt4 -->  stmnt5 -abnormal termination
case 5: exception raised at stmnts 5,6 --> outside try-catch blk -abnormal termination 
**/