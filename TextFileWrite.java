public class TextFileWrite {
	public static void main( String[] args ) {
		try {
			String msg;
			java.io.FileOutputStream fos = new java.io.FileOutputStream( args[0] );
			java.io.OutputStreamWriter osw = new java.io.OutputStreamWriter( fos );
			java.io.BufferedWriter bw = new java.io.BufferedWriter( osw );
			bw.write( "Line 1\n" );
			bw.write( "2行目\n" );
			bw.write( "No.3\n" );
			bw.flush();
			bw.close();
			osw.close();
			fos.close();
		} catch( Exception e ) {
			e.printStackTrace();
		}
	}
}
