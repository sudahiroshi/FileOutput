import java.io.*;
public class BinaryFileWrite {
	public static void main( String[] args ) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		byte[] data = { 0x41, 0x31, 0x21 };
		try {
			fos = new FileOutputStream( args[0] );
			bos = new BufferedOutputStream( fos );
			bos.write( data );
		} catch( Exception e ) {
			System.out.println( "Error!" );
		} finally {
			try {
				bos.flush();
				if( bos != null )	bos.close();
				if( fos != null )	fos.close();
			} catch( Exception e ){}
		}
	}
}
